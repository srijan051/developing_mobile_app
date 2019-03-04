package com.example.helloconstraint;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    private int mCount = 0;
    private TextView mShowCount;
    private Button btnZero, btnCount;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mShowCount = (TextView) findViewById(R.id.show_count);
        btnZero = (Button) findViewById(R.id.button_zero);
        btnCount = (Button) findViewById(R.id.button_count);
    }

    public void showToast(View view) {
        Toast toast = Toast.makeText(this, R.string.toast_message, Toast.LENGTH_SHORT);
        toast.show();

    }

    public void countUp(View view) {
    mCount++;
    btnZero.setBackgroundResource(R.color.colorGreen);
    btnCount.setBackgroundResource(R.color.colorPink);

    if (mShowCount != null){
        mShowCount.setText(Integer.toString(mCount));
    }
    }

    public void setZero(View view) {
        btnZero.setBackgroundResource(R.color.colorGrey);
        btnCount.setBackgroundResource(R.color.colorAccent);
        mCount = 0;
        mShowCount.setText(Integer.toString(mCount));
    }
}
