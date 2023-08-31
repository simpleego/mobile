package kr.co.company.visualtool2lab;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void onClicked(View v) {
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("tel:010-1234-5678"));
        startActivity(intent);
    }
}