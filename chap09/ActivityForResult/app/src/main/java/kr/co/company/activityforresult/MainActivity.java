package kr.co.company.activityforresult;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    static final int GET_RESULT = 1;
    TextView text;
    private EditText edit1, edit2, edit3;

    @Override
    public void onCreate(Bundle icicle) {
        super.onCreate(icicle);
        setContentView(R.layout.activity_main);

        Button button = (Button) findViewById(R.id.button);
        edit1 = (EditText) findViewById(R.id.edit1);
        edit2 = (EditText) findViewById(R.id.edit2);
        edit3 = (EditText) findViewById(R.id.edit3);
        button.setOnClickListener(new View.OnClickListener() {
            // @Override
            public void onClick(View arg0) {
                Intent in = new Intent(MainActivity.this, SubActivity.class);
                in.putExtra("number1", Integer.parseInt(edit1.getText().toString()));
                in.putExtra("number2", Integer.parseInt(edit2.getText().toString()));
                startActivityForResult(in, GET_RESULT);
            }
        });
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        if (requestCode == GET_RESULT) {
            if (resultCode == RESULT_OK) {
                edit3.setText(""+data.getIntExtra("RESULT", 0));
            }
        }
    }
}
