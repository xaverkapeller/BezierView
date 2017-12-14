package com.github.wrdlbrnft.bezier.symbols;

import com.github.wrdlbrnft.bezier.BezierPoint;

/**
 * Created by kapeller on 28/04/15.
 */
class BezierBox extends BezierSymbolImpl {

    private static final BezierPoint[] mEndPoints = {
            new BezierPoint(0.025f, 0.025f),
            new BezierPoint(0.025f, 0.975f),
            new BezierPoint(0.975f, 0.975f),
            new BezierPoint(0.975f, 0.025f),
            new BezierPoint(0.025f, 0.025f)
    };

    private static final BezierPoint[] mControlPoints = {
            new BezierPoint(0.025f, 0.025f),
            new BezierPoint(0.025f, 0.975f),
            new BezierPoint(0.975f, 0.025f),
            new BezierPoint(0.025f, 0.025f)
    };

    private static final BezierPoint[] mSecondControlPoints = {
            new BezierPoint(0.025f, 0.025f),
            new BezierPoint(0.025f, 0.975f),
            new BezierPoint(0.975f, 0.025f),
            new BezierPoint(0.025f, 0.025f)
    };

    BezierBox() {
        super(mEndPoints, mControlPoints, mSecondControlPoints);
    }
}
