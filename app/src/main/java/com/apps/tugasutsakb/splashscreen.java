package com.apps.tugasutsakb;


import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

// tanggal pengerjaan : 03/05/2020
// nim                : 10117151
// nama               : prayoga maulana putra sugiharto
// kelas              : IF4

public class splashscreen extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splashscreen);

        Thread thread = new Thread(){
            public void run (){
                try {
                    sleep(4000);
                } catch (InterruptedException e){
                    e.printStackTrace();
                }finally {
                    startActivity(new Intent(splashscreen.this, walkthrought.class));
                    finish();
                }
            }
        };
        thread.start();

    }
}
