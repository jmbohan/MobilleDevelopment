package com.example.customlistviewtextimage;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

public class MyIconLabelAdapter extends BaseAdapter {

    private Context context;
    private Integer layoutId;
    private Integer[] thumbnails;
    private String[] items;

    public MyIconLabelAdapter(Context context, Integer layoutId, Integer[] thumbnails, String[] items) {
        this.context = context;
        this.layoutId = layoutId;
        this.thumbnails = thumbnails;
        this.items = items;
    }


    @Override
    public int getCount() {
        return items.length;
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup viewGroup) {
        LayoutInflater inflater = ((Activity) context).getLayoutInflater();
        View row = inflater.inflate(layoutId, null);
        ImageView icon = row.findViewById(R.id.icon);
        TextView label = row.findViewById(R.id.label1);
        icon.setImageResource(thumbnails[position]);
        label.setText(items[position]);
        return  row;
    }
}
