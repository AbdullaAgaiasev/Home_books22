package com.example.home_books;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

public class BookViewHolder extends RecyclerView.ViewHolder {

    ImageView bookImageView;
    TextView bookTitleTextView;
    TextView bookDescriptionTextView;
    CardView cardView;

    public BookViewHolder(@NonNull View itemView) {
        super(itemView);
        bookImageView = itemView.findViewById(R.id.book_tv);
        bookTitleTextView = itemView.findViewById(R.id.book_title_tv);
        bookDescriptionTextView = itemView.findViewById(R.id.book_desc_tv);
        cardView = itemView.findViewById(R.id.item_book);

    }
    public void bind(int image, String title, String description) {
        bookImageView.setImageResource(image);
        bookTitleTextView.setText(title);
        bookDescriptionTextView.setText(description);

    }
    }
