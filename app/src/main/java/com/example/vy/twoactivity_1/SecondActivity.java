package com.example.vy.twoactivity_1;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.View;

/**
 * Created by vy on 07.04.2015.
 */
public class SecondActivity extends ActionBarActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_two);
    }
    public void onClick(View view){
        Intent intent = new Intent(SecondActivity.this,ThirdActivity.class);
        startActivity(intent);
    }
}
