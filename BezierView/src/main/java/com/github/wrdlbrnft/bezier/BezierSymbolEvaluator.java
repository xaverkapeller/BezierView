package com.github.wrdlbrnft.bezier;

import android.animation.TypeEvaluator;

import com.github.wrdlbrnft.bezier.symbols.BezierSymbol;

/**
 * Created by kapeller on 04/01/16.
 */
public class BezierSymbolEvaluator implements TypeEvaluator<BezierSymbol> {

    @Override
    public BezierSymbol evaluate(float fraction, BezierSymbol startValue, BezierSymbol endValue) {

        final BezierPoint[] startEndPoints = startValue.getEndPoints();
        final BezierPoint[] startFirstControlPoints = startValue.getFirstControlPoints();
        final BezierPoint[] startSecondControlPoints = startValue.getSecondControlPoints();

        final BezierPoint[] endEndPoints = endValue.getEndPoints();
        final BezierPoint[] endFirstControlPoints = endValue.getFirstControlPoints();
        final BezierPoint[] endSecondControlPoints = endValue.getSecondControlPoints();

        final BezierPoint[] interpolatedEndpoints = new BezierPoint[5];
        final BezierPoint[] interpolatedControlPoints = new BezierPoint[4];
        final BezierPoint[] interpolatedSecondControlPoints = new BezierPoint[4];

        interpolatedEndpoints[0] = interpolatePoints(startEndPoints[0], endEndPoints[0], fraction);

        for (int i = 0; i < 4; i++) {
            interpolatedEndpoints[i + 1] = interpolatePoints(startEndPoints[i + 1], endEndPoints[i + 1], fraction);
            interpolatedControlPoints[i] = interpolatePoints(startFirstControlPoints[i], endFirstControlPoints[i], fraction);
            interpolatedSecondControlPoints[i] = interpolatePoints(startSecondControlPoints[i], endSecondControlPoints[i], fraction);
        }

        return BezierSymbol.of(
                interpolatedEndpoints,
                interpolatedControlPoints,
                interpolatedSecondControlPoints
        );
    }

    private BezierPoint interpolatePoints(BezierPoint from, BezierPoint to, float fraction) {
        final float x = from.x + (to.x - from.x) * fraction;
        final float y = from.y + (to.y - from.y) * fraction;
        return new BezierPoint(x, y);
    }
}
