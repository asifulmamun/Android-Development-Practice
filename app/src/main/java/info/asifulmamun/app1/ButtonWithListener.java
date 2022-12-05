package info.asifulmamun.app1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class ButtonWithListener extends AppCompatActivity implements View.OnClickListener {

    // variable init
    TextView btnResult;
    Button btn01, btn02, btn03;

    // counter for clicked
    int count = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_button_with_listener);

        // Select ID from activity | Value init
        btnResult = findViewById(R.id.btnResultID);
        btn01 = findViewById(R.id.buttonID01);
        btn02 = findViewById(R.id.buttonID02);
        btn03 = findViewById(R.id.buttonID03);

        // Method 01
        btn01.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                count++;
                btnResult.setText("Clicked from Button 01 Clicked " + count + " times, With method 01 - btn01.setOnClickListener");
            }
        });

        // Listening | It will work method 02
//        btn01.setOnClickListener(this);
        btn02.setOnClickListener(this);
//        btn03.setOnClickListener(this);

    }

    // Method 02 | working click from Listening
    @Override
    public void onClick(View view) {
        if (view.getId() == R.id.buttonID01){
            count++;
            btnResult.setText("Clicked from Button 01 Clicked " + count + " times, With method 02, public class onclick");

        }
        if (view.getId() == R.id.buttonID02){
            count++;
            btnResult.setText("Clicked from Button 02 Clicked " + count + " times, With method 02, public class onclick");

        }
        if (view.getId() == R.id.buttonID03){
            count++;
            btnResult.setText("Clicked from Button 03 Clicked " + count + " times, With method 02, public class onclick");

        }
    }

    public void xmlButton(View view) {
        count++;
        btnResult.setText("Clicked from Button 03 Clicked | XML " + count + " times, With method 03/xml, public class onclick");

    }
}