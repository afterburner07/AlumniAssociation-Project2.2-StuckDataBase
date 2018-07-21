package com.example.abrarfahim.alumniassociation;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class SearchFilter extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search_filter);
    }
    public void backButtonClicked(View v) {
        finish();
    }
}
