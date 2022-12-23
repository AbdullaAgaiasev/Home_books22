package com.example.home_books;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import java.security.Key;

import kotlin.Suppress;

public class DescriptionActivity extends AppCompatActivity {

    TextView textView;
    ImageView imageView;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_description);
        textView = findViewById(R.id.book_info_tv);
        imageView=findViewById(R.id.book_tv2);
        Intent intent = getIntent();

        imageView.setImageResource(intent.getIntExtra("desc",0));
        textView.setText(intent.getStringExtra("desc"));
    }
}