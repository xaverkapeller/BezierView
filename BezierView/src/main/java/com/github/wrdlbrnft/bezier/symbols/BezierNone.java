package com.github.wrdlbrnft.bezier.symbols;

import com.github.wrdlbrnft.bezier.BezierPoint;

/**
 * Created by kapeller on 28/04/15.
 */
class BezierNone extends BezierSymbolImpl {

    private static final BezierPoint[] mEndPoints = {
            new BezierPoint(0.5f, 0.5f),
            new BezierPoint(0.5f, 0.5f),
            new BezierPoint(0.5f, 0.5f),
            new BezierPoint(0.5f, 0.5f),
            new BezierPoint(0.5f, 0.5f)
    };

    private static final BezierPoint[] mControlPoints = {
            new BezierPoint(0.5f, 0.5f),
            new BezierPoint(0.5f, 0.5f),
            new BezierPoint(0.5f, 0.5f),
            new BezierPoint(0.5f, 0.5f)
    };

    private static final BezierPoint[] mSecondControlPoints = {
            new BezierPoint(0.5f, 0.5f),
            new BezierPoint(0.5f, 0.5f),
            new BezierPoint(0.5f, 0.5f),
            new BezierPoint(0.5f, 0.5f)
    };

    BezierNone() {
        super(mEndPoints, mControlPoints, mSecondControlPoints);
    }
}
