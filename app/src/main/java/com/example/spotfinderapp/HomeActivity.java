package com.example.spotfinderapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class HomeActivity extends AppCompatActivity {

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        TextView threeText = findViewById(R.id.threeNum);
        threeText.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick (View v){
                // Navigate to LotActivity when the TextView is clicked
                Intent intent = new Intent(HomeActivity.this, LotActivity.class);
                startActivity(intent);
            }
        });

        TextView fourText = findViewById(R.id.fourNum);
        fourText.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick (View v){
                // Navigate to LotActivity when the TextView is clicked
                Intent intent = new Intent(HomeActivity.this, LotActivity.class);
                startActivity(intent);
            }
        });

        TextView fiveText = findViewById(R.id.fiveNum);
        fiveText.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick (View v){
                // Navigate to LotActivity when the TextView is clicked
                Intent intent = new Intent(HomeActivity.this, LotActivity.class);
                startActivity(intent);
            }
        });
        TextView sixText = findViewById(R.id.sixNum);
        sixText.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick (View v){
                // Navigate to LotActivity when the TextView is clicked
                Intent intent = new Intent(HomeActivity.this, LotActivity.class);
                startActivity(intent);
            }
        });
        TextView eightText = findViewById(R.id.eightNum);
        eightText.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick (View v){
                // Navigate to LotActivity when the TextView is clicked
                Intent intent = new Intent(HomeActivity.this, LotActivity.class);
                startActivity(intent);
            }
        });
        TextView tenText = findViewById(R.id.tenNum);
        tenText.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick (View v){
                // Navigate to LotActivity when the TextView is clicked
                Intent intent = new Intent(HomeActivity.this, LotActivity.class);
                startActivity(intent);
            }
        });

    }

}
