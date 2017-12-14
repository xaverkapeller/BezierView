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
        switch (character) {

            case '0': return new BezierZero();
            case '1': return new BezierOne();
            case '2': return new BezierTwo();
            case '3': return new BezierThree();
            case '4': return new BezierFour();
            case '5': return new BezierFive();
            case '6': return new BezierSix();
            case '7': return new BezierSeven();
            case '8': return new BezierEight();
            case '9': return new BezierNine();
            case ' ': return new BezierNone();

            default:
                throw new IllegalArgumentException(String.format("No symbol for character %s is defined.", character));
        }
    }
}
