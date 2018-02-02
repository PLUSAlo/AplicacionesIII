package com.example.alo_m.examenunidadi;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

/**
 * Created by alo_m on 01/02/2018.
 */

public class FrameActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.frame_layout);
    }
    public void nextActivity(View view){
        startActivity(new Intent(this, TableActivity.class ));
    }
}
