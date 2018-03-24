package com.example.activitylifedemo;

import android.content.Intent;
import android.os.PersistableBundle;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

import static android.content.Intent.FLAG_ACTIVITY_SINGLE_TOP;

public class MainActivity extends AppCompatActivity {
    public final static String TAG = "ghpppp";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_activity);
        Log.i(TAG,"1 onCreate");
        findViewById(R.id.jump_activityb_btn).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this,SecondActivity.class);
                intent.setFlags(FLAG_ACTIVITY_SINGLE_TOP);
                startActivity(intent);
            }
        });
    }

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        Log.i(TAG,"1 onSaveInstanceState");
    }

    @Override
    protected void onRestoreInstanceState(Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
        Log.i(TAG,"1 onRestoreInstanceState");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.i(TAG,"1 onStart");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.i(TAG,"1 onRestart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.i(TAG,"1 onResume");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.i(TAG,"1 onPause");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.i(TAG,"1 onStop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i(TAG,"1 onDestroy");
    }

}
