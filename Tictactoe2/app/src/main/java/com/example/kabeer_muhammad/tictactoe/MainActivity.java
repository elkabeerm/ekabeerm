package com.example.kabeer_muhammad.tictactoe;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button[][] bt=new Button[3][3];
    TextView  pl1,pl2;
    Button reset;
    private String TAG="MainActivity";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        for(int i=0;i<3;i++){
            for (int j=0; j<3;j++){
                String id ="bt_"+i+j;

                int resid= getResources().getIdentifier(id,"id",getPackageName());
                bt[i][j]=findViewById(resid);
                bt[i][j].setOnClickListener(this.clickListener);
            }
        }
        pl1=findViewById(R.id.player1);
        pl2=findViewById(R.id.player2);
        reset=findViewById(R.id.playagain);
        reset.setOnClickListener(clickListener);
    }









    int click=0;
    boolean iscross=false;
    //String tic="X";
    View.OnClickListener clickListener=new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            if (click != 9) {
                switch (view.getId()) {
                    case R.id.bt_00:
                        buttonclcick(view,iscross);
                        break;
                    case R.id.bt_01:
                        buttonclcick(view,iscross);
                        break;
                    case R.id.bt_02:
                        buttonclcick(view,iscross);
                        break;
                    case R.id.bt_03:
                        buttonclcick(view,iscross);
                        break;
                    case R.id.bt_04:
                        buttonclcick(view,iscross);
                        break;
                    case R.id.bt_05:
                        buttonclcick(view,iscross);
                        break;
                    case R.id.bt_06:
                        buttonclcick(view,iscross);
                        break;
                    case R.id.bt_07:
                        buttonclcick(view,iscross);
                        break;
                    case R.id.bt_08:
                        buttonclcick(view,iscross);
                        break;
                    default:
                        Toast.makeText(MainActivity.this, "oppsss...", Toast.LENGTH_SHORT).show();
                }
                click++;

                if(click==9){
                    Toast.makeText(MainActivity.this, "checking result", Toast.LENGTH_SHORT).show();

                    checkResult();
                }
                //toggling the player
                if(iscross){
                    iscross=false;
                }else{
                    iscross=true;
                }
            }
            if(view.getId()==R.id.playagain){
                reset();
            }

        }
    };

    public void buttonclcick(View v,boolean state){
        Button b=(Button)v;
        if(!state){
            b.setText("X");}else{
            b.setText("O");
        }
    }

    public void reset(){
        for(int i=0;i<3;i++){
            for (int j=0; j<3;j++){

                bt[i][j].setText(null);
                pl1.setText("Player 1   : 0");
                pl2.setText("Player 2   : 0");

            }
            click=0;
            iscross=false;
        }
    }


    public void checkResult(){
        int zero=0;
        int cross=0;
        String text[][]=new String[3][3];
        for(int i=0;i<3;i++) {
            for (int j = 0; j < 3; j++) {
                text[i][j] = bt[i][j].getText().toString();
                //Toast.makeText(this, "" + text[i][j], Toast.LENGTH_SHORT).show();
                Log.d(TAG, "checkResult: " + text[i][j]);

            }
        }


        for(int k=0;k<3;k++) {
            //for row
            if((text[k][0].equalsIgnoreCase(text[k][1]))   && (text[k][0].equalsIgnoreCase(text[k][2]))){
                if(text[k][0].equalsIgnoreCase("X")){
                    zero++;
                    pl1.setText("Player 1   : 1");
                }else{
                    pl2.setText("Player 2   : 1");
                    cross++;
                }
                break;
            }



        }
        for(int k=0;k<3;k++) {
            //for row
            if((text[0][k].equalsIgnoreCase(text[1][k]))   && (text[0][k].equalsIgnoreCase(text[2][k]))){
                if(text[0][k].equalsIgnoreCase("X")){
                    zero++;
                    pl1.setText("Player 1   : 1");
                }else{
                    pl2.setText("Player 2   : 1");
                    cross++;
                }
                break;
            }



        }


        //daigonal test
        if((text[0][0].equalsIgnoreCase(text[1][1])) && (text[0][0].equalsIgnoreCase(text[2][2]))){
            if(text[0][0].equalsIgnoreCase("X")){
                zero++;
                pl1.setText("Player 1   : 1");
            }else{
                pl2.setText("Player 2   : 1");
                cross++;
            }
        }

        if((text[1][1].equalsIgnoreCase(text[0][1])) && (text[1][1].equalsIgnoreCase(text[2][0]))){
            if(text[1][1].equalsIgnoreCase("X")){
                zero++;
                pl1.setText("Player 1   : 1");
            }else{
                pl2.setText("Player 2   : 1");
                cross++;
            }
        }



    }

}
//import android.support.v7.app.AppCompatActivity;
//import android.os.Bundle;
//import android.util.Log;
//import android.view.View;
//import android.widget.ImageView;
//import android.widget.LinearLayout;
//
//public class MainActivity extends AppCompatActivity {
//
//
//    int myActivePlayer=0;
//
//    //o for X and 1 for O
//
//    //my Game state
//
//
//    int[] myGameState={2,2,2,2,2,2,2,2,2};
//
//
//    public void imageTapped(View view) {
//        ImageView myTapped = (ImageView) view;
//
////        Log.i("tag is","image number is"+myTapped.getTag().toString());
//       int tappedimageTag= Integer.parseInt(myTapped.getTag().toString());
//
//
//        if(myGameState[tappedimageTag]==2) {
//            myGameState[tappedimageTag]=myActivePlayer;
//            if (myActivePlayer == 0) {
//                myTapped.setImageResource(R.drawable.x);
//                myTapped.animate().rotation(360).setDuration(1000);
//                myActivePlayer = 1;
//            } else {
//                myTapped.setImageResource(R.drawable.o);
//                myActivePlayer = 0;
//            }
//
//        }else {
//            Log.i("msg","this place is filled already");
//        }
//        }
//
//        public void playAgain(View view){
////        Log.i("msg","play again tapped");
//            for (int i=0; i<myGameState.length; i++){
//                myGameState[i]=2;
//            }
//            myActivePlayer=0;
//
//            LinearLayout linearLayout=(LinearLayout) findViewById(R.id.line1);
//            for (int i =0; i<linearLayout.getChildCount(); i++){
//                ((ImageView)linearLayout.getChildAt(i)).setImageResource(R.mipmap.ic_launcher);
//
//            }
//
//            LinearLayout linearLayout=(LinearLayout) findViewById(R.id.line2);
//            for (int i =0; i<linearLayout.getChildCount(); i++){
//                ((ImageView)linearLayout.getChildAt(i)).setImageResource(R.mipmap.ic_launcher);
//
//
//            } }
//        @Override
//        protected void onCreate (Bundle savedInstanceState){
//            super.onCreate(savedInstanceState);
//            setContentView(R.layout.activity_main);
//        }
//    }
//
