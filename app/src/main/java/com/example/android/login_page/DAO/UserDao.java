package com.example.android.login_page.DAO;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.provider.BaseColumns;

public class UserDao implements BaseColumns {
    public static final String TABLE_NAME = "User";
    //public static final String COLUMN_NAME_UID = "UID";
    public static final String COLUMN_NAME_EMAIL = "EMAIL";
    public static final String COLUMN_NAME_USERNAME = "USERNAME";
    public static final String COLUMN_NAME_PASSWORD = "PASSWORD";
    public static final String COLUMN_NAME_LOCATION = "LOCATION";
    public static final String COLUMN_NAME_PHONE = "PHONE";

    public static final String SQL_CREATE_TABLE = "CREATE TABLE " + UserDao.TABLE_NAME + "("
            + UserDao.COLUMN_NAME_EMAIL + " TEXT PRIMARY KEY, " + COLUMN_NAME_USERNAME + " TEXT, "
            + COLUMN_NAME_PASSWORD + " TEXT, " + COLUMN_NAME_LOCATION + " TEXT, "
            + COLUMN_NAME_PHONE + " TEXT)";
    public static final String SQL_DELETE_TABLE = "DROP TABLE IF EXISTS " + TABLE_NAME;

    public static boolean insertValues(SQLiteDatabase db, ContentValues values){
        long newUID = db.insert(TABLE_NAME,null,values);
        return newUID != -1;
    }


    public static Cursor getUserDetails(SQLiteDatabase db,String email,String password){
        String selection = COLUMN_NAME_EMAIL + " = ? " + "AND " + COLUMN_NAME_PASSWORD + " = ? ";
        String[] selectionArgs = {email,password};
        return (db.query(TABLE_NAME,null,selection,selectionArgs,null,null,null));
    }
}
