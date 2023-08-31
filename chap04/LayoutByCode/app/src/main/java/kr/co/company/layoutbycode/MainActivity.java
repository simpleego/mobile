package kr.co.company.layoutbycode;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {

    @Override
    public void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        LinearLayout manager =
                (LinearLayout)findViewById(R.id.LayoutManager);
        manager.setOrientation(LinearLayout.HORIZONTAL);


    }

}