package com.org.iii.shine04;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;

/**
 * Created by user on 2016/11/17.
 */

public class myView extends View {
    public myView(Context context, AttributeSet attrs) {
        super(context, attrs);
    setBackgroundColor(Color.BLACK);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        Paint paint = new Paint();
        paint.setColor(Color.YELLOW);
        canvas.drawCircle(100,100,40,paint);
    }
}
