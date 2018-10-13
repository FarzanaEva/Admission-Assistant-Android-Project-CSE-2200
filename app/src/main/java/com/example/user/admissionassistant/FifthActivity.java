package com.example.user.admissionassistant;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class FifthActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fifth);
        Intent intent=getIntent();
        String scholar =intent.getStringExtra(MainActivity.SCHOLARSHIP);
        TextView tv=(TextView)findViewById(R.id.TVscholar);
        tv.setText(scholar);
    }
}
