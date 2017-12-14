package com.github.wrdlbrnft.bezier.symbols;

import com.github.wrdlbrnft.bezier.BezierPoint;

/**
 * Created by kapeller on 28/04/15.
 */
class BezierZero extends BezierSymbolImpl {

    private static final BezierPoint[] mEndPoints = {
            new BezierPoint(0.0f, 0.4f),
            new BezierPoint(0.2775f, 0.0f),
            new BezierPoint(0.5575f, 0.4f),
            new BezierPoint(0.2775f, 0.8f),
            new BezierPoint(0.0f, 0.4f),
    };
    private static final BezierPoint[] mControlPoints = {
            new BezierPoint(0.0f, 0.2f),
            new BezierPoint(0.44250003f, 0.0f),
            new BezierPoint(0.5575f, 0.6f),
            new BezierPoint(0.11250001f, 0.8f),
    };
    private static final BezierPoint[] mSecondControlPoints = {
            new BezierPoint(0.11250001f, 0.0f),
            new BezierPoint(0.5575f, 0.20000002f),
            new BezierPoint(0.44250003f, 0.8f),
            new BezierPoint(0.0f, 0.6f),
    };

    BezierZero() {
        super(mEndPoints, mControlPoints, mSecondControlPoints);
    }
}
