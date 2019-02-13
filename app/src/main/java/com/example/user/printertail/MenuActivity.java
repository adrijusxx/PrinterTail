package com.example.user.printertail;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.Button;

public class MenuActivity extends AppCompatActivity  {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        Button LetsTry;
        Button Contacts;

        Contacts = (Button) findViewById(R.id.contacts);

        LetsTry = (Button) findViewById(R.id.calculatethetill);


        LetsTry.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent Test = new Intent(MenuActivity.this, MainActivity.class);
                startActivity(Test);
            }
        });

        Contacts.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent Test = new Intent(MenuActivity.this, ContactsActivity.class);
                startActivity(Test);
            }
        });

    }
}

