package com.example.student;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class DataBase extends SQLiteOpenHelper {
    public final static String DATABASE_NAME = "Mystudent.db";
    public final static String TABLE_NAME = "students_table";
    public final static String COL_1 = "Rollno";
    public final static String COL_2 = "Name";
    public final static String COL_3 = "Section";
    public final static String COL_4 = "Email";
    public final static String COL_5 = "Phoneno";

    public DataBase(Context context) {
        super(context, DATABASE_NAME, null, 1);
    }

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {
        sqLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS " +
                TABLE_NAME + " (Rollno VARCHAR2(10) PRIMARY KEY ," +
                "Name TEXT NOT NULL," +
                "Section TEXT ," +
                "Email TEXT NOT NULL ," +
                "Phoneno INTEGER NOT NULL )");


    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {
        sqLiteDatabase.execSQL(" DROP TABLE IF EXISTS  " + TABLE_NAME);
        onCreate(sqLiteDatabase);

    }

    public boolean insertData(String roll, String name, String section, String email, String phone) {
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues contentvalues = new ContentValues();
        contentvalues.put(COL_1,roll);
        contentvalues.put(COL_2,name);
        contentvalues.put(COL_3,section);
        contentvalues.put(COL_4,email);
        contentvalues.put(COL_5,phone);
        long result=db.insert(TABLE_NAME,null,contentvalues);
        if(result==-1){
            return false;
        }
        else{
            return true;
        }
    }
    public boolean updateData(String Rollno, String name, String section, String email, String phoneno){
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues contentvalues = new ContentValues();
        contentvalues.put(COL_1,Rollno);
        contentvalues.put(COL_2,name);
        contentvalues.put(COL_3,section);
        contentvalues.put(COL_4,email);
        contentvalues.put(COL_5,phoneno);
        db.update(TABLE_NAME,contentvalues,"Rollno=?",new String[]{Rollno});
        return true;
    }
    public Cursor getData(String Rollno){
        SQLiteDatabase db = this.getWritableDatabase();
        String query="SELECT * FROM "+ TABLE_NAME + " WHERE upper(Rollno)= '"+ Rollno+"'" ;
        Cursor cursor = db.rawQuery(query,null);
        return cursor;

    }
    public Cursor getDataSec(String section){
        SQLiteDatabase db = this.getWritableDatabase();
        String query="SELECT * FROM "+ TABLE_NAME + " WHERE upper(Section)= '"+ section+"'" ;
        Cursor cursor = db.rawQuery(query,null);
        return cursor;
    }
    public Integer deleteData(String rollno){
        SQLiteDatabase db = this.getWritableDatabase();
        return db.delete(TABLE_NAME,"Rollno=?",new String[]{rollno});
    }
    public Cursor getAllData(){
        SQLiteDatabase db = this.getWritableDatabase();
        Cursor cursor = db.rawQuery("SELECT * FROM "+TABLE_NAME,null);
        return cursor;

    }
    public Integer deleteAll(){
        SQLiteDatabase db = this.getWritableDatabase();
        return db.delete(TABLE_NAME,null,null);

    }



}

