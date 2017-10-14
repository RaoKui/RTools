package com.raokui.rtools.activity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import com.raokui.rtools.R;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.Unbinder;

/**
 * Created by RaoKui on 2017/10/8.
 */

public class WelcomeActivity extends AppCompatActivity {


    @BindView(R.id.btn_skip)
     Button btnSkip;

    private Handler handler = new Handler();

    private Unbinder unbinder ;

    private int time = 3;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome);
        unbinder = ButterKnife.bind(this);
        handler.postDelayed(runnable, 1000);
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        unbinder.unbind();
    }

    private Runnable runnable = new Runnable() {
        @Override
        public void run() {
            btnSkip.setText("跳过：" + time + "s");
            handler.postDelayed(this, 1000);
            time--;
            if (time == 0) {
                Intent intent = new Intent(WelcomeActivity.this, MainActivity.class);
                startActivity(intent);
                handler.removeCallbacks(runnable);
                finish();

            } else {
                btnSkip.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent intent = new Intent(WelcomeActivity.this, MainActivity.class);
                        startActivity(intent);
                        handler.removeCallbacks(runnable);
                        finish();
                    }
                });
            }

        }
    };
}
