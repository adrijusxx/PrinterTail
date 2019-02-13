package com.example.user.printertail.View;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import com.example.user.printertail.R;

public class MenuActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        Button CalculateTill;
        Button Contacts;
        Button Entries;

        CalculateTill = (Button) findViewById(R.id.calculatethetill);
        Contacts = (Button) findViewById(R.id.contacts);
        Entries = (Button) findViewById(R.id.entries);

        CalculateTill.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent MainIntent = new Intent(MenuActivity.this, MainActivity.class);
                startActivity(MainIntent);
            }
        });

        Contacts.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent ContactsIntent = new Intent(MenuActivity.this, ContactsActivity.class);
                startActivity(ContactsIntent);
            }
        });

        Entries.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent EntriesIntent = new Intent(MenuActivity.this, EntriesActivity.class);
                startActivity(EntriesIntent);
            }
        });

    }
}

