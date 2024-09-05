package com.hakimasmui.customtoast;

import android.app.Activity;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.Nullable;

public class CustomToast {
    Activity activity;
    int bg_color;
    int posisi;

    public CustomToast(Activity activity) {
        this.activity = activity;
    }

    public CustomToast(Activity activity, int posisi) {
        this.activity = activity;
        this.posisi = posisi;
    }

    public CustomToast(Activity activity, int posisi, int bg_color) {
        this.activity = activity;
        this.posisi = posisi;
        this.bg_color = bg_color;
    }

    public void show(String kata, int posisi, int color) {
        LayoutInflater inflater = (LayoutInflater) activity.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View v = inflater.inflate(R.layout.custom_toast, activity.findViewById(R.id.custom_toast_container), true);
        LinearLayout backgorund = v.findViewById(R.id.back);
        TextView textView = v.findViewById(R.id.text);
        backgorund.setBackgroundColor(color);
        textView.setText(kata);
        Toast toast = new Toast(activity.getApplicationContext());
        toast.setGravity(posisi | Gravity.FILL_HORIZONTAL, 0, 0);
        toast.setDuration(Toast.LENGTH_LONG);
        toast.setView(v);
        toast.show();
    }

    public void show(String kata, int bg_color) {
        LayoutInflater inflater = (LayoutInflater) activity.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View v = inflater.inflate(R.layout.custom_toast, activity.findViewById(R.id.custom_toast_container), true);
        LinearLayout backgorund = v.findViewById(R.id.back);
        TextView textView = v.findViewById(R.id.text);
        backgorund.setBackgroundColor(bg_color);
        textView.setText(kata);
        Toast toast = new Toast(activity.getApplicationContext());
        toast.setGravity(posisi | Gravity.FILL_HORIZONTAL, 0, 0);
        toast.setDuration(Toast.LENGTH_LONG);
        toast.setView(v);
        toast.show();
    }

    public void show(String kata) {
        LayoutInflater inflater = (LayoutInflater) activity.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View v = inflater.inflate(R.layout.custom_toast, activity.findViewById(R.id.custom_toast_container), true);
        LinearLayout backgorund = v.findViewById(R.id.back);
        TextView textView = v.findViewById(R.id.text);
        backgorund.setBackgroundColor(bg_color);
        textView.setText(kata);
        Toast toast = new Toast(activity.getApplicationContext());
        toast.setGravity(posisi | Gravity.FILL_HORIZONTAL, 0, 0);
        toast.setDuration(Toast.LENGTH_LONG);
        toast.setView(v);
        toast.show();
    }
}
