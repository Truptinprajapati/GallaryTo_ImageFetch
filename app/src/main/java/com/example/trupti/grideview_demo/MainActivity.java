package com.example.trupti.grideview_demo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.GridView;

public class MainActivity extends AppCompatActivity {

    int[] img={R.drawable.a,R.drawable.b,
            R.drawable.a,R.drawable.b,
            R.drawable.a,R.drawable.b,
            R.drawable.a,R.drawable.b,
            R.drawable.a,R.drawable.b};


    String[] name={"Redmi3sPrime","Lenovok5note","Redmi4sPrime","Lenovok6note",
            "Redmi5sPrime","Lenovok7note","Redmi6sPrime","Lenovok8note",
            "Redmi7sPrime","Lenovok9note"};

    GridView gridView;

@Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        gridView=(GridView)findViewById(R.id.grideview);


    CustomAdapter adapter=new CustomAdapter(this,name,img);
    gridView.setAdapter(adapter);



}
}
