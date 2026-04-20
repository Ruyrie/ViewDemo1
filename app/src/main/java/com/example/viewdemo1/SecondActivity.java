package com.example.viewdemo1;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.example.viewdemo1.view.HeaderView;

public class SecondActivity extends AppCompatActivity {
    private HeaderView mHeaderView;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.second_main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        mHeaderView = findViewById(R.id.header_view);
        //mHeaderView.setTitle("第二页标题");
        //mHeaderView.setLeftText("返回");
        mHeaderView.setLeftClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onBackPressed();
            }
        });
        //隐藏右边按钮
        mHeaderView.setRightVisibility(View.GONE);
        mHeaderView.setTitleColor(Color.BLUE);
    }
}
