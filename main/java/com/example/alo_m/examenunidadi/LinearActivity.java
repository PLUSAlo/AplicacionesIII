package com.example.alo_m.examenunidadi;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

/**
 * Created by alo_m on 01/02/2018.
 */

public class LinearActivity extends AppCompatActivity {
    private Button btnSubmit;
    private EditText edtName;
    private EditText edtAge;
    private EditText edtPhone;


    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.linear_layout);
        edtName = findViewById(R.id.type_name);
        edtAge = findViewById(R.id.type_age);
        edtPhone = findViewById(R.id.type_phone);
        btnSubmit = findViewById(R.id.btn_submit);

        btnSubmit.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                String data =  "Your name is " + edtName.getText().toString() + ", your age is : "+edtAge.getText().toString()+
                        ", your phone is: "+ edtPhone.getText().toString();
                Intent intent = new Intent(LinearActivity.this,RelativeActivity.class);
                intent.putExtra( "data", data);
                startActivity(intent);
                finish();
            }
        });


    }


}
