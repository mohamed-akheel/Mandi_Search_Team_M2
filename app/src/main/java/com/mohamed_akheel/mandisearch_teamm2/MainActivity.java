package com.mohamed_akheel.mandisearch_teamm2;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {


    private static final Object V = View ;

    @RequiresApi(api = Build.VERSION_CODES.M)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    public void second(View V){
        Intent i = new Intent(this,page2.class);
        startActivity(i);
    }
    public void third(View V){
        Intent i = new Intent(this,page3.class);
        startActivity(i);
    }
    public void fourth(View V){
        Intent i = new Intent(this,page4.class);
        startActivity(i);
    }
    public void fifth(View V){
        Intent i = new Intent(this,page5.class);
        startActivity(i);
    }
    public void sixth(View V){
        Intent i = new Intent(this,page6.class);
        startActivity(i);
    }
}