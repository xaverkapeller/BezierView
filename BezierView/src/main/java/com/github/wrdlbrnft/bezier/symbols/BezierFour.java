package com.github.wrdlbrnft.bezier.symbols;

import com.github.wrdlbrnft.bezier.BezierPoint;

/**
 * Created by kapeller on 28/04/15.
 */
class BezierFour extends BezierSymbolImpl {

    private static final BezierPoint[] mEndPoints = {
            new BezierPoint(0.560f, 0.630f),
            new BezierPoint(0.000f, 0.630f),
            new BezierPoint(0.429f, 0.025f),
            new BezierPoint(0.429f, 0.630f),
            new BezierPoint(0.429f, 0.795f)
    };
    private static final BezierPoint[] mControlPoints = {
            new BezierPoint(0.560f, 0.630f),
            new BezierPoint(0.000f, 0.630f),
            new BezierPoint(0.429f, 0.025f),
            new BezierPoint(0.429f, 0.630f)
    };
    private static final BezierPoint[] mSecondControlPoints = {
            new BezierPoint(0.000f, 0.630f),
            new BezierPoint(0.429f, 0.025f),
            new BezierPoint(0.429f, 0.630f),
            new BezierPoint(0.429f, 0.795f)
    };

    BezierFour() {
        super(mEndPoints, mControlPoints, mSecondControlPoints);
    }
}
