package com.espinosa.espinosaquiz1.Activity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.espinosa.espinosaquiz1.R;

public class MarshmallowActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_marshmallow);
    }

    public void jellybeanIntent(View view) {
        Intent intent = new Intent(this, JellybeanActivity.class);
        startActivity(intent);
    }

    public void kitkatIntent(View view) {
        Intent intent = new Intent(this, KitkatActivity.class);
        startActivity(intent);
    }

    public void homeIntent(View view) {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
}
