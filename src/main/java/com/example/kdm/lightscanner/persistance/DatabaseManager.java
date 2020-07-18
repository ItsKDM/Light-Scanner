package com.example.kdm.lightscanner.persistance;


import androidx.room.Database;
import androidx.room.RoomDatabase;

import com.example.kdm.lightscanner.models.LocalPdf;

/**
 * Created by Lekan Adigun on 2/13/2018.
 */

@Database(entities = {LocalPdf.class}, version = 1)
public abstract class DatabaseManager extends RoomDatabase {

    public abstract LocalPdfDao localPdfDao();
}
