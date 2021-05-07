package com.steven.latihan3_monitory;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
/* Tanggal pengerjaan : Jumat 7 mei 2021
 * Nim                 : 10118078
 * Nama                : Steven Danesswaralay
 * Kelas               : IF-2
 */
public class kodekk extends AppCompatActivity {
    Button btnstart;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kodekk);

        btnstart = findViewById(R.id.start);

        btnstart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(kodekk.this,form.class));
            }
        });

    }
}