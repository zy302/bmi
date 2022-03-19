package com.example.bmi;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.googlecode.aviator.AviatorEvaluator;

public class MainActivity extends AppCompatActivity {

    String eval(String expr){
        return AviatorEvaluator.execute(expr).toString();
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gridlayout);
    }
}