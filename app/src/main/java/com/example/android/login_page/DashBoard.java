package com.example.android.login_page;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class DashBoard extends AppCompatActivity {

    TextView mUserDetails;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dash_board);
        mUserDetails = findViewById(R.id.tv_user_datails);
        Intent intent = getIntent();
        String username = intent.getStringExtra("username");
        String phone = intent.getStringExtra("phone");
        String email = intent.getStringExtra("email");
        String location = intent.getStringExtra("location");
        mUserDetails.setText("");
        mUserDetails.append(username+"\n"+email +"\n"+location + "\n" + phone + "\n");


    }
}