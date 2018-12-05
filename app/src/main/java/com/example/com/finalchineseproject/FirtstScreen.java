package com.example.com.finalchineseproject;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class FirtstScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_firtst_screen);

    }

    public void Search(View view) {
        EditText WordForTranslate = findViewById(R.id.WordForTranslate);
        Intent intent = new Intent(this,TranslitWord.class);
        String Word = WordForTranslate.getText().toString();
        startActivity(intent);
    }
}
