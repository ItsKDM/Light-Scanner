package com.example.kdm.lightscanner.ui.base;

import android.view.View;

import androidx.recyclerview.widget.RecyclerView;

import butterknife.ButterKnife;

/**
 * Created by Lekan Adigun on 12/31/2017.
 */

public class BaseViewHolder extends RecyclerView.ViewHolder {

    /*
     * ButterKnife enabled viewholder
     * */
    public BaseViewHolder(View itemView) {
        super(itemView);

        ButterKnife.bind(this, itemView);
    }
}