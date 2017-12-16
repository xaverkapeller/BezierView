package com.github.wrdlbrnft.bezier.symbols;

/**
 * Created with Android Studio<br>
 * User: Xaver<br>
 * Date: 16/12/2017
 */

public class BezierSymbolFactory {

    private static final BezierSymbol[] SYMBOLS = new BezierSymbol[255];

    static {
        SYMBOLS['0'] = new BezierZero();
        SYMBOLS['1'] = new BezierOne();
        SYMBOLS['2'] = new BezierTwo();
        SYMBOLS['3'] = new BezierThree();
        SYMBOLS['4'] = new BezierFour();
        SYMBOLS['5'] = new BezierFive();
        SYMBOLS['6'] = new BezierSix();
        SYMBOLS['7'] = new BezierSeven();
        SYMBOLS['8'] = new BezierEight();
        SYMBOLS['9'] = new BezierNine();
        SYMBOLS['.'] = new BezierCircle();
        SYMBOLS[' '] = new BezierNone();
    }


    public static BezierSymbol get(char character) {
        final BezierSymbol symbol = SYMBOLS[character];
        if (symbol == null) {
            throw new IllegalArgumentException(String.format("No symbol for character %s is defined.", character));
        }
        return symbol;
    }
}
