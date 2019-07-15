package com.example.alc4android;

import androidx.appcompat.app.AppCompatActivity;

import android.net.http.SslError;
import android.os.Bundle;
import android.webkit.SslErrorHandler;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class ActivityB extends AppCompatActivity {

    private WebView about_webview;

      @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_b);

          about_webview = findViewById(R.id.about_webview);
          about_webview.setWebViewClient(new WebViewClient() {
              @Override public void onReceivedSslError(WebView v, SslErrorHandler handler, SslError er){ handler.proceed(); }});
          about_webview.loadUrl("https://andela.com/alc/");
          about_webview.getSettings().setJavaScriptEnabled(true);


      }
}
