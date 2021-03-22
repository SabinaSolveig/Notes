package com.example.myapplicationnotes;

import android.app.Application;

import androidx.room.Room;

import com.example.myapplicationnotes.data.AppDataBase;
import com.example.myapplicationnotes.data.NoteDao;

public class App extends Application {

    private AppDataBase dataBase;
    private NoteDao noteDao;

    private static App instance;

    public static App getInstance() {
        return instance; //синглтон
    }

    @Override
    public void onCreate(){
        super.onCreate();

        instance = this;

        dataBase = Room.databaseBuilder(getApplicationContext(),
                AppDataBase.class, "app-data_base-name")
                .allowMainThreadQueries()
                .build();

        noteDao = dataBase.noteDao();
    }

    public AppDataBase getDataBase() {
        return dataBase;
    }

    public void setDataBase(AppDataBase dataBase) {
        this.dataBase = dataBase;
    }

    public NoteDao getNoteDao() {
        return noteDao;
    }

    public void setNoteDao(NoteDao noteDao) {
        this.noteDao = noteDao;
    }
}

