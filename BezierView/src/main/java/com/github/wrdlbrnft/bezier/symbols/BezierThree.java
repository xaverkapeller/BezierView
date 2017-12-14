package com.github.wrdlbrnft.bezier.symbols;

import com.github.wrdlbrnft.bezier.BezierPoint;

/**
 * Created by kapeller on 28/04/15.
 */
class BezierThree extends BezierSymbolImpl {

    private static final BezierPoint[] mEndPoints = {
            new BezierPoint(0.094f, 0.170f),
            new BezierPoint(0.275f, 0.0f),
            new BezierPoint(0.275f, 0.380f),
            new BezierPoint(0.278f, 0.800f),
            new BezierPoint(0.060f, 0.615f)
    };
    private static final BezierPoint[] mControlPoints = {
            new BezierPoint(0.093f, 0.035f),
            new BezierPoint(0.558f, 0.0f),
            new BezierPoint(0.567f, 0.380f),
            new BezierPoint(0.048f, 0.800f)
    };
    private static final BezierPoint[] mSecondControlPoints = {
            new BezierPoint(0.208f, 0.0f),
            new BezierPoint(0.508f, 0.380f),
            new BezierPoint(0.528f, 0.800f),
            new BezierPoint(0.058f, 0.650f)
    };

    BezierThree() {
        super(mEndPoints, mControlPoints, mSecondControlPoints);
    }
}
