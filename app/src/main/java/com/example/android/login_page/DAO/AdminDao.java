package com.example.android.login_page.DAO;

import android.provider.BaseColumns;

public class AdminDao implements BaseColumns {
    public static final String TABLE_NAME = "ADMIN";
    public static final String COLUMN_NAME_ADMIN_ID = "ADMIN_ID";
    public static final String COLUMN_NAME_EMAIL = "EMAIL";
    public static final String COLUMN_NAME_PASSWORD = "PASSWORD";
    public static final String SQL_CREATE_TABLE = "CREATE TABLE "+ TABLE_NAME + "(" + COLUMN_NAME_ADMIN_ID + " INTEGER PRIMARY KEY," +
            COLUMN_NAME_EMAIL + " TEXT," + COLUMN_NAME_PASSWORD + " TEXT)";
    public static final String SQL_DELETE_TABLE = "DROP TABLE IF EXISTS " + TABLE_NAME;
}
