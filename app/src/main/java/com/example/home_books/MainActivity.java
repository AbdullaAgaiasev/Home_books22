package com.example.home_books;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements ItemClickListener {

    private String KEY = "desc";

    private RecyclerView booksRecyclerView;
    private ArrayList<BookModel> bookList = new ArrayList<>();
    private BookAdapter bookAdapter = new BookAdapter(bookList, this);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        booksRecyclerView = findViewById(R.id.books_rv);
        loadBooks();
        booksRecyclerView.setAdapter(bookAdapter);
    }

    private void loadBooks() {
        bookList.add(new BookModel(R.drawable.supernatural,"Cверхъестественное","Два брата убивающие призраков"));
        bookList.add(new BookModel(R.drawable.bruce_lee,"Брюс ли","Мастер боевых искусств"));
        bookList.add(new BookModel(R.drawable.salahaddin,"Салахаддин","Салах ад-Дин (Салахаддин, был мусульманским лидером двенадцатого века, военачальником и султаном Сирии и Египта"));
        bookList.add(new BookModel(R.drawable.halid,"Халид Ибн Аль Валид","Обнаженный меч Аллаха "));
        bookList.add(new BookModel(R.drawable.ip_man,"Ип ман","Мастер китайских боевых искусств"));
        bookList.add(new BookModel(R.drawable.rambo_2,"Рэмбо","«Рэмбо» — серия боевиков, выходивших с 1982 по 2019 год. Центральный персонаж фильмов, Джон Рэмбо, ветеран войны во Вьетнаме"));
        bookList.add(new BookModel(R.drawable.terminator,"Терминатор","«Термина́тор» — американский научно-фантастический фильм 1984 года режиссёра Джеймса Кэмерона"));
        bookList.add(new BookModel(R.drawable.matrica,"Матрица","Мир Матрицы — это иллюзия, существующая только в бесконечном сне обреченного человечества"));
    }

    @Override
    public void onItemClick(BookModel bookModel) {
        Intent intent = new Intent(MainActivity.this,DescriptionActivity.class);
        intent.putExtra(KEY, bookModel.description);
        intent.putExtra(KEY,bookModel.image);
        startActivity(intent);
    }
}