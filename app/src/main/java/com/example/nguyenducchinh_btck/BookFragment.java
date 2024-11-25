package com.example.nguyenducchinh_btck;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.lang.reflect.Array;
import java.util.ArrayList;


public class BookFragment extends Fragment {


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view =inflater.inflate(R.layout.fragment_book, container, false);
        RecyclerView recyclerView =view.findViewById(R.id.recyclerView);

        ArrayList<Book> books = new ArrayList<>();
        //generate 4 books
        books.add(new Book("The Alchemist", "Paulo Coelho", R.drawable.book1));
        books.add(new Book("The Da Vinci Code", "Dan Brown", R.drawable.book2));
        books.add(new Book("The Great Gatsby", "F. Scott Fitzgerald", R.drawable.book3));
        books.add(new Book("The Catcher in the Rye", "J.D. Salinger", R.drawable.book4));


        BookAdapter adapter = new BookAdapter(getActivity(), books);
        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
        recyclerView.setAdapter(adapter);
        return view;


    }
}