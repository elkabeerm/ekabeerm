package com.example.kabeer_muhammad.calculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

    double first,second,result;
    boolean addition=false,
            subtraction=false,
            multiplication=false,
            division=false;
    TextView t;
    Button one,two,three,four,five,six,seven,eight,nine,zero,
            deci,equal,div,mul,minus,plus,del;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        t=findViewById(R.id.tv);
        one=findViewById(R.id.one);
        two=findViewById(R.id.two);
        three=findViewById(R.id.three);
        four=findViewById(R.id.four);
        five=findViewById(R.id.five);
        six=findViewById(R.id.six);
        seven=findViewById(R.id.seven);
        eight=findViewById(R.id.eight);
        nine=findViewById(R.id.nine);
        zero=findViewById(R.id.zero);
        deci=findViewById(R.id.deci);
        equal=findViewById(R.id.equal);
        del=findViewById(R.id.del);
        plus=findViewById(R.id.plus);
        minus=findViewById(R.id.minus);
        mul=findViewById(R.id.multi);
        div=findViewById(R.id.div);
        one.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                t.append("1");
            }
        });
        two.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                t.append("2");
            }
        });
        three.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                t.append("3");
            }
        });
        four.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                t.append("4");
            }
        });
        five.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                t.append("5");
            }
        });
        six.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                t.append("6");
            }
        });
        seven.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                t.append("7");
            }
        });
        eight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                t.append("8");
            }
        });
        nine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                t.append("9");
            }
        });
        zero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                t.append("0");
            }
        });
        deci.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                t.append(".");
            }
        });
        equal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try{
                    second=Double.valueOf(t.getText().toString());
                    if (addition){
                        result=first+second;
                        t.setText(""+result);
                    }
                    else if (subtraction){
                        result=first-second;
                        t.setText(""+result);
                    }
                    else if (multiplication){
                        result=first*second;
                        t.setText(""+result);
                    }
                    else if (division){
                        result=first/second;
                        t.setText(""+result);
                    }
                }catch (Exception e){}
            }

        });
        plus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try{
                    first=Double.valueOf(t.getText().toString());
                    t.setText(null);
                    addition=true;
                    subtraction=false;
                    multiplication=false;
                    division=false;
                }catch (Exception e){ }
            }
        });
        minus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try{
                    first=Double.valueOf(t.getText().toString());
                    t.setText(null);
                    addition=false;
                    subtraction=true;
                    multiplication=false;
                    division=false;
                }catch (Exception e){}
            }
        });
        mul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try{
                    first=Double.valueOf(t.getText().toString());
                    t.setText(null);
                    addition=false;
                    subtraction=false;
                    multiplication=true;
                    division=false;
                }catch (Exception e){}
            }
        });
        div.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try{
                    first=Double.valueOf(t.getText().toString());
                    t.setText(null);
                    addition=false;
                    subtraction=false;
                    multiplication=false;
                    division=true;
                }catch (Exception e){}
            }
        });
        del.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try{
                    String get=t.getText().toString();
                    t.setText(get.substring(0,get.length()-1));
                }catch (Exception e){}
            }
        });

        del.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                t.setText(null);
                return true;
            }
        });

    }
}
