package com.example.kabeer_muhammad.gyani;

import android.app.Dialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Dialog d;
    Button b,yes,no;
    TextView title,msg;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        d=new Dialog (this);

        title=d.findViewById(R.id.t2);
        msg=d.findViewById(R.id.text2);
        yes=d.findViewById(R.id.click);
        no=d.findViewById(R.id.b2);

        b=findViewById(R.id.click);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                d.show();
                title.setText("Developer");

                msg.setText("Android Developer");
            }
        });



        yes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "you are in", Toast.LENGTH_SHORT).show();

            }
        });

        no.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                d.dismiss();
            }
        });

    }

}
