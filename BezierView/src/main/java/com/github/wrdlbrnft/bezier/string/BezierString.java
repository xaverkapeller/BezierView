package com.github.wrdlbrnft.bezier.string;

import com.github.wrdlbrnft.bezier.symbols.BezierSymbol;

import java.util.ArrayList;
import java.util.Collections;
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
        final StringBuilder builder = new StringBuilder();
        for (BezierString string : strings) {
            symbols.addAll(string.getSymbols());
            builder.append(string.toString());
        }
        return new BezierStringImpl(symbols, builder.toString());
    }

    static BezierString concat(List<BezierString> strings) {
        final List<BezierSymbol> symbols = new ArrayList<>();
        final StringBuilder builder = new StringBuilder();
        for (BezierString string : strings) {
            symbols.addAll(string.getSymbols());
            builder.append(string.toString());
        }
        return new BezierStringImpl(symbols, builder.toString());
    }

    static BezierString of(String text) {
        final List<BezierSymbol> symbols = new ArrayList<>();
        for (int i = 0, length = text.length(); i < length; i++) {
            final char letter = text.charAt(i);
            symbols.add(BezierSymbol.of(letter));
        }
        return new BezierStringImpl(symbols, text);
    }

    static BezierString empty() {
        return new BezierStringImpl(Collections.emptyList(), "");
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

    static BezierString of(double number) {
        return of(String.valueOf(number));
    }

    class Builder {

        private final List<BezierString> mParts = new ArrayList<>();

        public Builder append(BezierString bezierString) {
            mParts.add(bezierString);
            return this;
        }

        public Builder append(String text) {
            return append(BezierString.of(text));
        }

        public Builder append(int number) {
            return append(BezierString.of(number));
        }

        public Builder append(long number) {
            return append(BezierString.of(number));
        }

        public Builder append(float number) {
            return append(BezierString.of(number));
        }

        public Builder append(double number) {
            return append(BezierString.of(number));
        }

        public BezierString build() {
            return BezierString.concat(mParts);
        }
    }
}
