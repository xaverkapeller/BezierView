package com.github.wrdlbrnft.bezier.symbols;

import com.github.wrdlbrnft.bezier.BezierPoint;

/**
 * Created by kapeller on 28/04/15.
 */
class BezierTwo extends BezierSymbolImpl {

    private static final BezierPoint[] mEndPoints = {
            new BezierPoint(0.058f, 0.200f),
            new BezierPoint(0.500f, 0.205f),
            new BezierPoint(0.318f, 0.510f),
            new BezierPoint(0.063f, 0.785f),
            new BezierPoint(0.513f, 0.785f)
    };
    private static final BezierPoint[] mControlPoints = {
            new BezierPoint(0.072f, -0.090f),
            new BezierPoint(0.500f, 0.290f),
            new BezierPoint(0.248f, 0.590f),
            new BezierPoint(0.063f, 0.785f)
    };
    private static final BezierPoint[] mSecondControlPoints = {
            new BezierPoint(0.492f, -0.080f),
            new BezierPoint(0.427f, 0.390f),
            new BezierPoint(0.148f, 0.675f),
            new BezierPoint(0.513f, 0.785f)
    };

    BezierTwo() {
        super(mEndPoints, mControlPoints, mSecondControlPoints);
    }
}
