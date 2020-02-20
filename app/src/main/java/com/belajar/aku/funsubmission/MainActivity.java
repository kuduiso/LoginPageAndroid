package com.belajar.aku.funsubmission;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText namaMu;
    EditText passMu;
    Button tombol;

    private String KEY_NAME = "NAMA";
    private String KEY_PASS = "PASS";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        namaMu = (EditText) findViewById(R.id.email);
        passMu = (EditText) findViewById(R.id.password);
        tombol = (Button) findViewById(R.id.masuk);

        tombol.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                    try{
                        String nama = namaMu.getText().toString();
                        String pass = passMu.getText().toString();
                        if (!nama.isEmpty() && !pass.isEmpty()){
                            Intent i = new Intent(MainActivity.this, loginpage.class);
                            i.putExtra(KEY_NAME, nama);
                            i.putExtra(KEY_PASS, pass);
                            startActivity(i);
                        }else{
                            Toast.makeText(MainActivity.this, "HARAP ISI EMAIL DAN PASSWORD",Toast.LENGTH_SHORT).show();
                        }
                    }catch (Exception e){
                        e.printStackTrace();
                        Toast.makeText(MainActivity.this,"ERROR, COBA LAGI",Toast.LENGTH_SHORT).show();
                    }
            }
        });
    }
}
