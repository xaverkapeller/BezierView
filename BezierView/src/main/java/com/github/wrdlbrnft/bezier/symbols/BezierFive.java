package com.github.wrdlbrnft.bezier.symbols;

import com.github.wrdlbrnft.bezier.BezierPoint;

/**
 * Created by kapeller on 28/04/15.
 */
class BezierFive extends BezierSymbolImpl {

    private static final BezierPoint[] mEndPoints = {
            new BezierPoint(0.508f, 0.000f),
            new BezierPoint(0.233f, 0.000f),
            new BezierPoint(0.138f, 0.290f),
            new BezierPoint(0.503f, 0.545f),
            new BezierPoint(0.002f, 0.670f)
    };
    private static final BezierPoint[] mControlPoints = {
            new BezierPoint(0.233f, 0.000f),
            new BezierPoint(0.138f, 0.290f),
            new BezierPoint(0.263f, 0.230f),
            new BezierPoint(0.477f, 0.815f)
    };
    private static final BezierPoint[] mSecondControlPoints = {
            new BezierPoint(0.233f, 0.000f),
            new BezierPoint(0.138f, 0.290f),
            new BezierPoint(0.503f, 0.325f),
            new BezierPoint(0.118f, 0.890f)
    };

    BezierFive() {
        super(mEndPoints, mControlPoints, mSecondControlPoints);
    }
}
