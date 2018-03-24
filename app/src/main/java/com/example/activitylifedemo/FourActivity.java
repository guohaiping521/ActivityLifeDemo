package com.example.activitylifedemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class FourActivity extends AppCompatActivity {
    public final static String TAG = "ghpppp";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.four_activity);
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.i(TAG, "4 onStart");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.i(TAG, "4 onRestart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.i(TAG, "4 onResume");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.i(TAG, "4 onPause");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.i(TAG, "4 onStop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i(TAG, "4 onDestroy");
    }
}
