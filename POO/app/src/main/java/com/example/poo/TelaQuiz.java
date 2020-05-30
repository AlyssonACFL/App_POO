package com.example.poo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;

public class TelaQuiz extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_tela_quiz);

        WebView webQuiz = findViewById(R.id.wbQuiz);
        WebSettings config = webQuiz.getSettings();
        config.setJavaScriptEnabled(true);
        webQuiz.loadUrl("https://docs.google.com/forms/d/e/1FAIpQLSfsPzALt9NWIA5MyiuTOvlU7mETvn826P3-SkjzGltQVYtalw/viewform?usp=sf_link");

    }
}
