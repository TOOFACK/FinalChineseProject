package com.example.com.finalchineseproject;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class TranslitWord extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_translit_word);



    }

    public void Save(View view) {

        EditText RusDef = findViewById(R.id.DefenitionRus);
        EditText RusTrl = findViewById(R.id.TranslaetWordRus);
        EditText EngDef = findViewById(R.id.DefenitionEng);
        EditText EngTrl = findViewById(R.id.TranslaetWordEng);
        EditText ChiDef = findViewById(R.id.DefenitionChi);
        EditText ChiTrl = findViewById(R.id.TranslaetWordChi);
        EditText JapDef = findViewById(R.id.DefenitionJap);
        EditText JapTrl = findViewById(R.id.TranslaetWordJap);

        RusTrl.setEnabled(false);
        EngDef.setEnabled(false);
        EngTrl.setEnabled(false);
        RusDef.setEnabled(false);
        ChiDef.setEnabled(false);
        ChiTrl.setEnabled(false);
        JapDef.setEnabled(false);
        JapTrl.setEnabled(false);



    }

    public void Change(View view) {
        EditText RusDef = findViewById(R.id.DefenitionRus);
        EditText RusTrl = findViewById(R.id.TranslaetWordRus);
        EditText EngDef = findViewById(R.id.DefenitionEng);
        EditText EngTrl = findViewById(R.id.TranslaetWordEng);
        EditText ChiDef = findViewById(R.id.DefenitionChi);
        EditText ChiTrl = findViewById(R.id.TranslaetWordChi);
        EditText JapDef = findViewById(R.id.DefenitionJap);
        EditText JapTrl = findViewById(R.id.TranslaetWordJap);

        RusTrl.setEnabled(true);
        EngDef.setEnabled(true);
        EngTrl.setEnabled(true);
        RusDef.setEnabled(true);
        ChiDef.setEnabled(true);
        ChiTrl.setEnabled(true);
        JapDef.setEnabled(true);
        JapTrl.setEnabled(true);

        RusTrl.setTextColor(Color.parseColor("#000000"));
        RusDef.setTextColor(Color.parseColor("#000000"));
        EngDef.setTextColor(Color.parseColor("#000000"));
        EngTrl.setTextColor(Color.parseColor("#000000"));
        ChiDef.setTextColor(Color.parseColor("#000000"));
        ChiTrl.setTextColor(Color.parseColor("#000000"));
        JapDef.setTextColor(Color.parseColor("#000000"));
        JapTrl.setTextColor(Color.parseColor("#000000"));
    }

}
