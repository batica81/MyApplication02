package com.example.voja.myapplication02;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_main);

        WebView myWebView = new WebView(activityContext);
        setContentView(myWebView);

        WebView myWebView = (WebView) findViewById(R.id.webview);
        WebSettings webSettings = myWebView.getSettings();
        webSettings.setJavaScriptEnabled(true);


//        WebView myWebView = new WebView(activityContext);
        setContentView(myWebView);

        myWebView.loadUrl("http://www.example.com");

    }
}
