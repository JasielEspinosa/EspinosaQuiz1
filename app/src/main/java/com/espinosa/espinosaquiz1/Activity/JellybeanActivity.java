package com.espinosa.espinosaquiz1.Activity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.espinosa.espinosaquiz1.R;

public class JellybeanActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_jellybean);
    }

    public void homeIntent(View view) {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }

    public void kitkatIntent(View view) {
        Intent intent = new Intent(this, KitkatActivity.class);
        startActivity(intent);
    }

    public void marshmallowIntent(View view) {
        Intent intent = new Intent(this, MarshmallowActivity.class);
        startActivity(intent);
    }

}
