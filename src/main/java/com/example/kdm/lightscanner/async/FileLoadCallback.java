package com.example.kdm.lightscanner.async;


import com.example.kdm.lightscanner.models.LocalPdf;

import java.util.List;

/**
 * Created by Lekan Adigun on 2/8/2018.
 */

public interface FileLoadCallback {

    void done(List<LocalPdf> list);
    void error(Throwable throwable);
}
