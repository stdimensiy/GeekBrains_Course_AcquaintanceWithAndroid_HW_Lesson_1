package ru.geekbrains.acquaintancewithandroid.hw.lesson1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first_layout);

        Button buttonLogin = findViewById(R.id.btnLogin);
        Button buttonReg = findViewById(R.id.btnReg);
        EditText userName = findViewById(R.id.textViewUserName);
        EditText userPass = findViewById(R.id.editTextUserPassword);
        TextView resultLoginMessage = findViewById(R.id.textViewResultLogin);


        buttonLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentLogin = new Intent(MainActivity.this, PlayActivity.class);
                //intentLogin.putExtra("hello", "hello Artem!");
                // Проверяем ввел ли пользователь имя, не оставил ли поле пустым
                if (userName.getText().toString().equals("")) {
                    resultLoginMessage.setText("Назовите себя, не оставляйте поле пустым.");
                } else {
                    if(userPass.getText().toString().equals("123456")){
                        intentLogin.putExtra("user", userName.getText().toString());
                        startActivity(intentLogin);
                    } else {
                        resultLoginMessage.setText("Введите правильный пароль!");
                    }
                }
            }
        });

        buttonReg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentReg = new Intent(MainActivity.this, RegistrationNewUserActivity.class);
                //intentLogin.putExtra("hello", "hello Artem!");
                startActivity(intentReg);
            }
        });
    }
}