package com.skiv.cloudsandstorm;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.skiv.sobiraika.R;

public class StandoffActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.standoff);
    }

    public void onAgain(View view) {
        Intent intent = new Intent(StandoffActivity.this, SettingsActivity.class);
        startActivity(intent);
        finish();
    }
}
