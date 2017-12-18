package com.example.manoj_pc.sportztask;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.LinearLayout;

import com.example.manoj_pc.sportztask.utils.Constants;

/**
 * Created by MANOJ-PC on 12/18/2017.
 */

public class LandingPageActivity extends AppCompatActivity {
    private LinearLayout llContainer1;
    private LinearLayout llContainer2;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_landing_page);
        initView();
        initData();
    }

    private void initData() {
        llContainer1.setOnClickListener(view -> {
            Intent intent = new Intent(LandingPageActivity.this,MainActivity.class);
            intent.putExtra(Constants.TEAM,"RCB");
            startActivity(intent);
        });

        llContainer2.setOnClickListener(view -> {
            Intent intent = new Intent(LandingPageActivity.this,MainActivity.class);
            intent.putExtra(Constants.TEAM,"SRH");
            startActivity(intent);
        });
    }
    private void initView() {
        llContainer1 = (LinearLayout)findViewById(R.id.llContainer1);
        llContainer2 = (LinearLayout)findViewById(R.id.llContainer2);
    }
}
