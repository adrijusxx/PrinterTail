package com.example.user.printertail.View;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.example.user.printertail.Controller.DatabaseHelper;
import com.example.user.printertail.R;

public class MainActivity extends AppCompatActivity {


    DatabaseHelper myDB;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);




        {
            Button Calculate;

            Calculate = (Button) findViewById(R.id.buttonCalculate);
            myDB = new DatabaseHelper(this);


            Calculate.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {



                    EditText windowfor50 = (EditText) findViewById(R.id.window50);
                    EditText windowfor20 = (EditText) findViewById(R.id.window20);
                    EditText windowfor10 = (EditText) findViewById(R.id.window10);
                    EditText windowfor5 = (EditText) findViewById(R.id.window5);
                    EditText windowfor2 = (EditText) findViewById(R.id.window2);
                    EditText windowfor1 = (EditText) findViewById(R.id.window1);
                    EditText windowforCoins = (EditText) findViewById(R.id.windowcoins);
                    EditText windowforVisa = (EditText) findViewById(R.id.windowvisa);
                    TextView totalMoney = (TextView) findViewById(R.id.total);
                    TextView windowforCheque = (TextView) findViewById(R.id.windowcheque);
                    TextView totalVisa = (TextView) findViewById(R.id.visatotal);
                    TextView totalCash = (TextView) findViewById(R.id.cashtotal);
                    TextView totalCheque = (TextView) findViewById(R.id.cheque1);





                    try{
                        if (windowfor50.getText().toString().trim().length() <= 0) {
                            Toast.makeText(MainActivity.this, "Window for 50 euros is Empty", Toast.LENGTH_SHORT).show();
                        }
                        if (windowfor20.getText().toString().trim().length() <= 0) {
                            Toast.makeText(MainActivity.this, "Window for 20 euros is Empty", Toast.LENGTH_SHORT).show();
                        }
                            if (windowfor10.getText().toString().trim().length() <= 0) {
                                Toast.makeText(MainActivity.this, "Window for 10 euros is Empty", Toast.LENGTH_SHORT).show();
                            }
                                if (windowfor5.getText().toString().trim().length() <= 0) {
                                    Toast.makeText(MainActivity.this, "Window for 5 euros is Empty", Toast.LENGTH_SHORT).show();
                                }
                                    if (windowfor2.getText().toString().trim().length() <= 0) {
                                        Toast.makeText(MainActivity.this, "Window for 2 euros is Empty", Toast.LENGTH_SHORT).show();
                                    }
                                        if (windowfor1.getText().toString().trim().length() <= 0) {
                                            Toast.makeText(MainActivity.this, "Window for 1 euros is Empty", Toast.LENGTH_SHORT).show();
                                        }
                        if (windowforCoins.getText().toString().trim().length() <= 0) {
                            Toast.makeText(MainActivity.this, "Window for Coins is Empty", Toast.LENGTH_SHORT).show();
                        }
                        if (windowforVisa.getText().toString().trim().length() <= 0) {
                            Toast.makeText(MainActivity.this, "Window for Visa is Empty", Toast.LENGTH_SHORT).show();
                        }
                        if (windowforCheque.getText().toString().trim().length() <= 0) {
                            Toast.makeText(MainActivity.this, "Window for Cheque is Empty", Toast.LENGTH_SHORT).show();
                        }

                                            int num50 = Integer.parseInt(windowfor50.getText().toString());
                                            int num20 = Integer.parseInt(windowfor20.getText().toString());
                                            int num10 = Integer.parseInt(windowfor10.getText().toString());
                                            int num5 = Integer.parseInt(windowfor5.getText().toString());
                                            int num2 = Integer.parseInt(windowfor2.getText().toString());
                                            int num1 = Integer.parseInt(windowfor1.getText().toString());

                                            double numCoins = Double.parseDouble(windowforCoins.getText().toString());
                                            double numVisa = Double.parseDouble(windowforVisa.getText().toString());
                                            double numCheque = Double.parseDouble(windowforCheque.getText().toString());

                                            final double Sum = num50 + num20 + num10 + num5 + num2 + num1 + numCoins + numVisa + numCheque;
                        final double SumCash = num50 + num20 + num10 + num5 + num2 + num1 + numCoins + numCheque;
                                            final double SumVisa = numVisa;
                        final double SumCheque = numCheque;

                        totalMoney.setText(String.valueOf(Sum) + " €");
                                            totalCash.setText(String.valueOf(SumCash) + " €");
                                            totalVisa.setText(String.valueOf(SumVisa) + " €");
                        totalCheque.setText(String.valueOf(SumCheque) + " €");

                                            Toast.makeText(getApplicationContext(), "Total money: " + Sum + "€", Toast.LENGTH_LONG).show();
                        //0double newEntry = Double.parseDouble(totalMoney.getText().toString());
                        String totalEntry = totalMoney.getText().toString();
                        String cashEntry = totalCash.getText().toString();
                        String visaEntry = totalVisa.getText().toString();
                        if (totalMoney.length() != 0 && totalCash.length() != 0 && totalVisa.length() != 0) {
                            AddData(totalEntry, cashEntry, visaEntry);
                        } else {
                            Toast.makeText(MainActivity.this, "field is missing", Toast.LENGTH_LONG).show();

                        }

                                        }catch(Exception e){
                                            System.out.println("Catch Exception Error"); // Invalid input
                                        }


                }
            });
        }
    }

    public void AddData(String newEntry, String secondEntry, String thirdEntry) {
        boolean insertData = myDB.addData(newEntry, secondEntry, thirdEntry);
        if (insertData == true) {
            Toast.makeText(MainActivity.this, "entered", Toast.LENGTH_LONG).show();
        } else {
            Toast.makeText(MainActivity.this, "wrong", Toast.LENGTH_LONG).show();

        }
    }
}

