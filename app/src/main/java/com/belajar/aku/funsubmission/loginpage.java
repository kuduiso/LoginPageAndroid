package com.belajar.aku.funsubmission;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class loginpage extends AppCompatActivity {
    TextView tampilNama;
    private String nama;
    private String pass;
    private String KEY_NAME = "NAMA";
    private String KEY_PASS = "PASS";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_loginpage);

        tampilNama = (TextView) findViewById(R.id.AlmtEmail);

        Bundle extras = getIntent().getExtras();
        nama = extras.getString(KEY_NAME);
        pass = extras.getString(KEY_PASS);
        tampilNama.setText("Hello, \n"+nama);

    }
}
