package com.github.wrdlbrnft.bezier.symbols;

import com.github.wrdlbrnft.bezier.BezierPoint;

/**
 * Created by kapeller on 28/04/15.
 */
class BezierEight extends BezierSymbolImpl {

    private static final BezierPoint[] mEndPoints = {
            new BezierPoint(0.282f, 0.380f),
            new BezierPoint(0.282f, -0.005f),
            new BezierPoint(0.282f, 0.380f),
            new BezierPoint(0.282f, 0.795f),
            new BezierPoint(0.282f, 0.380f),
    };
    private static final BezierPoint[] mControlPoints = {
            new BezierPoint(-0.002f, 0.375f),
            new BezierPoint(0.548f, -0.005f),
            new BezierPoint(-0.002f, 0.380f),
            new BezierPoint(0.548f, 0.795f),
    };
    private static final BezierPoint[] mSecondControlPoints = {
            new BezierPoint(-0.002f, -0.005f),
            new BezierPoint(0.548f, 0.380f),
            new BezierPoint(-0.042f, 0.795f),
            new BezierPoint(0.548f, 0.380f),
    };

    BezierEight() {
        super(mEndPoints, mControlPoints, mSecondControlPoints);
    }
}
