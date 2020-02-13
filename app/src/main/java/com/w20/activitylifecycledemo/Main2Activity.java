package com.w20.activitylifecycledemo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {

    public static final String TAG = MainActivity.TAG;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        Log.i(TAG, "onCreate: 2");

        TextView textView = findViewById(R.id.txt_recv_fruit);
        Intent intent = getIntent();
        String fruit = intent.getExtras().getString("fruit");

        textView.setText(fruit);

    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i(TAG, "onDestroy: 2");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.i(TAG, "onPause: 2");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.i(TAG, "onStart: 2");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.i(TAG, "onStop: 2");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.i(TAG, "onRestart: 2");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.i(TAG, "onResume: 2");
    }
}
