package com.example.kabeer_muhammad.app2;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class Music extends AppCompatActivity {


    public void playMusic(View view) {
        int id = view.getId();
        Log.i("ID", "ID value is" + id);

        String nameID;
        nameID = view.getResources().getResourceEntryName(id);
        Log.i("nameID", "my NAME ID IS" + nameID);

        int myMusic = getResources().getIdentifier(nameID, "raw",
                "com.example.kabeer_muhammad.app2");
        MediaPlayer mediaPlayer = MediaPlayer.create(this, myMusic);
        mediaPlayer.start();
    }

    @Override
    protected void onCreate(Bundle savedInstaceState) {
        super.onCreate(savedInstaceState);
        setContentView(R.layout.activity_music);
    }
}


