package com.example.miwok;

import android.view.View;
import android.widget.Toast;

public class NumbersClicListener implements View.OnClickListener {

    @Override
    public void onClick(View view){
        Toast.makeText(view.getContext(),
                "Open The List of Numbers",
                Toast.LENGTH_SHORT).show();
    }

}
