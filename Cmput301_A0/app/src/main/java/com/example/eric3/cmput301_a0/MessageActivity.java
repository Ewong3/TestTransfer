package com.example.eric3.cmput301_a0;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MessageActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_message);
    }

    public void sendCCID(View view){
        Intent intent = new Intent(this,DisplayGreetingActivity.class);
        EditText editText = (EditText) findViewById(R.id.Edit_CCID);
        String message = editText.getText().toString();
        intent.putExtra("Extra",message);
        startActivity(intent);
    }
}

