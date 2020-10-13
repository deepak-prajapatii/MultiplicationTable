package com.riseinsteps.multiplicationtable;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.SeekBar;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        SeekBar seekBar = findViewById(R.id.seekBar);

        seekBar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int i, boolean b) {
                Toast.makeText(MainActivity.this, "The progress is" + i, Toast.LENGTH_SHORT).show();
                TextView tableFor1 = findViewById(R.id.tableFor0);
                tableFor1.setText(i + " * 1 = " + i*1);
                TextView tableFor2 = findViewById(R.id.tableFor1);
                tableFor2.setText(i + " * 2 = " + i*2);
                TextView tableFor3 = findViewById(R.id.tableFor2);
                tableFor3.setText(i + " * 3 = " + i*3);
                TextView tableFor4 = findViewById(R.id.tableFor3);
                tableFor4.setText(i + " * 4 = " + i*4);
                TextView tableFor5 = findViewById(R.id.tableFor4);
                tableFor5.setText(i + " * 5 = " + i*5);
                TextView tableFor6 = findViewById(R.id.tableFor5);
                tableFor6.setText(i + " * 6 = " + i*6);
                TextView tableFor7 = findViewById(R.id.tableFor6);
                tableFor7.setText(i + " * 7 = " + i*7);
                TextView tableFor8 = findViewById(R.id.tableFor7);
                tableFor8.setText(i + " * 8 = " + i*8);
                TextView tableFor9 = findViewById(R.id.tableFor8);
                tableFor9.setText(i + " * 9 = " + i*9);
                TextView tableFor10 = findViewById(R.id.tableFor9);
                tableFor10.setText(i + " * 10 = " + i*10);
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });

    }
}