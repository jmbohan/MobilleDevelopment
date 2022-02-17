package com.example.customlistviewtextimage;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView txtMsg;
    String[] items = SampleDataProvider.items;
    Integer[] thumnails = SampleDataProvider.thumbails;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        txtMsg = findViewById(R.id.txtMsg);
        ListView listView = findViewById(R.id.listview1);

        MyIconLabelAdapter adapter = new MyIconLabelAdapter(
                this,
                R.layout.my_custom_row,
                thumnails,
                items);
        // bind ListView to custom adapter

        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {
                String text = " Selected Position: " + position + "   " + items[position];
                txtMsg.setText(text);
            }


        });
    }
}