package com.example.twoactivities;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    public static final String Extra_Reply = "com.example.android.twoactivities.extra.REPLY";
    private EditText mReply;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        Intent intent = getIntent();
        String message = intent.getStringExtra(MainActivity.Extra_Message);
        TextView textView = findViewById(R.id.textView_message);
        textView.setText(message);
        mReply = findViewById(R.id.editText_Reply);

    }

    public void ReturnReply(View view) {
        String reply = mReply.getText().toString();
        Intent replyIntent = new Intent();
        replyIntent.putExtra(Extra_Reply, reply);
        setResult(RESULT_OK, replyIntent);
        finish();
    }
}
