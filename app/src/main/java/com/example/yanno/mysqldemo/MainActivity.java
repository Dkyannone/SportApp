package com.example.yanno.mysqldemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    EditText UsernameET, PasswordET;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        UsernameET = (EditText)findViewById(R.id.etUsername);
        PasswordET = (EditText)findViewById(R.id.etPassword);

    }

    public void OnLogin(View view) {
        String username = UsernameET.getText().toString();
        String password = PasswordET.getText().toString();
        String type = "login";

        BackgroundWorker backgroundWorker = new BackgroundWorker(this);
        backgroundWorker.execute(type, username, password);
    }
}
