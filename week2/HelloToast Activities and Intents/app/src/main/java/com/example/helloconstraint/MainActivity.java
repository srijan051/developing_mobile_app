package com.example.helloconstraint;

import android.content.Intent;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    public static final String extra_message = "com.example.android.HelloActivity.extra.MESSAGE";
    private int mCount = 0;
    private TextView mShowCount;
    private Button btnCount;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mShowCount = (TextView) findViewById(R.id.show_count);
        btnCount = (Button) findViewById(R.id.button_count);
    }



    public void countUp(View view) {
    mCount++;

    btnCount.setBackgroundResource(R.color.colorPink);

    if (mShowCount != null){
        mShowCount.setText(Integer.toString(mCount));
    }
    }

    public void sayhello(View view) {
        Intent intent = new Intent(this, HelloActivity.class);

        String message = mShowCount.getText().toString();
        intent.putExtra(extra_message, message);
        startActivity(intent);
    }
}
