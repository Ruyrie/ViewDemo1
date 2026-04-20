package com.example.viewdemo1.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.example.viewdemo1.R;

public class HeaderView extends RelativeLayout {
    private TextView mTitle;
    private Button mLeftButton;
    private Button mRightButton;

    public HeaderView(Context context) {
        super(context);
        initView();
    }

    public HeaderView(Context context, AttributeSet attrs) {
        super(context, attrs);
        initView();
    }

    private void initView() {
        LayoutInflater.from(getContext()).inflate(R.layout.header_view, this, true);
        mTitle = findViewById(R.id.title);
        mLeftButton = findViewById(R.id.left_button);
        mRightButton = findViewById(R.id.right_button);
    }

    public void setTitle(String title) {
        if (mTitle != null && title != null) {
            mTitle.setText(title);
        }
    }

    public void setLeftText(String leftText) {
        if (mLeftButton != null && leftText != null) {
            mLeftButton.setText(leftText);
        }
    }

    public void setRightText(String rightText) {
        if (mRightButton != null && rightText != null) {
            mRightButton.setText(rightText);
        }
    }

    public void setLeftClickListener(OnClickListener listener) {
        if (mLeftButton != null && listener != null) {
            mLeftButton.setOnClickListener(listener);
        }
    }

    public void setRightClickListener(OnClickListener listener) {
        if (mRightButton != null && listener != null) {
            mRightButton.setOnClickListener(listener);
        }
    }

    public void setLeftBackground(int resId) {
        if (mLeftButton != null) {
            mLeftButton.setBackgroundResource(resId);
        }
    }

    public void setLeftVisibility(int visibility) {
        if (mLeftButton != null) {
            mLeftButton.setVisibility(visibility);
        }
    }

    public void setRightVisibility(int visibility) {
        if (mRightButton != null) {
            mRightButton.setVisibility(visibility);
        }
    }

    public void setTitleColor(int color) {
        if (mTitle != null) {
            mTitle.setTextColor(color);
        }
    }
}
