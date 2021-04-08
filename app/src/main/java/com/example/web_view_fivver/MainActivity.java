package com.example.web_view_fivver;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class MainActivity extends AppCompatActivity {

    WebView webView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


       webView = findViewById(R.id.web_view);

       webView.setWebViewClient(new WebViewClient());
       webView.loadUrl("https://usagamerland.blogspot.com");
       webView.setScrollBarStyle(View.SCROLLBARS_INSIDE_OVERLAY);
       webView.setBackgroundColor(9);


       webView.getSettings().setRenderPriority(WebSettings.RenderPriority.HIGH);
       webView.getSettings().setCacheMode(WebSettings.LOAD_CACHE_ELSE_NETWORK);
       webView.getSettings().setAppCacheEnabled(true);




        WebSettings webSettings =webView.getSettings();
        webSettings.setJavaScriptEnabled(true);
        webSettings.setSupportZoom(false);
        webSettings.setAppCacheEnabled(true);
        webSettings.setLoadsImagesAutomatically(true);
        webSettings.setDisplayZoomControls(false);

        webSettings.setDomStorageEnabled(true);
        webSettings.setLayoutAlgorithm(WebSettings.LayoutAlgorithm.NORMAL);
        webSettings.setUseWideViewPort(true);
        webSettings.setSavePassword(true);
        webSettings.setSaveFormData(true);
        webSettings.setEnableSmoothTransition(true);


        webView.setOnKeyListener(new View.OnKeyListener() {
            @Override
            public boolean onKey(View v, int keyCode, KeyEvent event) {
                if ((keyCode == KeyEvent.KEYCODE_BACK) && webView.canGoBack()) {
                    webView.goBack();
                    return true;
                }

                return false;
            }
        });





    }



}
