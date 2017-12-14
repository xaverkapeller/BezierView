package com.github.wrdlbrnft.bezier.symbols;

import com.github.wrdlbrnft.bezier.BezierPoint;

import java.util.Arrays;

/**
 * Created with Android Studio<br>
 * User: Xaver<br>
 * Date: 11/12/2017
 */
class BezierSymbolImpl implements BezierSymbol {

    private final BezierPoint[] mEndPoints;
    private final BezierPoint[] mFirstControlPoints;
    private final BezierPoint[] mSecondControlPoints;

    protected BezierSymbolImpl(BezierPoint[] endPoints, BezierPoint[] firstControlPoints, BezierPoint[] secondControlPoints) {
        mEndPoints = endPoints;
        mFirstControlPoints = firstControlPoints;
        mSecondControlPoints = secondControlPoints;
    }

    @Override
    public BezierPoint[] getEndPoints() {
        return mEndPoints;
    }

    @Override
    public BezierPoint[] getFirstControlPoints() {
        return mFirstControlPoints;
    }

    @Override
    public BezierPoint[] getSecondControlPoints() {
        return mSecondControlPoints;
    }
}
