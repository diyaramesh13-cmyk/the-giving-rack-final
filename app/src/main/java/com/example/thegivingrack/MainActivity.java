package com.example.thegivingrack;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    // 1. Declare all Button variables
    private Button loginButton;
    private Button signupButton;
    private Button hometoaboutButton; // Declaration is correct

    // REMOVED: Initialization must happen inside onCreate()
    // hometoaboutButton = findViewById(R.id.hometoabout);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        // 2. Initialize all buttons after the layout is set
        loginButton = findViewById(R.id.loginstart);
        signupButton = findViewById(R.id.signupstart);
        hometoaboutButton = findViewById(R.id.hometoabout); // FIX: Initialization moved here

        // --- Set up the listener for the LOGIN button ---
        loginButton.setOnClickListener(v -> {
            // Create an Intent to navigate to the login page (SecondActivity)
            Intent intent = new Intent(MainActivity.this, SecondActivity.class);
            startActivity(intent);
        });


        // --- Set up the listener for the SIGN UP button ---
        signupButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Call the navigation method
                navigateToSignUpPage();
            }
        });


        // --- WEAVE IN: Set up the listener for the HOME TO ABOUT button ---
        hometoaboutButton.setOnClickListener(v -> {
            // Create an Intent to navigate from MainActivity to AboutActivity1
            Intent intent = new Intent(MainActivity.this, AboutActivity1.class);
            startActivity(intent);
        });

        // Existing EdgeToEdge and Insets code
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    } // End of onCreate method.


    // This helper method makes your code cleaner
    private void navigateToSignUpPage() {
        Intent intent = new Intent(MainActivity.this, ThirdActivity.class);
        startActivity(intent);
    }

} // End of MainActivity class