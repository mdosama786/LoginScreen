package com.example.osama.testloginscreen;

/**
 * Created by Osama on 5/11/2017.
 */

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;


public class ValidateScreen extends AppCompatActivity{

    TextView welcomeMsg;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.validate_screen);

        welcomeMsg = (TextView) findViewById(R.id.textView);

        Bundle bundle = getIntent().getExtras();
        if (bundle != null) {
            welcomeMsg.setTextSize(50.00f);
            welcomeMsg.setText("Welcome"+System.getProperty("line.separator")+ bundle.getString(MainActivity.BUNDLE_KEY_NAME));
            ;
        }
    }
}