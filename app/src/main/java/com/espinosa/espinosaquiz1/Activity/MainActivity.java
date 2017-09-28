package com.espinosa.espinosaquiz1.Activity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.espinosa.espinosaquiz1.R;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ListView avList;
    String androidVersions[] = {"Press 1 to select Jelly Bean", "Press 2 to select Kitkat", "Press 3 to select Marshmallow"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        avList = (ListView) findViewById(R.id.lvAndroidVersions);
        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<>(this, R.layout.activity_listview, R.id.textView, androidVersions);
        avList.setAdapter(arrayAdapter);

    }

    public void jellybeanIntent(View view) {
        Intent intent = new Intent(this, JellybeanActivity.class);
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

