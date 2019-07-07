package com.example.user.printertail.View;

import android.database.Cursor;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.Toast;

import com.example.user.printertail.Controller.DatabaseHelper;
import com.example.user.printertail.R;

import java.util.ArrayList;

public class EntriesActivity extends AppCompatActivity {

    DatabaseHelper myDB;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_entries);

        ListView listView = (ListView) findViewById(R.id.textTotalCash);
        ListView listView2 = (ListView) findViewById(R.id.textTotalVisa);
        ListView listView3 = (ListView) findViewById(R.id.textTotalMoney);
        myDB = new DatabaseHelper(this);
        ArrayList<String> theList = new ArrayList<>();
        ArrayList<String> theList2 = new ArrayList<>();
        ArrayList<String> theList3 = new ArrayList<>();

        Cursor data = myDB.getListContents();
        String pounch;

        if (data.getCount() == 0) {
            Toast.makeText(EntriesActivity.this, "Database Empty", Toast.LENGTH_LONG).show();
        } else {
            while (data.moveToNext()) {
                theList.add(data.getString(1));
                theList2.add(data.getString(2));
                theList3.add(data.getString(3));
                ListAdapter listAdapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, theList);
                ListAdapter listAdapter2 = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, theList2);
                ListAdapter listAdapter3 = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, theList3);
                listView.setAdapter(listAdapter);
                listView2.setAdapter(listAdapter2);
                listView3.setAdapter(listAdapter3);
            }
        }
    }


}
