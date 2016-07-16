package com.skiv.cloudsandstorm;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;

import com.skiv.sobiraika.R;

public class RulesActivity extends Activity {
    WebView rulesWeb;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.rules);
        rulesWeb = (WebView)findViewById(R.id.rulesWeb);
        rulesWeb.loadUrl("file:///android_asset/rules.html");

    }

    public void onPlay(View view) {
        Intent intent = new Intent(RulesActivity.this, SettingsActivity.class);
        startActivity(intent);
        finish();
    }
}
