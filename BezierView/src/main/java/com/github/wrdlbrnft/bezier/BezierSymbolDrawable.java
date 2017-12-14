package com.github.wrdlbrnft.bezier;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PixelFormat;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.support.annotation.ColorInt;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;

import com.github.wrdlbrnft.bezier.symbols.BezierSymbol;

/**
 * Created by kapeller on 04/01/16.
 */
public class BezierSymbolDrawable extends Drawable {

    private static final BezierSymbolEvaluator EVALUATOR = new BezierSymbolEvaluator();

    private static final BezierSymbol DEFAULT_SYMBOL = BezierSymbol.of(' ');

    public static final int DEFAULT_COLOR = Color.WHITE;
    public static final float DEFAULT_STROKE_WIDTH = 1.0f;

    private final Paint mPaint;

    private final PlaceHolderSymbol mSymbol = new PlaceHolderSymbol();

    public BezierSymbolDrawable() {
        mPaint = createDefaultPaint();
        setSymbol(DEFAULT_SYMBOL);
    }

    public Animator createAnimator(BezierSymbol target) {
        return createAnimator(mSymbol, target);
    }

    public Animator createAnimator(BezierSymbol from, BezierSymbol to) {
        final ValueAnimator animator = ValueAnimator.ofObject(EVALUATOR, from, to);
        animator.addUpdateListener(animation -> {
            final BezierSymbol symbol = (BezierSymbol) animation.getAnimatedValue();
            setSymbol(symbol);
        });
        return animator;
    }

    public void setSymbol(BezierSymbol symbol) {
        mSymbol.set(symbol);
        invalidateSelf();
    }

    public void setColor(@ColorInt int color) {
        mPaint.setColor(color);
    }

    public void setStrokeWidth(float width) {
        mPaint.setStrokeWidth(width);
    }

    @Override
    public void setAlpha(int alpha) {
        mPaint.setAlpha(alpha);
    }

    @Override
    public int getAlpha() {
        return mPaint.getAlpha();
    }

    @Override
    public void setColorFilter(@Nullable ColorFilter colorFilter) {
        mPaint.setColorFilter(colorFilter);
    }

    @Override
    public int getOpacity() {
        return PixelFormat.TRANSLUCENT;
    }

    public void setAntiAlias(boolean antiAlias) {
        mPaint.setAntiAlias(antiAlias);
    }

    @NonNull
    protected Paint createDefaultPaint() {
        final Paint paint = new Paint();
        paint.setAntiAlias(true);
        paint.setStyle(Paint.Style.STROKE);
        paint.setColor(DEFAULT_COLOR);
        paint.setStrokeCap(Paint.Cap.ROUND);
        paint.setStrokeJoin(Paint.Join.ROUND);
        paint.setStrokeWidth(DEFAULT_STROKE_WIDTH);
        return paint;
    }

    @Override
    public int getIntrinsicHeight() {
        return -1;
    }

    @Override
    public int getIntrinsicWidth() {
        return -1;
    }

    @Override
    public void draw(@NonNull Canvas canvas) {
        final Path path = mSymbol.getPath();
        canvas.drawPath(path, mPaint);
    }

    @Override
    protected void onBoundsChange(Rect bounds) {
        super.onBoundsChange(bounds);
        mSymbol.setBounds(bounds);
    }

    private static class PlaceHolderSymbol implements BezierSymbol {

        private final BezierPoint[] mEndPoints = new BezierPoint[5];
        private final BezierPoint[] mFirstControlPoints = new BezierPoint[4];
        private final BezierPoint[] mSecondControlPoints = new BezierPoint[4];

        private final Path mPath = new Path();
        private final Rect mBounds = new Rect(0, 0, 1, 1);

        @Override
        public BezierPoint[] getEndPoints() {
            return mEndPoints;
        }

        @Override
        public BezierPoint[] getFirstControlPoints() {
            return mFirstControlPoints;
        }

        @Override
        public BezierPoint[] getSecondControlPoints() {
            return mSecondControlPoints;
        }

        public Path getPath() {
            return mPath;
        }

        public void setBounds(Rect bounds) {
            mBounds.set(bounds);
            updatePath();
        }

        public void set(BezierSymbol symbol) {
            System.arraycopy(symbol.getEndPoints(), 0, mEndPoints, 0, mEndPoints.length);
            System.arraycopy(symbol.getFirstControlPoints(), 0, mFirstControlPoints, 0, mFirstControlPoints.length);
            System.arraycopy(symbol.getSecondControlPoints(), 0, mSecondControlPoints, 0, mSecondControlPoints.length);
            updatePath();
        }

        private void updatePath() {
            mPath.reset();

            final BezierPoint translation = mEndPoints[0];
            mPath.moveTo(translation.x, translation.y);

            for (int i = 0; i < 4; i++) {
                final BezierPoint point1 = mFirstControlPoints[i];
                final BezierPoint point2 = mSecondControlPoints[i];
                final BezierPoint point3 = mEndPoints[i + 1];

                mPath.cubicTo(point1.x, point1.y,
                        point2.x, point2.y,
                        point3.x, point3.y);
            }

            final Matrix matrix = new Matrix();
            matrix.preScale(mBounds.width(), mBounds.height());
            matrix.postTranslate(mBounds.left, mBounds.top);
            mPath.transform(matrix);
        }
    }
}
