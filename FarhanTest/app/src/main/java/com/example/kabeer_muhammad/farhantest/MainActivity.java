package com.example.kabeer_muhammad.farhantest;

import android.database.sqlite.SQLiteOpenHelper;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private static final String TAG ="ght" ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        SQL s=new SQL(this);
        if(s.addContact(new Contact("mk","mkuk","elkabeer","ameer"))){
            Toast.makeText(this,"successfully added",Toast.LENGTH_SHORT);
        }

    List<Contact> ght=new ArrayList<>();
    ght=s.getContact();

    for(Contact c:ght){
        Log.d(TAG,"onCreate: "+c.getName());
        Log.d(TAG,"onCreate: "+c.getContact());

    }
    }

}


