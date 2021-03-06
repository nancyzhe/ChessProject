package com.example.chessproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class about_page extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about_page);

        Button buttonMainMenu = findViewById(R.id.mainMenuButton);

        buttonMainMenu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View V) {
                moveToMainMenu();
            }
        });
    }

    private void moveToMainMenu() {
        Intent intent = new Intent(about_page.this, MainActivity.class);
        startActivity(intent);
    }
}
