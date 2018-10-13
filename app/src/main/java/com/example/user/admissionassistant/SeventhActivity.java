package com.example.user.admissionassistant;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class SeventhActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_seventh);
        Intent intent=getIntent();
        String ADDRESS=intent.getStringExtra(MainActivity.ADDRESS);
        String EMAIL=intent.getStringExtra(MainActivity.EMAIL);
        String MOBILE=intent.getStringExtra(MainActivity.MOBILE);
        String WEBSITE=intent.getStringExtra(MainActivity.WEBSITE);


        TextView tv=(TextView)findViewById(R.id.TVadd);
        tv.setText(ADDRESS);
        tv=(TextView)findViewById(R.id.TVmobile);
        tv.setText(MOBILE);
        tv=(TextView)findViewById(R.id.TVemail);
        tv.setText(EMAIL);
        tv=(TextView)findViewById(R.id.TVweb);
        tv.setText(WEBSITE);
    }
}
