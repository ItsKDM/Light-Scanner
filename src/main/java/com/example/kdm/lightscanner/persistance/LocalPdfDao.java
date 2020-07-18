package com.example.kdm.lightscanner.persistance;

import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;

import com.example.kdm.lightscanner.models.LocalPdf;

import java.util.List;

/**
 * Created by Lekan Adigun on 2/13/2018.
 */

@Dao
public interface LocalPdfDao {

    @Insert
    long newLocalPdf(LocalPdf localPdf);

    @Query("SELECT * FROM LocalPdf")
    List<LocalPdf> all();

    @Query("DELETE FROM LocalPdf WHERE path = :path")
    void remove(String path);
}
