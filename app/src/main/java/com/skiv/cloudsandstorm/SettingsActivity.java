package com.skiv.cloudsandstorm;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.skiv.sobiraika.R;

public class SettingsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.settings);
    }

    public void onNormal(View view) {
        Intent intent = new Intent(SettingsActivity.this, MainActivity.class);
        intent.putExtra("deep", 3);
        intent.putExtra("matrix_size", 5);
        startActivity(intent);
    }

    public void onHard(View view) {
        Intent intent = new Intent(SettingsActivity.this, MainActivity.class);
        intent.putExtra("deep", 5);
        intent.putExtra("matrix_size", 7);
        startActivity(intent);
    }

    public void onImposible(View view) {
        Intent intent = new Intent(SettingsActivity.this, MainActivity.class);
        intent.putExtra("deep", 8);
        intent.putExtra("matrix_size", 8);
        startActivity(intent);
    }
}
