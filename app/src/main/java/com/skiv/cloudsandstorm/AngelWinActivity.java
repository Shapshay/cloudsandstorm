package com.skiv.cloudsandstorm;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.skiv.sobiraika.R;

public class AngelWinActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.angel_win);
    }

    public void onAgain(View view) {
        Intent intent = new Intent(AngelWinActivity.this, MenuActivity.class);
        startActivity(intent);
        finish();
    }
}
