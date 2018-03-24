package com.example.activitylifedemo;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;

public class ThreeActivity extends AppCompatActivity {
    public final static String TAG = "ghpppp";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.i(TAG, "3 onCreate");
        setContentView(R.layout.three_activity);
        findViewById(R.id.jump_activityb_btn).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(ThreeActivity.this,SecondActivity.class));
            }
        });
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.i(TAG, "3 onStart");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.i(TAG, "3 onRestart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.i(TAG, "3 onResume");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.i(TAG, "3 onPause");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.i(TAG, "3 onStop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i(TAG, "3 onDestroy");
    }
}
