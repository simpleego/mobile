package kr.co.company.buttonevent3;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button button = (Button) findViewById(R.id.button);
        button.setOnClickListener((e) -> {
            Toast.makeText(getApplicationContext(),
                    "버튼이 눌러졌습니다", Toast.LENGTH_SHORT).show();
        });
    }
}
