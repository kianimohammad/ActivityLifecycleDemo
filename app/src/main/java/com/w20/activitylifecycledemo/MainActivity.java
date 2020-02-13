package com.w20.activitylifecycledemo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Spinner;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    public static final String TAG = "ActivityLifecycle";

    Spinner spinner;
    TextView textView;
    /**
     * This is the method that is called when the activity is created*/
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Log.i(TAG, "onCreate: 1");

        spinner = findViewById(R.id.fruit_items);
        textView = findViewById(R.id.fruit_txt);
    }

    public void choose(View view) {
        textView.setText(spinner.getSelectedItem().toString());
    }

    public void order(View view) {
        /* we are going to the other activity */
        Intent intent = new Intent(this, Main2Activity.class);
        intent.putExtra("fruit", textView.getText().toString());
        startActivity(intent);
    }

    /** Called just before the activity is destroyed. */
    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i(TAG, "onDestroy: 1");
    }

    /** Called when another activity is taking focus. */
    @Override
    protected void onPause() {
        super.onPause();
        Log.i(TAG, "onPause: 1");
    }

    /** Called when the activity is about to become visible. */
    @Override
    protected void onStart() {
        super.onStart();
        Log.i(TAG, "onStart: 1");
    }

    /** Called when the activity is no longer visible. */
    @Override
    protected void onStop() {
        super.onStop();
        Log.i(TAG, "onStop: 1");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.i(TAG, "onRestart: 1");
        textView.setText("welcome back !!!");
    }

    /** Called when the activity has become visible. */
    @Override
    protected void onResume() {
        super.onResume();
        Log.i(TAG, "onResume: 1");
    }
}
