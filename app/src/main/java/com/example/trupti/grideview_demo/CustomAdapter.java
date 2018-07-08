package com.example.trupti.grideview_demo;

import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

/**
 * Created by Lenovo on 06-07-2018.
 */

class CustomAdapter extends BaseAdapter{

    Context context;
    String[] name;
    int[] img;

    public CustomAdapter(MainActivity mainActivity, String[] name, int[] img) {
        this.context=mainActivity;
        this.name=name;
        this.img=img;
    }

    @Override
    public int getCount() {
        return name.length;
    }

    @Override
    public Object getItem(int position) {
        return position;
    }

    @Override
    public long getItemId(int position) {
        return position;
    }



    public class Holder{
        ImageView iv;
        TextView tv;
        LinearLayout ll;
    }


    @Override
    public View getView(final int position, View convertView, ViewGroup parent) {

        final Holder hd=new Holder();

        convertView= LayoutInflater.from(context).inflate(R.layout.sigalrow,parent,false);
        hd.tv=(TextView)convertView.findViewById(R.id.text);
        hd.iv=(ImageView)convertView.findViewById(R.id.imagevieew);
        hd.ll=(LinearLayout)convertView.findViewById(R.id.layoutdata);

        hd.iv.setImageResource(img[position]);
        hd.tv.setText(name[position]);

        hd.ll.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                Intent i=new Intent(context,DataActivity.class);

                /*img*/
                hd.iv.setDrawingCacheEnabled(true);
                Bitmap b=hd.iv.getDrawingCache();
                i.putExtra("Bitmap",b);


                /*text*/
                String dataq=hd.tv.getText().toString();
                i.putExtra("param",dataq);

                context.startActivity(i);




            }
        });

        return convertView;


    }
}
