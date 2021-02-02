package com.example.lab2b;

import androidx.appcompat.app.AppCompatActivity;
import java.util.Random;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private String [] fragments;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        fragments = getResources().getStringArray(R.array.fragments);
    }

    public void onClickHelp(View V){

        int fragmentNum = fragments.length;
        Random rand = new Random();
        int fragmentChoice = rand.nextInt(fragmentNum);
        String fragment = fragments[fragmentChoice];

        TextView help = (TextView) findViewById(R.id.helpText);
        help.setText(fragment);
    }


}