package com.example.rohitkumarbhamu.exodia2k19;

import android.webkit.WebView;
import android.webkit.WebViewClient;

class ourViewClient extends WebViewClient {
    @Override
    public boolean shouldOverrideUrlLoading(WebView v, String url) {
        v.loadUrl(url);
        return true;
    }
}
