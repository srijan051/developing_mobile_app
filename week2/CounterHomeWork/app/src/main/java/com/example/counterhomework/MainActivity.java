package com.example.counterhomework;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText editText;
    private TextView mshowcount;
    private int mcount = 0;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mshowcount = findViewById(R.id.textView_count);
        editText = findViewById(R.id.editText_text);

        if (savedInstanceState != null) {
            String showcountvalue = savedInstanceState.getString("mshowcount");
            Log.d("test", "Received Count Value: "+showcountvalue);
            mshowcount.setText(showcountvalue);
            Log.d("test", "Value set to Count: "+showcountvalue);
        }

    }

    @Override
    public void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putString("mshowcount", mshowcount.getText().toString());
        Log.d("test", "count: "+mshowcount.getText().toString()+ " Mesage: "+editText.getText().toString());
    }

    public void countup(View view) {
        mcount++;
        if (mshowcount != null){
            mshowcount.setText(Integer.toString(mcount));
        }
    }
}
