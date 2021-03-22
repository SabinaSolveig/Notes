package com.example.myapplicationnotes.data;

import android.provider.ContactsContract;

import androidx.room.Database;
import androidx.room.RoomDatabase;

@Database(entities = {ContactsContract.CommonDataKinds.Note.class}, version = 1, exportSchema = false)
public abstract class AppDataBase extends RoomDatabase {
    public abstract NoteDao noteDao();


}
