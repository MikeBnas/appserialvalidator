package com.appserialvalidator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button = findViewById(R.id.buttonval);
        TextView textView = findViewById(R.id.serial);
        EditText editText = findViewById(R.id.inputcode);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String codeFinal = editText.getText().toString();
                String preCode = codeFinal.substring(5, 9);
                String postCode = codeFinal.substring(25, 29);
                String validCode = postCode + preCode;
                textView.setText(validCode.toUpperCase());
            }
        });
    }
}