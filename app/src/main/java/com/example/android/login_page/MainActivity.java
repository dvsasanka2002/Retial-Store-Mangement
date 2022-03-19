package com.example.android.login_page;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.example.android.login_page.DAO.UserDao;
import com.example.android.login_page.DataBaseHelper.DBHelper;

public class MainActivity extends AppCompatActivity {

    Button mRegisterButton;
    Button mLoginButton;
    DBHelper dbHelper;
    EditText mUsername;
    EditText mPassword;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mRegisterButton = findViewById(R.id.button_signup);
        mLoginButton = findViewById(R.id.button_signin);
        dbHelper = new DBHelper(this);
        mUsername = findViewById(R.id.et_username);
        mPassword = findViewById(R.id.et_password);
        mRegisterButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,SignUpActivity.class);
                startActivity(intent);
            }
        });
        mLoginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                SQLiteDatabase db = dbHelper.getReadableDatabase();
                String email = mUsername.getText().toString();
                String password = mPassword.getText().toString();
                if(UserDao.getUserDetails(db,email,password)!=null){
                   Cursor cursor = UserDao.getUserDetails(db,email,password);
                };
            }
        });
    }
}