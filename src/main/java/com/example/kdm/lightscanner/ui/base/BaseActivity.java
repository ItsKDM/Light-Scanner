package com.example.kdm.lightscanner.ui.base;

import android.app.AlertDialog;
import android.content.Context;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;


import androidx.annotation.LayoutRes;
import androidx.appcompat.app.AppCompatActivity;

import com.example.kdm.lightscanner.R;
import com.google.android.material.snackbar.Snackbar;

import butterknife.ButterKnife;

/**
 * Created by Lekan Adigun on 12/21/2017.
 */

public class BaseActivity extends AppCompatActivity {

    /*
     * State variable, to determine if activity is visible
     * */
    private volatile boolean isOn = false;

    @Override
    public void setContentView(@LayoutRes int layoutResID) {
        super.setContentView(layoutResID);

        ButterKnife.bind(this);
    }

    @Override
    public void setContentView(View view) {
        super.setContentView(view);

        ButterKnife.bind(this);
    }

    @Override
    protected void onPause() {
        super.onPause();
        isOn = false;
    }

    @Override
    protected void onResume() {
        super.onResume();
        isOn = true;
    }

    public void showDialog(String title, String message) {

        /*
         *
         * Do not attempt to show dialog if activity is not visible
         * */
        if(!isOn) return;

        new AlertDialog.Builder(this, R.style.AppTheme)
                .setTitle(title)
                .setMessage(message)
                .setPositiveButton("OK", null)
                .create()
                .show();
    }

    public void toast(String message) {

        if(!isOn) return;

        Toast.makeText(this, message, Toast.LENGTH_LONG).show();

    }

    public void snack(String message) {

        if(!isOn) return;

        Snackbar.make(findViewById(android.R.id.content), message, Snackbar.LENGTH_LONG)
                .show();
    }


    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        switch (item.getItemId()) {
            case android.R.id.home:
                finish();
                break;
        }
        return super.onOptionsItemSelected(item);
    }

    public void show(View... views) {

        try {

            if(views == null) return;

            if (!isOn) return;

            for (View view : views)
                view.setVisibility(View.VISIBLE);

        }catch (Exception e) {}
    }

    public void hide(View... views) {

        try {

            if(views == null) return;

            if (!isOn) return;

            for (View view : views)
                view.setVisibility(View.GONE);

        }catch (Exception e) {}

    }
}