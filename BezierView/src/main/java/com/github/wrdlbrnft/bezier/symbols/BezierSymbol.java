package com.github.wrdlbrnft.bezier.symbols;


import com.github.wrdlbrnft.bezier.BezierPoint;

/**
 * Created by kapeller on 28/04/15.
 */
public interface BezierSymbol {
    BezierPoint[] getEndPoints();
    BezierPoint[] getFirstControlPoints();
    BezierPoint[] getSecondControlPoints();

    static BezierSymbol of(BezierPoint[] endPoints, BezierPoint[] firstControlPoints, BezierPoint[] secondControlPoints) {
        return new BezierSymbolImpl(endPoints, firstControlPoints, secondControlPoints);
    }

    static BezierSymbol of(char character) {
        return BezierSymbolFactory.get(character);
    }
}
