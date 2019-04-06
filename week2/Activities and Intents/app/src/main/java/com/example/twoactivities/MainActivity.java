package com.example.twoactivities;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText mMessageEditText;
    private String LOG_TAG = MainActivity.class.getSimpleName();
    public static final String Extra_Message = "com.example.android.twoactivities.extra.MESSAGE";

    public static final int Text_Request = 1;
    private TextView mReplyMessageReceived;
    private TextView mReplyTextView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mMessageEditText = findViewById(R.id.editText_Main);
        mReplyMessageReceived = findViewById(R.id.textView_message_mreceived);
        mReplyTextView = findViewById(R.id.textView_message_replied);
    }


    @Override
    public void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode == Text_Request){
            if (resultCode == RESULT_OK){
                String reply = data.getStringExtra(SecondActivity.Extra_Reply);
                mReplyMessageReceived.setVisibility(View.VISIBLE);
                mReplyTextView.setText(reply);
                mReplyTextView.setVisibility(View.VISIBLE);
            }
        }
    }

    public void LaunchSecondActivity(View view) {
        Log.d(LOG_TAG,"Button Clicked");

        Intent intent = new Intent(this, SecondActivity.class);
        String message = mMessageEditText.getText().toString();
        intent.putExtra(Extra_Message, message);

        startActivityForResult(intent, Text_Request);
    }
}
