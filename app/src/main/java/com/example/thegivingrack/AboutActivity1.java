package com.example.thegivingrack;

import android.content.Intent; // Import for Intent
import android.os.Bundle;
import android.widget.Button;
import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import android.view.View; // Import for View

public class AboutActivity1 extends AppCompatActivity {

    // 1. Declare the button variable (no initialization yet)
    private Button aboutbackButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_about1);

        // 2. Initialize the button after setContentView()
        aboutbackButton = findViewById(R.id.aboutbackhome);

        // 3. Set the OnClickListener to handle the button press
        aboutbackButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Create an Intent to go from AboutActivity1 to MainActivity
                Intent intent = new Intent(AboutActivity1.this, MainActivity.class);

                // Optional: Use FLAG_ACTIVITY_CLEAR_TOP if you want to clear the back stack
                // intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP | Intent.FLAG_ACTIVITY_SINGLE_TOP);

                startActivity(intent);

                // Optional: call finish() if you don't want the user to be able to
                // navigate back to AboutActivity1 by pressing the back button
                // finish();
            }
        });

        // Existing EdgeToEdge and Insets code (keep this)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }
}