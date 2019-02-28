package com.example.rohitkumarbhamu.exodia2k19;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;
import android.widget.EditText;

public class VisitOurWebsite extends Activity {
    EditText url;
    WebView ourBrow;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_visit_our_website);

        ourBrow = (WebView) findViewById(R.id.wvBrowser);

        ourBrow.getSettings().setJavaScriptEnabled(true);
        ourBrow.getSettings().setLoadWithOverviewMode(true);
        ourBrow.getSettings().setUseWideViewPort(true);
        ourBrow.setWebViewClient(new ourViewClient());
        try {
            ourBrow.loadUrl("https://www.exodia.in/");
        }catch (Exception e){
            e.printStackTrace();
        }


    }
}
