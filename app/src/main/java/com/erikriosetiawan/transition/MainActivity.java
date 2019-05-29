package com.erikriosetiawan.transition;

import android.graphics.drawable.TransitionDrawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    ImageView imageViewLight;
    Button buttonStatus;
    boolean isTurnOn = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imageViewLight = findViewById(R.id.image_view);
        buttonStatus = findViewById(R.id.button);
        buttonStatus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (!isTurnOn) {
                    imageViewLight.setImageResource(R.drawable.transition_on);
                    ((TransitionDrawable) imageViewLight.getDrawable()).startTransition(3000);
                    isTurnOn = true;
                } else {
                    imageViewLight.setImageResource(R.drawable.transition_off);
                    ((TransitionDrawable) imageViewLight.getDrawable()).startTransition(3000);
                    isTurnOn = false;
                }
            }
        });
    }
}
