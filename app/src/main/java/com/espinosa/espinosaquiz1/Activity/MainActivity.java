package com.espinosa.espinosaquiz1.Activity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ListView;

import com.espinosa.espinosaquiz1.Model.AndroidVersions;
import com.espinosa.espinosaquiz1.R;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    String[] androidVersions;
    ListView lv_androidVersions;
    ArrayList<AndroidVersions> listAndroidVersions;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

/*        androidVersions = getResources().getStringArray(R.array.AndroidVersions);
        lv_androidVersions = (ListView) findViewById(R.id.lvAndroidVersions);
        listAndroidVersions =  new ArrayList<AndroidVersions>();

        for (int i = 0; i < androidVersions.length; i++) {
            listAndroidVersions.add(new AndroidVersions(androidVersions[i]));
        }*/

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

