package com.github.wrdlbrnft.bezier.symbols;

import com.github.wrdlbrnft.bezier.BezierPoint;

/**
 * Created by kapeller on 28/04/15.
 */
class BezierOne extends BezierSymbolImpl {

    private static final BezierPoint[] mEndPoints = {
            new BezierPoint(0.1625f, 0.0f),
            new BezierPoint(0.30f, 0.0f),
            new BezierPoint(0.30f, 0.8f),
            new BezierPoint(0.30f, 0.8f),
            new BezierPoint(0.30f, 0.8f),
    };
    private static final BezierPoint[] mControlPoints = {
            new BezierPoint(0.1625f, 0.0f),
            new BezierPoint(0.30f, 0.0f),
            new BezierPoint(0.30f, 0.8f),
            new BezierPoint(0.30f, 0.8f),
    };
    private static final BezierPoint[] mSecondControlPoints = {
            new BezierPoint(0.30f, 0.0f),
            new BezierPoint(0.30f, 0.8f),
            new BezierPoint(0.30f, 0.8f),
            new BezierPoint(0.30f, 0.8f),
    };


    BezierOne() {
        super(mEndPoints, mControlPoints, mSecondControlPoints);
    }
}
