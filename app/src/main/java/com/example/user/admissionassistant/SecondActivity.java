package com.example.user.admissionassistant;

import android.content.Intent;
import android.database.sqlite.SQLiteDatabase;
import android.os.Parcelable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class SecondActivity extends AppCompatActivity implements View.OnClickListener {

    public static String COURSE_LIST="courseList";

    DatabaeHelper db=new DatabaeHelper(this);


    private String scholar="No hostel facilities available";
    private String hostel_facilities="No hostel facilities available";
    private String[] contact={"address","mobile & email","website"};

    Bundle bundle;
    Bundle bundle1;
    Intent intent;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        intent=getIntent();
        bundle=intent.getBundleExtra(MainActivity.CREDENTIAL);


        findViewById(R.id.Ccourses).setOnClickListener(this);
        findViewById(R.id.about).setOnClickListener(this);
        findViewById(R.id.scholar).setOnClickListener(this);
        findViewById(R.id.hostel).setOnClickListener(this);
        findViewById(R.id.contact).setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        int id = v.getId();
        Intent intent = null;

        switch (id)
        {
            case R.id.about:
                intent =new Intent(SecondActivity.this,ThirdActivity.class);
                intent.putExtra(MainActivity.ABOUT,bundle.getString(MainActivity.ABOUT));
                intent.putExtra(MainActivity.UNIVERSITY_NAME,bundle.getString(MainActivity.UNIVERSITY_NAME));
                break;
            case R.id.Ccourses :
                intent =  new Intent(SecondActivity.this,ForthActivity.class);
                int n=bundle.getInt(MainActivity.NUMBER_OF_COURSES);
                 String course_name[]=new String[n];
                String semester_info[]=new String[n];
                String tution_fee[]=new String[n];
                String credit_hr_info[]=new String[n];


                String st =bundle.getString(MainActivity.UNIVERSITY_NAME);
                List<Course> myCourseList=db.getAllCourseOfUniversity(st);
                //intent.putExtra(COURSE_LIST, ArrayList<Course>myCourseList);

                //bundle1.putSerializable(COURSE_LIST,(Serializable)myCourseList);

                int i=0;
                for(Course course1:myCourseList){
                    /*String s="Id: "+course1.getId()+"\nUniversity Name: "+course1.getUNIVERSITY_NAME()
                            +"\nCourse Name: "+course1.getCOURSE_NAME()+"\nSemester: "+course1.getSEMESTER()
                            +"\nCredit Hour: "+course1.getCREDIT_HOUR()+"\nTution fees: "+course1.getTUTION_FEES();
                    Log.d("s",s);*/
                    course_name[i]=course1.getCOURSE_NAME();
                    semester_info[i]=course1.getSEMESTER();
                    credit_hr_info[i]=course1.getCREDIT_HOUR();
                    tution_fee[i]=course1.getTUTION_FEES();
                    String s="Id: "+course1.getId()+"\nUniversity Name: "+course1.getUNIVERSITY_NAME()
                            +"\nCourse Name: "+course_name[i]+"\nSemester: "+semester_info[i]
                            +"\nCredit Hour: "+credit_hr_info[i]+"\nTution fees: "+tution_fee[i];
                    Log.d("s",s);
                    i++;
                }
                bundle.putInt(MainActivity.NUMBER_OF_COURSES,n);
                bundle.putString(MainActivity.UNIVERSITY_NAME,bundle.getString(MainActivity.UNIVERSITY_NAME));
                bundle.putStringArray("course_name",course_name);
                bundle.putStringArray("semester_info",semester_info);
                bundle.putStringArray("credit_hr_info",credit_hr_info);
                bundle.putStringArray("tution_fee",tution_fee);

                intent.putExtra(MainActivity.CREDENTIAL,bundle);

                break;
            case R.id.scholar:
                intent =new Intent(SecondActivity.this,FifthActivity.class);
                intent.putExtra(MainActivity.SCHOLARSHIP,bundle.getString(MainActivity.SCHOLARSHIP));
                break;
            case R.id.hostel:
                intent =new Intent(SecondActivity.this,SixthActivity.class);
                intent.putExtra(MainActivity.HOSTEL_FACILITIES,bundle.getString(MainActivity.HOSTEL_FACILITIES));
                break;
            case R.id.contact:
                intent =new Intent(SecondActivity.this,SeventhActivity.class);
                intent.putExtra(MainActivity.ADDRESS,bundle.getString(MainActivity.ADDRESS));
                intent.putExtra(MainActivity.EMAIL,bundle.getString(MainActivity.EMAIL));
                intent.putExtra(MainActivity.MOBILE,bundle.getString(MainActivity.MOBILE));
                intent.putExtra(MainActivity.WEBSITE,bundle.getString(MainActivity.WEBSITE));

                break;


        }

        startActivity(intent);
    }
}
