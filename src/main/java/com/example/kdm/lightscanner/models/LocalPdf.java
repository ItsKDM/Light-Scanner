package com.example.kdm.lightscanner.models;

import android.graphics.Bitmap;

import androidx.room.Entity;
import androidx.room.PrimaryKey;

/**
 * Created by Lekan Adigun on 2/8/2018.
 */

@Entity
public class LocalPdf {

    @PrimaryKey(autoGenerate = true)
    public long pdfId = 0;
    public String name = "";
    public String path = "";
    public String timeCreated = "";
    public String thumbPath = "";
}
