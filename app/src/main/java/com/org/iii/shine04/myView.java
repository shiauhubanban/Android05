package com.org.iii.shine04;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;

/**
 * Created by user on 2016/11/17.
 */

public class myView extends View {
    public myView(Context context, AttributeSet attrs) {
        super(context, attrs);
    setBackgroundColor(Color.BLACK);

//    setOnClickListener(new OnClickListener() {
//        @Override
//        public void onClick(View v) {
//            Log.v("shine","onclick");
//        }
//    });
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        Paint paint = new Paint();
        paint.setColor(Color.YELLOW);
        canvas.drawCircle(100,100,40,paint);
        canvas.drawLine(0,0,200,200,paint);

    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
       // boolean ret = super.onTouchEvent(event);
        float ex = event.getX(),ey = event.getY();
        if(event.getAction()==MotionEvent.ACTION_DOWN){
            Log.v("shine","down:"+ ex +"x"+ey);
        }else if(event.getAction()==MotionEvent.ACTION_MOVE) {
            Log.v("shine", "move:" + ex +"x"+ey);
        }
        return true;
    }
}
