package com.example.to_do_list;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;

public class webapp extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_webapp);

        Intent intent = getIntent();
        String url = intent.getStringExtra(MainActivity.EXTRA_URL);

        WebView webView = findViewById(R.id.webview);
        webView.loadUrl(url);

        WebSettings webSettings = webView.getSettings();
        webSettings.setJavaScriptEnabled(true);

    }
}
