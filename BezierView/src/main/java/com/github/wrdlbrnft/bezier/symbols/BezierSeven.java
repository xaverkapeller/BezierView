package com.github.wrdlbrnft.bezier.symbols;

import com.github.wrdlbrnft.bezier.BezierPoint;

/**
 * Created by kapeller on 28/04/15.
 */
class BezierSeven extends BezierSymbolImpl {

    private static final BezierPoint[] mEndPoints = {
            new BezierPoint(0.013f, 0.005f),
            new BezierPoint(0.567f, 0.005f),
            new BezierPoint(0.381f, 0.267f),
            new BezierPoint(0.194f, 0.533f),
            new BezierPoint(0.008f, 0.805f)
    };
    private static final BezierPoint[] mControlPoints = {
            new BezierPoint(0.013f, 0.005f),
            new BezierPoint(0.567f, 0.005f),
            new BezierPoint(0.381f, 0.267f),
            new BezierPoint(0.194f, 0.533f)
    };
    private static final BezierPoint[] mSecondControlPoints = {
            new BezierPoint(0.567f, 0.005f),
            new BezierPoint(0.381f, 0.267f),
            new BezierPoint(0.194f, 0.533f),
            new BezierPoint(0.008f, 0.805f)
    };

    BezierSeven() {
        super(mEndPoints, mControlPoints, mSecondControlPoints);
    }
}
