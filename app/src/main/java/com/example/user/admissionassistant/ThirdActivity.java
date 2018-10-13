package com.example.user.admissionassistant;


import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class ThirdActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third);
        Intent intent=getIntent();
        String description =intent.getStringExtra(MainActivity.ABOUT);
        String Image_text=intent.getStringExtra(MainActivity.UNIVERSITY_NAME);
        TextView tv=(TextView)findViewById(R.id.TVdes);
        tv.setText(description);
        ImageView img=(ImageView)findViewById(R.id.IMG);
        switch (Image_text){
            case "Ahsanullah university of science and Technology":
                img.setImageResource(R.drawable.aust_pic);
                break;
            case "East West University":
                img.setImageResource(R.drawable.ewu_pic);
                break;
            case "North South University":
                img.setImageResource(R.drawable.nsu_pic);
                break;
            case "BRAC University":
                img.setImageResource(R.drawable.bracu_pic);
                break;
            case "American International University Bangladesh":
                img.setImageResource(R.drawable.aiub_pic);
                break;
            case "Independent University of Bangladesh":
                img.setImageResource(R.drawable.iub_pic);
                break;
            case "United International University":
                img.setImageResource(R.drawable.uiu_pic);
                break;
            case "South East University":
                img.setImageResource(R.drawable.seu_pic);
                break;
            case "University of Asia Pacific":
                img.setImageResource(R.drawable.uap_pic);
                break;
            case "Daffodil International University":
                img.setImageResource(R.drawable.diu_pic);
                break;
            default:
                img.setImageResource(R.drawable.aust_pic);
                break;
        }


    }
}
