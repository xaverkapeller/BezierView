package com.github.wrdlbrnft.bezier.string;

import com.github.wrdlbrnft.bezier.symbols.BezierSymbol;

import java.util.ArrayList;
import java.util.List;

/**
 * Created with Android Studio<br>
 * User: Xaver<br>
 * Date: 14/12/2017
 */

public interface BezierString extends Iterable<BezierSymbol> {

    BezierSymbol symbolAt(int index);
    int length();

    BezierString substring(int startIndex);
    BezierString substring(int startIndex, int endIndex);

    List<BezierSymbol> getSymbols();

    static BezierString concat(BezierString... strings) {
        final List<BezierSymbol> symbols = new ArrayList<>();
        for (BezierString string : strings) {
            symbols.addAll(string.getSymbols());
        }
        return new BezierStringImpl(symbols);
    }

    static BezierString of(String text) {
        final List<BezierSymbol> symbols = new ArrayList<>();
        for(int i = 0, length = text.length(); i < length; i++) {
            final char letter = text.charAt(i);
            symbols.add(BezierSymbol.of(letter));
        }
        return new BezierStringImpl(symbols);
    }

    static BezierString of(int number) {
        return of(String.valueOf(number));
    }

    static BezierString of(long number) {
        return of(String.valueOf(number));
    }

    static BezierString of(float number) {
        return of(String.valueOf(number));
    }
}
