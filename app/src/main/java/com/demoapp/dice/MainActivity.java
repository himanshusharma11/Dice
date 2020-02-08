package com.demoapp.dice;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button roll_button;
        roll_button = (Button) findViewById(R.id.roll_button);

        final ImageView dice1 = (ImageView) findViewById(R.id.dice1);
        final ImageView dice2 = (ImageView) findViewById(R.id.dice2);

        final int[] diceArray ={
                R.drawable.dice1,
                R.drawable.dice2,
                R.drawable.dice3,
                R.drawable.dice4,
                R.drawable.dice5,
                R.drawable.dice6};

        roll_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.d("Dice button","Dice button is pressed");
                Random randomNumberGenerator = new Random();

                int number =randomNumberGenerator.nextInt(6);
                dice1.setImageResource(diceArray[number]);

                number = randomNumberGenerator.nextInt(6);
                dice2.setImageResource(diceArray[number]);
            }
        });

    }
}