package com.example.assignment2;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

public class Database extends SQLiteOpenHelper {
    public Database(@Nullable Context context, @Nullable String name, @Nullable SQLiteDatabase.CursorFactory factory, int version) {
        super(context, name, factory, version);
    }

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {
        String query1 = "create table dogs(breed text, age integer, color text, sex text)";
        sqLiteDatabase.execSQL(query1);
    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {

    }
    public void upload(String breed, Integer age, String color, String sex){
        ContentValues cv = new ContentValues();
        cv.put("breed", breed);
        cv.put("age", age);
        cv.put("color", color);
        cv.put("sex", sex);
        SQLiteDatabase db= getWritableDatabase();
        db.insert("dogs", null, cv);
        db.close();
    }
}
