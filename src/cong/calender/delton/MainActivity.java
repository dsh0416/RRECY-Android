package cong.calender.delton;

import android.os.Bundle;
import android.annotation.SuppressLint;
import android.app.Activity;
import android.view.Menu;
import android.webkit.WebSettings;
import android.webkit.WebView;

@SuppressLint("SetJavaScriptEnabled")
public class MainActivity extends Activity {
	
	 
	 
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		setTitle("从娘二次元老黄历 β");
		WebView webView = (WebView) findViewById(R.id.webViewDisplay);
        WebSettings settingsWebView = webView.getSettings();
        settingsWebView.setJavaScriptEnabled(true);
        webView.loadUrl( "file:///android_asset/rrecy.htm");
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return false;
	}

}
