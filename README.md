# BezierView

Beautifully animated morphing numbers made easy!

 - **Simple to use**: Just add it to your layout and set a text!
 - **High Performance**: `BezierView` is optimized to animate smoothly on any Android device!

[![Build Status](https://travis-ci.org/Wrdlbrnft/BezierView.svg?branch=master)](https://travis-ci.org/Wrdlbrnft/BezierView)

## How do I add it to my project?

Just add this dependency to your build.gradle file:

```
compile 'com.github.wrdlbrnft:bezier-view:0.1.0.1'
```

## How do I use it?

Add the `BezierView` to your layout:

```
<com.github.wrdlbrnft.bezier.BezierView
    android:id="@+id/bezier_view
    android:layout_width="match_parent"
    android:layout_height="wrap_content"/>
```

You can also set a number of properties directly in your layout:

```
<com.github.wrdlbrnft.bezier.BezierView
    android:layout_width="match_parent"
    android:layout_height="wrap_content"
    app:textColor="@android:color/black"
    app:text="1234"
    app:textStrokeWidth="2dp"
    app:textSize="22sp"
    app:digitPadding_horizontal="0dp"
    app:digitPadding_vertical="8dp"
    app:animationDuration="200" />
```

| Property                      | Description                                               |
| ----------------------------- | --------------------------------------------------------- |
| `app:textColor`               | Sets the color of the text                                |
| `app:text`                    | Sets the text to be displayed                             |
| `app:textStrokeWidth`         | Sets the stroke width of the text                         |
| `app:textSize`                | Sets the size of the text                                 |
| `app:digitPadding_horizontal` | Sets the horizontal padding between digits                |
| `app:digitPadding_vertical`   | Sets the vertical padding between digits                  |
| `app:animationDuration`       | Sets the animation duration when animating between digits |

Of course you can also set all these properties in your code:

```
bezierView.setTextColor(Color.BLACK);
bezierView.setTextStrokeWidth(someStrokeWidth);
bezierView.setTextSize(someSize);
bezierView.setHorizontalDigitPadding(somePadding);
bezierView.setVerticalDigitPadding(somePadding);
```

However when setting a text you first need to create an instance of a `BezierString`:

```
BezierString string = BezierString.of("1234");
bezierView.setText(string);
```

The `BezierString` class is what turns a normal `String` into something the `BezierView` can animate.

You can also create a `BezierString` from numbers directly:

```
BezierString fromInt = BezierString.of(1234);
BezierString fromLong = BezierString.of(5678L);
BezierString fromFloat = BezierString.of(3.431f);
BezierString fromDouble = BezierString.of(3.1415926535);
```

It is also possible to concatenate two or more `BezierString` instances:

```
BezierString result = BezierString.concat(someBezierString, anotherBezierString);
```

Alternatively you can also use the `BezierString.Builder` class to build a BezierString from many different parts:

```
BezierString result = new BezierString.Builder()
        .append(someInt)
        .append(someLong)
        .append(someString)
        .append(someFloat)
        .append(someDouble)
        .append(someBezierString)
        .build();
```

If you ever need to read the actual characters in a `BezierString` you can turn the `BezierString` into a normal `String` using the `toString()` method:

```
String text = someBezierString.toString();
```

## Supported Character Set
 
At the moment the `BezierView` supports these characters:

 - `0`
 - `1`
 - `2`
 - `3`
 - `4`
 - `5`
 - `6`
 - `7`
 - `8`
 - `9`
 - `.`
 - ` `
 
Adding support for more symbols, especially the A - Z uppercase alphabet is planned!