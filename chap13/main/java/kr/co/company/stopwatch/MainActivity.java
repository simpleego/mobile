package kr.co.company.stopwatch;

import android.view.View;
import android.os.Bundle;
import java.util.Locale;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import kr.co.company.stopwatch.R;

public class MainActivity extends AppCompatActivity {

    private int seconds = 0;
    private boolean running;
    private boolean wasRunning;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final TextView text = (TextView) findViewById(R.id.textView1);

        new Thread(new Runnable() {
            public void run() {
                while (true){
                    if (running) {
                        seconds++;
                    }
                    int hours = seconds / 3600;
                    int minutes = (seconds % 3600) / 60;
                    int secs = seconds % 60;

                    String time = String.format(Locale.getDefault(),
                            "%d:%02d:%02d", hours, minutes, secs);

                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                    }
                    text.post(new Runnable() {
                        public void run() {
                            text.setText(time);
                        }
                    });
                }
            }
        }).start();
    }

    public void start(View view) {
        running = true;
    }

    public void stop(View view) {
        running = false;
    }

    public void reset(View view) {
        running = false;
        seconds = 0;
    }
}
