package com.example.activitylifedemo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class SecondActivity extends AppCompatActivity {
    public final static String TAG = "ghpppp";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.i(TAG,"2 onCreate");
        setContentView(R.layout.second_activity);
        findViewById(R.id.jump_activityb_btn).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(SecondActivity.this,ThreeActivity.class));
            }
        });
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.i(TAG,"2 onStart");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.i(TAG,"2 onRestart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.i(TAG,"2 onResume");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.i(TAG,"2 onPause");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.i(TAG,"2 onStop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i(TAG,"2 onDestroy");
    }
}
