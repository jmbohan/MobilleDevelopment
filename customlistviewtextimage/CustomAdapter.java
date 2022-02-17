package com.example.customlistviewtextimage;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class CustomAdapter extends BaseAdapter {
    private Context context;
    private ArrayList<DataItem> items;
    static TextView topTextView;

    public CustomAdapter(Context context, ArrayList<DataItem> items) {
        this.context = context;
        this.items = items;
    }

    @Override
    public int getCount() {
        return items.size();
    }

    @Override
    public Object getItem(int position) {
        return items.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup viewGroup) {
        if (convertView == null) {
            convertView = LayoutInflater.from(context)
                    .inflate(R.layout.my_custom_row, viewGroup, false);
        }
        DataItem currentItem = (DataItem) getItem(position);
        TextView txtLabel =  convertView.findViewById(R.id.txtLable);
        ImageView imgIcon =  convertView.findViewById(R.id.imgIcon);
        txtLabel.setText(currentItem.getItemDescription());
        imgIcon.setImageResource(currentItem.getThumbnailImage());
        convertView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String s = "you clicked item ..." + position;

                Toast.makeText(context, s, Toast.LENGTH_SHORT).show();
                topTextView = ((Activity) context).findViewById(R.id.txtMsg);
                topTextView.setText(s);

            }
        });


        return convertView;
    }
}
