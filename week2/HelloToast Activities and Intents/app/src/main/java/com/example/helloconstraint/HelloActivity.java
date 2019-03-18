package com.example.helloconstraint;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class HelloActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hello);
        TextView helloactivity_showcount = findViewById(R.id.textView_count);
        Intent intent = getIntent();
        String message = intent.getStringExtra(MainActivity.extra_message);
        helloactivity_showcount.setText(message);

    }
}
