package com.example.kabeer_muhammad.mynew;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.PopupMenu;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements PopupMenu.OnMenuItemClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void showPopup(View v){
        PopupMenu popup=new PopupMenu(this,v);
        popup.setOnMenuItemClickListener(this);
        popup.inflate(R.menu.popup_menu);
        popup.show();
        }

    @Override
    public boolean onMenuItemClick(MenuItem menuItem) {
       switch (menuItem.getItemId()){
           case R.id.item1:
               Toast.makeText(this,"Help clicked",Toast.LENGTH_SHORT).show();
               break;
           case R.id.item2:
               Toast.makeText(this,"Music clicked",Toast.LENGTH_SHORT).show();
               break;
           case R.id.item3:
               Toast.makeText(this,"Shop clicked",Toast.LENGTH_SHORT).show();
               break;
           case R.id.item4:
               Toast.makeText(this,"Help clicked",Toast.LENGTH_SHORT).show();
               break;
               default:
                   return false;
       }
       return super.onOptionsItemSelected(menuItem);

       }

       }







