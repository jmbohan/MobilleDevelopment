package com.example.customlistviewtextimage;

import java.util.ArrayList;
import java.util.List;

public class SampleDataProvider {
    public static String[] itemdescriptions = {"Data-0", "Data-1", "Data-2", "Data-3",
            "Data-4", "Data-5", "Data-6", "Data-7",
            "Data-8", "Data-9", "Data-10", "Data-11",
            "Data-12", "Data-13", "Data-14", "Data-15",
            "Data-16", "Data-17", "Data-18", "Data-19",
            "Data-20", "Data-21", "Data-22", "Data-23",
            "Data-24", "Data-25", "Data-26"};

    public static Integer[] thumnbails = {
            R.drawable.small_pic00, R.drawable.small_pic01, R.drawable.small_pic02
            , R.drawable.small_pic03, R.drawable.small_pic04, R.drawable.small_pic05
            , R.drawable.small_pic06, R.drawable.small_pic07, R.drawable.small_pic08
            , R.drawable.small_pic09, R.drawable.small_pic10, R.drawable.small_pic11
            , R.drawable.small_pic12, R.drawable.small_pic13, R.drawable.small_pic14
            , R.drawable.small_pic15, R.drawable.small_pic16, R.drawable.small_pic17
            , R.drawable.small_pic18, R.drawable.small_pic19, R.drawable.small_pic20
            , R.drawable.small_pic21, R.drawable.small_pic22, R.drawable.small_pic23
            , R.drawable.small_pic24, R.drawable.small_pic25, R.drawable.small_pic26};

    public static ArrayList<DataItem> dataItemList;
    static {
        dataItemList = new ArrayList<DataItem>();
        for (int i = 0; i < 9; i++) {
            addItem(new DataItem(itemdescriptions[i], thumnbails[i]));
        }

    }

    private static void addItem(DataItem item) {

        dataItemList.add(item);
    }

}
