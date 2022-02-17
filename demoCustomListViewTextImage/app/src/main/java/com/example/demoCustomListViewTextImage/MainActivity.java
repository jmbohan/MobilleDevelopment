package com.example.customlistviewtextimage;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    ArrayList<DataItem> dataItemList = SampleDataProvider.dataItemList;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        CustomAdapter adapter = new CustomAdapter(this, dataItemList);
        ListView itemListView = findViewById(R.id.my_list);
        itemListView.setAdapter(adapter);
    }
}