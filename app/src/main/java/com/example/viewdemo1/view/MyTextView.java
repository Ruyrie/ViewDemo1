package com.example.viewdemo1.view;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;

import androidx.annotation.Nullable;

public class MyTextView extends androidx.appcompat.widget.AppCompatTextView implements View.OnClickListener {
    public MyTextView(Context context) {
        super(context);
        initView();
    }

    public MyTextView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        initView();
    }

    private void initView() {
        setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        /*RotateAnimation rotateAnimation = new RotateAnimation(
                0, 360,
                RotateAnimation.RELATIVE_TO_SELF, 0.5F,
                RotateAnimation.RELATIVE_TO_SELF, 0.5F);
        rotateAnimation.setDuration(600);
        startAnimation(rotateAnimation);*/

        ObjectAnimator objectAnimator = ObjectAnimator.ofFloat(this, "alpha", 1, 0.2F, 1);
        objectAnimator.setDuration(800);
        objectAnimator.start();
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        Paint paintRed = new Paint();
        paintRed.setColor(Color.RED);
        paintRed.setStyle(Paint.Style.FILL);

        Paint paintGreen = new Paint();
        paintGreen.setColor(Color.GREEN);
        paintGreen.setStyle(Paint.Style.STROKE);
        paintGreen.setStrokeWidth(5);

        Paint paintBlue = new Paint();
        paintBlue.setColor(Color.BLUE);
        paintBlue.setStyle(Paint.Style.FILL_AND_STROKE);
        paintBlue.setStrokeWidth(5);

        int baseline = getBaseline();
        int width = getWidth();
        int height = getHeight();

        //canvas.drawLine(0, baseline, width, baseline, paintRed);
        /*canvas.drawLines(new float[] {0 , 0, width/2, height/2,
                        width/2, height/2, width, 0,
                        width, 0, width, height,
                        width, height, 0, height,
                        0, height, 0, 0},paintGreen);*/

        //Rect rect = new Rect(0, 0, width, height);
        //canvas.drawRect(rect, paintBlue);

        //canvas.drawCircle(width/2, height/2, height/2, paintGreen);

        paintRed.setTextSize(50);
        canvas.drawText("Hello", 30, baseline, paintRed);
    }
}
