package com.example.sms_sendapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.telephony.SmsManager;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    EditText e1, e2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        e1=(EditText) findViewById(R.id.e1);
        e2=(EditText) findViewById(R.id.e2);

    }
    public void onSend(View v)
    {
        String phoneNumber = e1.getText().toString();
        SmsManager sms = SmsManager.getDefault();


        /* Reading the text from the textbox */
        String msg = e2.getText().toString();
        /* Sending the sms */
        sms.sendTextMessage(phoneNumber, null, msg, null, null);

    }



}