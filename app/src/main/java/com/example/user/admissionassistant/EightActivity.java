package com.example.user.admissionassistant;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

public class EightActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_eight);
        Intent intent=getIntent();
        Bundle bundle=intent.getBundleExtra(MainActivity.CREDENTIAL);
        int x=bundle.getInt("i");
        Log.d("Eight",Integer.toString(x));
        String semester_info[]=bundle.getStringArray("semester_info");
        String tution_fee[]=bundle.getStringArray("tution_fee");
        String credit_hr_info[]=bundle.getStringArray("credit_hr_info");


        TextView tv =(TextView)findViewById(R.id.TVtufee);
        tv.setText(tution_fee[x]);
        tv =(TextView)findViewById(R.id.TVcreHr);
        tv.setText(credit_hr_info[x]);
        tv =(TextView)findViewById(R.id.TVsem);
        tv.setText(semester_info[x]);
    }


}
