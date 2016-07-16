package com.skiv.cloudsandstorm;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.skiv.sobiraika.R;

public class ChertWinActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.chert_win);
    }

    public void onAgain(View view) {
        Intent intent = new Intent(ChertWinActivity.this, MenuActivity.class);
        startActivity(intent);
        finish();
    }
}
