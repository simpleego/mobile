package kr.co.company.multipage;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;

public class MultiPageActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

	public void myListener(View target) {
		Intent intent = new Intent(getApplicationContext(), IntroActivity.class);
		startActivity(intent);
	}
	public void myListener1(View target) {
		Intent intent = new Intent(getApplicationContext(), SetupActivity.class);
		startActivity(intent);
	}
	public void myListener2(View target) {
		Intent intent = new Intent(getApplicationContext(), StartActivity.class);
		startActivity(intent);
	}
}
