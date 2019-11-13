package com.retrofit.mywebviewapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class MainActivity extends AppCompatActivity {

    private WebView webView;

    public final String URL = "https://aleksandaranicic.com";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        webView = findViewById(R.id.mWebView);
        WebSettings mWebSetting = webView.getSettings();

        //Enable JavaScript
        mWebSetting.setJavaScriptEnabled(true);


        // Default Client
        webView.setWebViewClient(new WebViewClient());

        // Load Url
        webView.loadUrl(URL);

    }
}
