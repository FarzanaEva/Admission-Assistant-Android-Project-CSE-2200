package com.example.user.admissionassistant;

import android.content.Intent;
import android.database.sqlite.SQLiteDatabase;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    public static String CREDENTIAL = "Credential";

    public static String UNIVERSITY_NAME="universityName";
    public static String NUMBER_OF_COURSES="numberOfCourses";
    public static String ABOUT="about";
    public static String SCHOLARSHIP="scholarship";
    public static String HOSTEL_FACILITIES="hostelFacilities";
    public static String ADDRESS="adress";
    public static String EMAIL="email";
    public static String MOBILE="mobile";
    public static String WEBSITE="website";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

       /// Button button = (Button) findViewById(R.id.Baust);
        //button.setOnClickListener(this);

        //button.setText("Eva");
        findViewById(R.id.Baust).setOnClickListener(this);
        findViewById(R.id.Baiub).setOnClickListener(this);
        findViewById(R.id.Bnsu).setOnClickListener(this);
        findViewById(R.id.Bseu).setOnClickListener(this);
        findViewById(R.id.Bbrac).setOnClickListener(this);
        findViewById(R.id.Buiu).setOnClickListener(this);
        findViewById(R.id.Buap).setOnClickListener(this);
        findViewById(R.id.Bdiu).setOnClickListener(this);
        findViewById(R.id.Bewu).setOnClickListener(this);
        findViewById(R.id.Biub).setOnClickListener(this);


    }

    @Override
    public void onClick(View v) {
        int id = v.getId();
        University university;
        DatabaeHelper db=new DatabaeHelper(this);

        Intent intent = null;
        switch (id)
        {
            case R.id.Baust :
                intent = new Intent(MainActivity.this,SecondActivity.class);
                university=db.getSingleUniversity(1);
                break;
            case R.id.Bewu :
                intent = new Intent(MainActivity.this,SecondActivity.class);
                university=db.getSingleUniversity(2);
                break;
            case R.id.Bnsu :
                intent = new Intent(MainActivity.this,SecondActivity.class);
                university=db.getSingleUniversity(3);
                break;
            case R.id.Bbrac :
                intent = new Intent(MainActivity.this,SecondActivity.class);
                university=db.getSingleUniversity(4);
                break;
            case R.id.Baiub :
                intent = new Intent(MainActivity.this,SecondActivity.class);
                university=db.getSingleUniversity(5);
                break;
            case R.id.Biub :
                intent = new Intent(MainActivity.this,SecondActivity.class);
                university=db.getSingleUniversity(6);
                break;
            case R.id.Buiu:
                intent = new Intent(MainActivity.this,SecondActivity.class);
                university=db.getSingleUniversity(7);
                break;
            case R.id.Bseu :
                intent = new Intent(MainActivity.this,SecondActivity.class);
                university=db.getSingleUniversity(8);
                break;
            case R.id.Buap :
                intent = new Intent(MainActivity.this,SecondActivity.class);
                university=db.getSingleUniversity(9);
                break;
            case R.id.Bdiu :
                intent = new Intent(MainActivity.this,SecondActivity.class);
                university=db.getSingleUniversity(10);
                break;
            default:
                intent = new Intent(MainActivity.this,SecondActivity.class);
                university=db.getSingleUniversity(1);
        }
        Bundle bundle =new Bundle();
        Log.d("Reading: ","Reading....");

        bundle.putInt("Id",university.getId());
        bundle.putString(UNIVERSITY_NAME,university.getUNIVERSITY_NAME());
        bundle.putInt(NUMBER_OF_COURSES,university.getNUMBER_OF_COURSES());
        bundle.putString(ABOUT,university.getABOUT());
        bundle.putString(SCHOLARSHIP,university.getSCHOLARSHIP());
        bundle.putString(HOSTEL_FACILITIES,university.getHOSTEL_FACILITIES());
        bundle.putString(ADDRESS,university.getADDRESS());
        bundle.putString(EMAIL,university.getEMAIL());
        bundle.putString(MOBILE,university.getMOBILE());
        bundle.putString(WEBSITE,university.getWEBSITE());
        intent.putExtra(CREDENTIAL,bundle);

        /*String s="Id: "+university.getId()+"\nName: "+university.getUNIVERSITY_NAME()
                +"\ncoureses: "+university.getNUMBER_OF_COURSES()+"\nAbout: "+university.getABOUT()
                +"\nscholarship: "+university.getSCHOLARSHIP()+"\nhostel facilities: "+university.getHOSTEL_FACILITIES()
                +"\nAddress: "+university.getADDRESS()+"\nemail: "+university.getEMAIL()
                +"\nmobile: "+university.getMOBILE()+"\nwebsite: "+university.getWEBSITE();
        Log.d("Name:",s);*/
        startActivity(intent);

    }
}
