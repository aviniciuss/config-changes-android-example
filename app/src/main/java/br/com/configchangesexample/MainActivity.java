package br.com.configchangesexample;

import android.content.res.Configuration;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.webkit.WebSettings;
import android.webkit.WebView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        WebView webView = (WebView) findViewById(R.id.web_view);
        WebSettings settings = webView.getSettings();
        settings.setJavaScriptEnabled(true);
        settings.setSupportZoom(false);
        webView.loadUrl("https://www.focusconcursos.com.br/focus-online/");
    }

    @Override
    public void onConfigurationChanged(Configuration newConfig) {
        super.onConfigurationChanged(newConfig);

        if(newConfig.orientation == Configuration.ORIENTATION_LANDSCAPE) {
            // configure screen actions landscape
        } else {
            // configure screen actions portrait
        }
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.i("LOG", "onStart()");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.i("LOG", "onResume()");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.i("LOG", "onPause()");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i("LOG", "onDestroy()");
    }
}
