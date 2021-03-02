package ru.geekbrains.acquaintancewithandroid.hw.lesson1;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class PlayActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_play_layout);

        TextView greeting = findViewById(R.id.textViewGreeting);
        TextView question = findViewById((R.id.textViewQuestion));
        int a = 2;
        int b = 5;
        int c;
        Bundle arguments = getIntent().getExtras();
        String nameUser = arguments.get("user").toString();
        greeting.setText("Привет, " + nameUser);


        question.setText(a + " x " + b + " = ?");

        Button btnGoToMain = findViewById(R.id.btnGoToMainFromPlay);
        btnGoToMain.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentHome = new Intent(PlayActivity.this, MainActivity.class);
                startActivity(intentHome);
            }
        });
    }
}
