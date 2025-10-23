package com.example.thegivingrack;

// 1. ADD MISSING IMPORTS
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;

public class ThirdActivity extends AppCompatActivity {

    // 2. ADD THE ESSENTIAL onCreate METHOD
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // This line connects your Java file to your XML layout file.
        // It tells the activity to display the contents of "third_activity.xml".
        setContentView(R.layout.third_activity);

        // You can now add code here to control buttons, text fields, etc.
        // from your third_activity.xml layout.
    }
}
