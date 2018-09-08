package com.example.kabeer_muhammad.mytest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    TextView email;
    TextView password;
    Button b1;
    List<user> data;
    ListView ft;
    DatabaseReference user;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        b1=(Button) findViewById(R.id.button_1);
        email=(TextView) findViewById(R.id.email);
        password=(TextView) findViewById(R.id.p1);
        ft=findViewById(R.id.list);
        user= FirebaseDatabase.getInstance().getReference("user");



        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String uid=user.push().getKey();

                user.child(uid).setValue
                        (new user(uid,email.getText(),
                                password.getText().toString()
                                ,"26","a+","good"));



            }
        });
//
//        String fid=user.push().getKey();
//
//        user.child(fid).setValue(new user("mk","mkuk355",fid));
//
//
//        user.addValueEventListener(new ValueEventListener() {
//            @Override
//            public void onDataChange(DataSnapshot dataSnapshot) {
//                for (DataSnapshot ds:dataSnapshot.getChildren()){
//
//                    data.add(ds.getValue(user.class));
//                }
//            }
            List<String> f=new ArrayList<>();

            for(user d:data){
                ft.add(d.getUname()+"|"+d.getPwd());
            }

            ArrayAdapter arr=new ArrayAdapter
                    (this,android.R.layout.simple_list_item_1);

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });
    }
}
