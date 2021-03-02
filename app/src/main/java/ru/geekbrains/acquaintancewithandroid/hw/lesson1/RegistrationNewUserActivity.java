package ru.geekbrains.acquaintancewithandroid.hw.lesson1;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class RegistrationNewUserActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reg_layout);

        Button btnGoToMain = findViewById(R.id.btnGoToMain);
        btnGoToMain.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentHome = new Intent(RegistrationNewUserActivity.this, MainActivity.class);
                startActivity(intentHome);
            }
        });

    }
}
