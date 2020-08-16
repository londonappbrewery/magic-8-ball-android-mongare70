package com.londonappbrewery.magiceightball;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    ImageView ballDisplay;
    int[] ballArray = {
            R.drawable.ball1,
            R.drawable.ball2,
            R.drawable.ball3,
            R.drawable.ball4,
            R.drawable.ball5
    };
    Button myButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ballDisplay = (ImageView) findViewById(R.id.image_eightBall);
        myButton = (Button) findViewById(R.id.askButton);
        myButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Random randomNumberGenerator = new Random();
                int number = randomNumberGenerator.nextInt(4);
                Log.d("Magic","The random number is: "+number);
                ballDisplay.setImageResource(ballArray[number]);
            }
        });
    }
}
