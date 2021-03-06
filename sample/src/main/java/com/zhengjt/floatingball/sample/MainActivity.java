package com.zhengjt.floatingball.sample;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.Toast;

import com.zhengjt.floatingball.FloatBall;

public class MainActivity extends AppCompatActivity {

    private FrameLayout rootView;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rootView = (FrameLayout) findViewById(R.id.fl_content);

        initBall();

        Button btnTest = (Button) findViewById(R.id.btn_test);

        btnTest.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "button click", Toast.LENGTH_SHORT).show();
            }
        });
    }

    private void initBall() {
        FloatBall floatBall = new FloatBall.Builder(this, rootView)
                .setBottomMargin(90)
                .setRightMargin(90)
                .setHeight(180)
                .setWidth(180)
                .setRes(R.drawable.ic_ball)
                .setDuration(500)
                .setBall(new ImageView(this))
                .setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Toast.makeText(MainActivity.this, "floating ball click", Toast.LENGTH_SHORT).show();
                    }
                })
                .build();
    }
}
