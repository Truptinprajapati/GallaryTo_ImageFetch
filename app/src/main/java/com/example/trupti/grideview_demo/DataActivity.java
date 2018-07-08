package com.example.trupti.grideview_demo;

import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by Lenovo on 06-07-2018.
 */

public class DataActivity extends AppCompatActivity{
    @Override
    public void onCreate(@Nullable Bundle savedInstanceState ) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.data);

        TextView tv=(TextView)findViewById(R.id.textdata);
        ImageView iv=(ImageView)findViewById(R.id.imgdata);

        Intent intent=getIntent();


        Bitmap bitmap=(Bitmap)intent.getParcelableExtra("Bitmap");
        iv.setImageBitmap(bitmap);


        String sdata=intent.getStringExtra("param");
        tv.setText(sdata);


       // Log.d("data",b.getString("temp"));


    }
}
