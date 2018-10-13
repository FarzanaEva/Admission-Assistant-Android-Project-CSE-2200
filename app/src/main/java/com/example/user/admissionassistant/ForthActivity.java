package com.example.user.admissionassistant;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class ForthActivity extends AppCompatActivity implements View.OnClickListener
{
    //private int no_of_courses=8;
    /*private String course_name[]= {"ARC","CE ","CSE","EEE","TE","IPE","ME","BBA"};
    private String[] semester_info={"10 semsesters","8 semsesters","8 semsesters","8 semsesters","8 semsesters","8 semsesters","8 semsesters","8 semsesters"};
    private String[] credit_hr_info={
            "Max 20 credit hour.190 credit hour in total","Max 22 credit hour.164 credit hour in total","Max 22 credit hour.164 credit hour in total",
            "Max 22 credit hour.164 credit hour in total","Max 22 credit hour.164 credit hour in total","Max 22 credit hour.164 credit hour in total",
            "Max 22 credit hour.164 credit hour in total","Max 22 credit hour.164 credit hour in total"};
    private String[] tution_fee= {
            "AT THE TIME OF ADMISSION SUBSEQUENT=1,04,800.00.\n EACH SEMESTER=80,400.00.\n TOTAL FEE=8,28,400.00","AT THE TIME OF ADMISSION SUBSEQUENT=1,04,800.00.\n EACH SEMESTER=80,400.00.\n TOTAL FEE=6,67,600.00",
            "AT THE TIME OF ADMISSION SUBSEQUENT=1,04,800.00.\n EACH SEMESTER=80,400.00.\n TOTAL FEE=6,67,600.00","AT THE TIME OF ADMISSION SUBSEQUENT=1,04,800.00.\n EACH SEMESTER=80,400.00.\n TOTAL FEE=6,67,600.00",
            "AT THE TIME OF ADMISSION SUBSEQUENT=1,04,800.00.\n EACH SEMESTER=80,400.00.\n TOTAL FEE=6,67,600.00","AT THE TIME OF ADMISSION SUBSEQUENT=1,04,800.00.\n EACH SEMESTER=80,400.00.\n TOTAL FEE=6,67,600.00",
            "AT THE TIME OF ADMISSION SUBSEQUENT=1,04,800.00.\n EACH SEMESTER=80,400.00.\n TOTAL FEE=6,67,600.00","AT THE TIME OF ADMISSION SUBSEQUENT=1,04,800.00.\n EACH SEMESTER=80,400.00.\n TOTAL FEE=6,67,600.00"};

    String show_name="AUST";*/
    int i;
    int n;
    Bundle bundle =new Bundle();
    Bundle bundle1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_forth);

        Intent intent=getIntent();
        bundle1=intent.getBundleExtra(MainActivity.CREDENTIAL);
        String[] btn_text=bundle1.getStringArray("course_name");
        n=bundle1.getInt(MainActivity.NUMBER_OF_COURSES);
        Log.d("Brac",btn_text[0]);
        Log.d("Brac",btn_text[n-1]);



        LinearLayout layout=new LinearLayout(this);
        layout.setLayoutParams(new LinearLayout.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT,ViewGroup.LayoutParams.MATCH_PARENT));
        layout.setOrientation(LinearLayout.VERTICAL);

        /*TextView name=new TextView(this);
        name.setLayoutParams(new LinearLayout.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT,ViewGroup.LayoutParams.WRAP_CONTENT));
        name.setText(Integer.toString(n));
        layout.addView(name);*/

        ScrollView scrollView=new ScrollView(this);
        scrollView.setLayoutParams(new LinearLayout.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT,ViewGroup.LayoutParams.MATCH_PARENT));
        layout.addView(scrollView);

        LinearLayout inner_layout=new LinearLayout(this);
        inner_layout.setLayoutParams(new LinearLayout.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT,ViewGroup.LayoutParams.MATCH_PARENT));
        inner_layout.setOrientation(LinearLayout.VERTICAL);
        scrollView.addView(inner_layout);

        for(i=0;i<n;i++){
            Button btn=new Button(this);
            btn.setLayoutParams(new LinearLayout.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT,ViewGroup.LayoutParams.WRAP_CONTENT));
            btn.setText(btn_text[i]);
            //btn.setText(course_name[i]);
            btn.setId(i);

            //Log.d("sem",semester_info[0]);
            inner_layout.addView(btn);
            btn.setOnClickListener(this);

        }



        setContentView(layout);
    }

    @Override
    public void onClick(View v) {
        Intent intent3=null;
        int id=v.getId();
        for(int i=0;i<n;i++){
            if(i==id){
                Log.d("sem",Integer.toString(i));
                intent3=new Intent(ForthActivity.this,EightActivity.class);
                bundle1.putInt("i",i);
                //bundle.putStringArray();

                intent3.putExtra(MainActivity.CREDENTIAL,bundle1);
                startActivity(intent3);
            }
        }
    }
}
