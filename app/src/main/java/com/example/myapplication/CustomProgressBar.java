package com.example.myapplication;
import android.app.ProgressDialog;
import android.content.Context;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;

public class CustomProgressBar {
    private ProgressBar progressBar;
    private RelativeLayout progressBarLayout;
    private Context context;
    private ProgressDialog progressBarDialog;


    public CustomProgressBar(Context context) {
        this.context = context;
        initProgressBarLayout();
    }
    private void initProgressBarLayout() {
        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View view = inflater.inflate(R.layout.layout_custom_progressbar, null);
        progressBarLayout = view.findViewById(R.id.progressbar_layout);
        progressBar = view.findViewById(R.id.progressBar111);
    }
    public void show() {
        progressBarLayout.setVisibility(View.VISIBLE);
    }

    public void hide() {
        progressBarLayout.setVisibility(View.GONE);
    }
    public void dismiss() {
        if (progressBarDialog != null && progressBarDialog.isShowing()) {
            progressBarDialog.dismiss();
        }
    }
}
