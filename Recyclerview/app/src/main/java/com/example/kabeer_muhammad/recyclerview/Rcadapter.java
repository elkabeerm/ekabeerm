package com.example.kabeer_muhammad.recyclerview;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

public class Rcadapter extends RecyclerView.Adapter<Rcadapter.Rcholder>{
    int[] images;
    String[] nameandprice;
    Context context;
    public Rcadapter (int [] a,String[] b, Context c)
    {
        this.images=a;
        this.nameandprice=b;
        this.context=c;
    }


    @NonNull
    @Override
    public Rcholder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        //View.inflate(context,R.layout.cardview,null); alternative
        View v= LayoutInflater.from(context).inflate(R.layout.cardview,viewGroup,false);
        return new Rcholder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull Rcholder rcholder, int i) {
        String[] np=nameandprice[i].split(":");
        String name=np[0];
        String price=np[1];
        rcholder.fimage.setImageResource(images[i]);
        rcholder.fname.setText(name);
        rcholder.fprice.setText(price+"/-");


    }

    @Override
    public int getItemCount() {
        return nameandprice.length;
    }

    class Rcholder extends RecyclerView.ViewHolder{
        ImageView fimage;
        TextView fname,fprice;
        Rcholder(@NonNull View itemView) {
            super(itemView);

            fimage=itemView.findViewById(R.id.img1);
           fname=itemView.findViewById(R.id.n1);
           fprice=itemView.findViewById(R.id.p1);

        }
    }
}
