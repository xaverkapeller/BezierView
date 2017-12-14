package com.github.wrdlbrnft.bezier.string;

import android.support.annotation.NonNull;

import com.github.wrdlbrnft.bezier.symbols.BezierSymbol;

import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/**
 * Created with Android Studio<br>
 * User: Xaver<br>
 * Date: 14/12/2017
 */

class BezierStringImpl implements BezierString {

    private final List<BezierSymbol> mBezierSymbols;

    BezierStringImpl(List<BezierSymbol> bezierSymbols) {
        mBezierSymbols = Collections.unmodifiableList(bezierSymbols);
    }

    @Override
    public BezierSymbol symbolAt(int index) {
        return mBezierSymbols.get(index);
    }

    @Override
    public int length() {
        return mBezierSymbols.size();
    }

    @Override
    public BezierString substring(int startIndex) {
        return substring(startIndex, mBezierSymbols.size());
    }

    @Override
    public BezierString substring(int startIndex, int endIndex) {
        return new BezierStringImpl(mBezierSymbols.subList(startIndex, endIndex));
    }

    @Override
    public List<BezierSymbol> getSymbols() {
        return mBezierSymbols;
    }

    @NonNull
    @Override
    public Iterator<BezierSymbol> iterator() {
        return mBezierSymbols.iterator();
    }
}
