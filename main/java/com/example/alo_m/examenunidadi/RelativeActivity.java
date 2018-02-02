package com.example.alo_m.examenunidadi;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;
import android.widget.Button;

/**
 * Created by alo_m on 01/02/2018.
 */

public class RelativeActivity extends AppCompatActivity {
    private Button btnExit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.relative_layout);

        TextView txtMessage = findViewById(R.id.txt_menssage);
        String data = getIntent().getStringExtra("data");
        txtMessage.setText(data);

        btnExit = findViewById(R.id.btn_exit);
        btnExit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });

    }
}
