package com.example.miwok;

import android.app.Activity;
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

        //Find the View that shows the number category
        TextView numbers = (TextView) findViewById(R.id.numbers);

        //Set a clickListener on that View numbers
        numbers.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Create new intent to open numbersIntent
                Intent numbersIntent = new Intent(MainActivity.this, NumbersActivity.class);
                //Start the NumbersActivity
                startActivity(numbersIntent);

            }
        });


        //Find the View that shows the family category
        TextView family = (TextView) findViewById(R.id.family);

        //Set a clickListener on that View family
        family.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Create new intent to open familyIntent
                Intent familyIntent = new Intent(MainActivity.this, FamilyActivity.class);
                //Start the FamilyActivity
                startActivity(familyIntent);

            }
        });


        //Find the View that shows the colors category
        TextView colors = (TextView) findViewById(R.id.colors);

        //Set a clickListener on that View colors
        colors.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Create new intent to open colorsIntent
                Intent colorsIntent = new Intent(MainActivity.this, ColorsActivity.class);
                //Start the ColorsActivity
                startActivity(colorsIntent);

            }
        });


        //Find the View that shows the phrases category
        TextView phrases = (TextView) findViewById(R.id.phrases);

        //Set a clickListener on that View phrases
        phrases.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Create new intent to open phrasesIntent
                Intent phrasesIntent = new Intent(MainActivity.this, PhrasesActivity.class);
                //Start the PhrasesActivity
                startActivity(phrasesIntent);

            }
        });

    }



    }
