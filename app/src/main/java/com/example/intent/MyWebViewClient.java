package com.example.intent;

import android.webkit.WebView;
import android.webkit.WebViewClient;

public class MyWebViewClient extends WebViewClient {
    public boolean shouldOverrideUrlLoading(WebView webView, String url){
        webView.loadUrl(url);                       //就是这句话，让每个超链接都在app的webview打开，而不是浏览器
        return true;
    }
}