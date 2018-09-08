package com.example.kabeer_muhammad.drawable;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {
    Button button;
    TextView t;
    EditText d;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button=findViewById(R.id.button);
        t=findViewById(R.id.tv);
        d=findViewById(R.id.tb);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int num=Integer.parseInt(d.getText().toString());
                for ( int i=1;i<10;i++){
                    t .append(""+num+"*"+i+" = "+(num*i)+"\n");
                }

            }
        });
    }
}
