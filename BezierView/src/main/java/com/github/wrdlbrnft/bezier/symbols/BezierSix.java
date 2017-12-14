package com.github.wrdlbrnft.bezier.symbols;

import com.github.wrdlbrnft.bezier.BezierPoint;

/**
 * Created by kapeller on 28/04/15.
 */
class BezierSix extends BezierSymbolImpl {

    private static final BezierPoint[] mEndPoints = {
            new BezierPoint(0.328f, 0.000f),
            new BezierPoint(0.328f, 0.000f),
            new BezierPoint(0.008f, 0.530f),
            new BezierPoint(0.543f, 0.530f),
            new BezierPoint(0.045f, 0.400f)
    };
    private static final BezierPoint[] mControlPoints = {
            new BezierPoint(0.328f, 0.000f),
            new BezierPoint(0.132f, 0.295f),
            new BezierPoint(0.037f, 0.940f),
            new BezierPoint(0.508f, 0.230f)
    };
    private static final BezierPoint[] mSecondControlPoints = {
            new BezierPoint(0.328f, 0.000f),
            new BezierPoint(0.017f, 0.360f),
            new BezierPoint(0.567f, 0.860f),
            new BezierPoint(0.143f, 0.220f)
    };

    BezierSix() {
        super(mEndPoints, mControlPoints, mSecondControlPoints);
    }
}
