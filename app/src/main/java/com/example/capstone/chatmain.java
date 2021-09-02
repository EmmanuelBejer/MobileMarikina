package com.example.capstone;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;


import androidx.appcompat.app.ActionBar;
import android.os.Bundle;


import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import java.util.ArrayList;

import adapter.ChatAdapter;
import model.ChatModel;

public class chatmain extends AppCompatActivity {

    private RecyclerView recyclerView;
    private EditText messagebox;
    private Button btnSend;
    final ArrayList<ChatModel> chatModels = new ArrayList<>();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getSupportActionBar().setTitle("LiveChat");
        ActionBar actionBar = getSupportActionBar();
        actionBar.setDisplayHomeAsUpEnabled(true);


        recyclerView = findViewById(R.id.chat_list);
        messagebox = findViewById(R.id.et_chat_box);
        btnSend = findViewById(R.id.btn_chat_send);

        btnSend.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int i =1;
                i ++;
                ChatModel chatModel = new ChatModel();
                chatModel.setId(i);
                chatModel.setMsgr1(true);
                chatModel.setMessage(messagebox.getText().toString().trim());

                chatModels.add(chatModel);

                ChatAdapter chatAdapter = new ChatAdapter(chatModels, chatmain.this);
                recyclerView.setHasFixedSize(true);
                recyclerView.setLayoutManager(new LinearLayoutManager(chatmain.this));
                recyclerView.setAdapter(chatAdapter);
                messagebox.setText("");






            }
        });
    }
}