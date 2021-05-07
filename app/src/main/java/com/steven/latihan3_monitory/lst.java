package com.steven.latihan3_monitory;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
/* Tanggal pengerjaan : Jumat 7 mei 2021
 * Nim                 : 10118078
 * Nama                : Steven Danesswaralay
 * Kelas               : IF-2
 */
public class lst extends AppCompatActivity {
    Button button1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lst);

        Intent intent = getIntent();
        String message = intent.getStringExtra(form.EXTRA_MESSAGE);

        TextView textView = findViewById(R.id.name);
        String replace = textView.getText().toString().replace("kamu",message);
        textView.setText(String.valueOf(replace));

        button1 = findViewById(R.id.end);

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finishAndRemoveTask();
            }
        });

    }
}