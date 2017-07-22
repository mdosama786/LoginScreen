package com.example.osama.testloginscreen;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Button btnLogin;
    private EditText inputName;
    private EditText inputPassword;

    static String BUNDLE_KEY_NAME="BUNDLE_KEY_NAME";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        inputName = (EditText) findViewById(R.id.editText);
        inputPassword = (EditText) findViewById(R.id.editText2);
        btnLogin = (Button) findViewById(R.id.button);


        // Login button Click Event
        btnLogin.setOnClickListener(new View.OnClickListener() {

            public void onClick(View view) {
                String name = inputName.getText().toString();
                String password = inputPassword.getText().toString();

                // Check for empty data in the form
                if (name.trim().isEmpty()) {
                    // login user
                    inputName.setError("Enter Name...");
                }
                else if(password.trim().isEmpty()){
                    inputPassword.setError("Enter Password...");
                }
                else {
                    Toast.makeText(getApplicationContext(), "Velidating....", Toast.LENGTH_SHORT).show();
                    if (name.equals("Acadgild") && password.equals("123456")) {

                        Intent intent = new Intent(MainActivity.this, ValidateScreen.class);

                        Bundle bundle = new Bundle();
                        bundle.putString(BUNDLE_KEY_NAME, inputName.getText().toString());

                        intent.putExtras(bundle);

                        startActivity(intent);
                    } else {
                        Toast.makeText(getApplicationContext(), "Wrong Credentials", Toast.LENGTH_LONG).show();
                    }

                }
            }

        });
    }
}