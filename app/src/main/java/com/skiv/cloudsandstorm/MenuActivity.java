package com.skiv.cloudsandstorm;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.skiv.sobiraika.R;

public class MenuActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.menu);
    }

    public void onPlay(View view) {
        Intent intent = new Intent(MenuActivity.this, SettingsActivity.class);
        startActivity(intent);
        finish();
    }

    public void onPlayTwo(View view) {
        Intent intent = new Intent(MenuActivity.this, SettingsTwoActivity.class);
        startActivity(intent);
        finish();
    }

    public void onRules(View view) {
        Intent intent = new Intent(MenuActivity.this, RulesActivity.class);
        startActivity(intent);
    }

    public void onExit(View view) {
        this.finish();
    }
}
