package com.example.kabeer_muhammad.appi;

import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import static com.example.kabeer_muhammad.appi.R.id.dialog_login;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button mShowDialog=(Button)findViewById(R.id.ShowDialog);
        mShowDialog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                AlertDialog.Builder mBuilder = new AlertDialog.Builder(MainActivity.this);
                View mView = getLayoutInflater().inflate(R.layout.dialog_login, null);
                final EditText mEmail = (EditText) mView.findViewById(R.id.email);
                final EditText mPassward = (EditText) mView.findViewById(R.id.pwd);
                EditText mLogin = (EditText) mView.findViewById(R.id.log);


                mLogin.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        if (!mEmail.getText().toString().isEmpty()
                                && !mPassward.getText().toString().isEmpty()) {
                            Toast.makeText(MainActivity.this,
                                    com.example.kabeer_muhammad.appi.R.string.success_login_message,
                                    Toast.LENGTH_SHORT).show();
                        } else {
                            Toast.makeText(MainActivity.this,
                                    com.example.kabeer_muhammad.appi.R.string.error_login_message,
                                    Toast.LENGTH_SHORT).show();
                        }
                    }
                });




            }
        });
    }
}