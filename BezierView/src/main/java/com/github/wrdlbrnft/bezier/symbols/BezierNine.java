package com.github.wrdlbrnft.bezier.symbols;

import com.github.wrdlbrnft.bezier.BezierPoint;

/**
 * Created by kapeller on 28/04/15.
 */
class BezierNine extends BezierSymbolImpl {

    private static final BezierPoint[] mEndPoints = {
            new BezierPoint(0.510f, 0.400f),
            new BezierPoint(0.013f, 0.270f),
            new BezierPoint(0.548f, 0.270f),
            new BezierPoint(0.227f, 0.800f),
            new BezierPoint(0.227f, 0.800f)
    };
    private static final BezierPoint[] mControlPoints = {
            new BezierPoint(0.398f, 0.580f),
            new BezierPoint(-0.013f, -0.060f),
            new BezierPoint(0.538f, 0.440f),
            new BezierPoint(0.227f, 0.800f)
    };
    private static final BezierPoint[] mSecondControlPoints = {
            new BezierPoint(0.048f, 0.570f),
            new BezierPoint(0.518f, -0.140f),
            new BezierPoint(0.422f, 0.505f),
            new BezierPoint(0.227f, 0.800f)
    };

    BezierNine() {
        super(mEndPoints, mControlPoints, mSecondControlPoints);
    }
}
