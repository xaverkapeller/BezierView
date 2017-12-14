package com.github.wrdlbrnft.bezier.symbols;

import com.github.wrdlbrnft.bezier.BezierPoint;

/**
 * Created by kapeller on 28/04/15.
 */
class BezierCircle extends BezierSymbolImpl {

    private static final BezierPoint[] mEndPoints = {
            new BezierPoint(0.430625f, 0.5f),
            new BezierPoint(0.5f, 0.430625f),
            new BezierPoint(0.57f, 0.5f),
            new BezierPoint(0.5f, 0.57f),
            new BezierPoint(0.430625f, 0.5f)
    };

    private static final BezierPoint[] mControlPoints = {
            new BezierPoint(0.430625f, 0.45f),
            new BezierPoint(0.54125f, 0.430625f),
            new BezierPoint(0.57f, 0.55f),
            new BezierPoint(0.45875f, 0.57f)
    };

    private static final BezierPoint[] mSecondControlPoints = {
            new BezierPoint(0.45875f, 0.430625f),
            new BezierPoint(0.57f, 0.45f),
            new BezierPoint(0.54125f, 0.57f),
            new BezierPoint(0.430625f, 0.55f)
    };

    BezierCircle() {
        super(mEndPoints, mControlPoints, mSecondControlPoints);
    }
}
