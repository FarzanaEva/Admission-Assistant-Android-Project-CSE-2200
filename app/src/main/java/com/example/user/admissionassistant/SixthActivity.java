package com.example.user.admissionassistant;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class SixthActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sixth);
        Intent intent=getIntent();
        String hostel =intent.getStringExtra(MainActivity.HOSTEL_FACILITIES);
        TextView tv=(TextView)findViewById(R.id.TVhf);
        tv.setText(hostel);
    }
}
