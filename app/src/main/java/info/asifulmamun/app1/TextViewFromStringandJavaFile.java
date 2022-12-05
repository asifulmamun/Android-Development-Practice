package info.asifulmamun.app1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class TextViewFromStringandJavaFile extends AppCompatActivity {

    // Data Type/ Variable
    TextView myWebsite;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_text_view_from_stringand_java_file);

        // Find and connect by id website with myWebsite variable
        myWebsite = findViewById(R.id.website);

        // Change / Override the website data from here - It will change after build, design mode time showing the xml/actual content
        myWebsite.setText("www.asifulmamun.info - set from JAVA File");

    }
}