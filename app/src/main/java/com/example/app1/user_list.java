package com.example.app1;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toolbar;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class user_list extends AppCompatActivity {
Toolbar toolUser;
RecyclerView recycler;
FloatingActionButton btnAdd;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_list);
        addcontroll();
        addEvent();
    }

    private void addEvent() {
        btnAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(user_list.this, create_user.class);
                startActivity(intent);
            }
        });
    }

    private void addcontroll() {
        btnAdd = findViewById(R.id.btnAdd);
//        toolUser = findViewById(R.id.toolUser);
        recycler = findViewById(R.id.recycler);
    }
}
