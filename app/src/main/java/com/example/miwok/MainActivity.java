package com.example.miwok;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        NumbersClicListener clicListener = new NumbersClicListener();

        //Find the View that shows the number category
        TextView numbers = (TextView) findViewById(R.id.numbers);

        //Set a clickListener on that View
        numbers.setOnClickListener(clicListener);
    }

  
}
