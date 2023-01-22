package com.example.memory_game_ca;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.GridView;


public class MainActivity2 extends AppCompatActivity {

    GridView gridView;
    int[] images = {
            R.drawable.paws, R.drawable.paws, R.drawable.paws, R.drawable.paws,
            R.drawable.paws, R.drawable.paws, R.drawable.paws, R.drawable.paws,
            R.drawable.paws, R.drawable.paws, R.drawable.paws, R.drawable.paws,
            R.drawable.paws, R.drawable.paws, R.drawable.paws, R.drawable.paws,
            R.drawable.paws, R.drawable.paws, R.drawable.paws, R.drawable.paws
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        gridView = (GridView) findViewById(R.id.simpleGridView);

        ImageAdapter customAdapter = new ImageAdapter(getApplicationContext(), images);
        gridView.setAdapter(customAdapter);
    }
}