package com.example.intent;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.webkit.WebView;

public class WebViewActivity extends AppCompatActivity {

    private WebView wv;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.intent2);
        Intent intent = getIntent();
        Bundle bundle = intent.getExtras();
        String url = bundle.getString("url");
        Log.i("testWeb",url);
        wv = (WebView)findViewById(R.id.main_webview);
        wv.getSettings().setJavaScriptEnabled(true);
        wv.setWebViewClient(new MyWebViewClient());
        wv.loadUrl(url);
    }
}
