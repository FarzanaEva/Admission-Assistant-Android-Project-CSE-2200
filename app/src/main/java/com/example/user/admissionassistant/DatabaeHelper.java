package com.example.user.admissionassistant;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Hasib on 2/3/2017.
 */

public class DatabaeHelper extends SQLiteOpenHelper {
    private static final int DATABASE_VERSION =1;
    private static final String DATABASE_NAME="a";

    private static final String TABLE_NAME_1="universityDetails";
    private static final String KEY_ID="id";
    private static final String KEY_UNIVERSITY_NAME="universityName";
    private static final String KEY_NUMBER_OF_COURSES="numberOfCourses";
    private static final String KEY_PICTURE="universityPicture";
    private static final String KEY_ABOUT="about";
    private static final String KEY_SCHOLARSHIP="scholarship";
    private static final String KEY_HOSTEL_FACILITIES="hostelFacilities";
    private static final String KEY_ADDRESS="adress";
    private static final String KEY_EMAIL="email";
    private static final String KEY_MOBILE="mobile";
    private static final String KEY_WEBSITE="website";

    private static final String TABLE_NAME_2="courseDetails";
    private static final String KEY_COURSE_NAME="courseName";
    private static final String KEY_SEMESTER="semester";
    private static final String KEY_CREDIT_HOUR="creditHour";
    private static final String KEY_TUTION_FEES="tutionFees";

    public DatabaeHelper(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        String CREATE_UNIVERSITY_TABLE="CREATE TABLE "+TABLE_NAME_1+"("
                +KEY_ID+" INTEGER PRIMARY KEY,"
                +KEY_UNIVERSITY_NAME+" TEXT,"
                +KEY_NUMBER_OF_COURSES+" INTEGER,"
                +KEY_ABOUT+" TEXT,"
                +KEY_SCHOLARSHIP+" TEXT,"
                +KEY_HOSTEL_FACILITIES+" TEXT,"
                +KEY_ADDRESS+" TEXT,"
                +KEY_EMAIL+" TEXT,"
                +KEY_MOBILE+" TEXT,"
                +KEY_WEBSITE+" TEXT "
                +")";
        db.execSQL(CREATE_UNIVERSITY_TABLE);

        String CREATE_COURSE_TABLE="CREATE TABLE "+TABLE_NAME_2+"("
                +KEY_ID+" INTEGER PRIMARY KEY,"
                +KEY_UNIVERSITY_NAME+" TEXT,"
                //+" FOREIGN KEY ("+KEY_UNIVERSITY_NAME+") REFERENCES "+TABLE_NAME_1+" ("+KEY_UNIVERSITY_NAME+"),"
                +KEY_COURSE_NAME+" TEXT,"
                +KEY_SEMESTER+" TEXT,"
                +KEY_CREDIT_HOUR+" TEXT,"
                +KEY_TUTION_FEES+" TEXT "
                +")";
        db.execSQL(CREATE_COURSE_TABLE);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP IF EXISTS "+TABLE_NAME_1);
        db.execSQL("DROP IF EXISTS "+TABLE_NAME_2);
        onCreate(db);
    }

    public void addUniversity(University university){
        SQLiteDatabase db = this.getWritableDatabase();

        /*String insert="insert into "+TABLE_NAME_1+"("+KEY_UNIVERSITY_NAME+","+KEY_NUMBER_OF_COURSES+","+KEY_ABOUT+","
                +KEY_SCHOLARSHIP+","+KEY_HOSTEL_FACILITIES+","+KEY_ADDRESS+","+KEY_EMAIL+","+KEY_MOBILE+","+KEY_WEBSITE
                +") values('"+university.getUNIVERSITY_NAME()+"','"+university.getNUMBER_OF_COURSES()+"','"
                +university.getABOUT()+"','"+university.getSCHOLARSHIP()+"','"
                +university.getHOSTEL_FACILITIES()+"','"+university.getADDRESS()+"','"+university.getEMAIL()+"','"
                +university.getMOBILE()+"','"+university.getWEBSITE()+"');";
        db.execSQL(insert);*/

        ContentValues values = new ContentValues();
        values.put(KEY_UNIVERSITY_NAME,university.getUNIVERSITY_NAME());
        values.put(KEY_NUMBER_OF_COURSES,university.getNUMBER_OF_COURSES());
        values.put(KEY_ABOUT,university.getABOUT());
        values.put(KEY_SCHOLARSHIP,university.getSCHOLARSHIP());
        values.put(KEY_HOSTEL_FACILITIES,university.getHOSTEL_FACILITIES());
        values.put(KEY_ADDRESS,university.getADDRESS());
        values.put(KEY_EMAIL,university.getEMAIL());
        values.put(KEY_MOBILE,university.getMOBILE());
        values.put(KEY_WEBSITE,university.getWEBSITE());

        db.insert(TABLE_NAME_1, null, values);
        db.close();

    }
    public University getSingleUniversity(int id){
        SQLiteDatabase db=this.getReadableDatabase();

        Cursor cursor=db.query(TABLE_NAME_1,new String[] {KEY_ID,KEY_UNIVERSITY_NAME,KEY_NUMBER_OF_COURSES,KEY_ABOUT,KEY_SCHOLARSHIP,
                KEY_HOSTEL_FACILITIES,KEY_ADDRESS,KEY_EMAIL,KEY_MOBILE,KEY_WEBSITE},
                KEY_ID+"=?",new String[]{String.valueOf(id)},null,null,null,null);
        if(cursor!=null){
            cursor.moveToFirst();
        }
        University myUniversity =new University(Integer.parseInt(cursor.getString(0)),cursor.getString(1),
                Integer.parseInt(cursor.getString(2)),cursor.getString(3),cursor.getString(4),cursor.getString(5),
                cursor.getString(6),cursor.getString(7),cursor.getString(8),cursor.getString(9));
        return myUniversity;
    }
    public void deleteSingleUniversity(int id){
        SQLiteDatabase db =this.getWritableDatabase();
        db.delete(TABLE_NAME_1, KEY_ID+"=?", new String[]{String.valueOf(id)});
        db.close();
    }


    public void addCourse(Course course) {
        SQLiteDatabase db = this.getWritableDatabase();

        /*String insert="insert into "+TABLE_NAME_2+"("+KEY_UNIVERSITY_NAME+","+KEY_COURSE_NAME
                +","+KEY_SEMESTER+","+KEY_CREDIT_HOUR+","+KEY_TUTION_FEES+") values('"
                +course.getUNIVERSITY_NAME()+"','"+course.getCOURSE_NAME()+"','"
                +course.getSEMESTER()+"','"+course.getCREDIT_HOUR()+"','"+course.getTUTION_FEES()+"')";

        db.execSQL(insert);*/
        ContentValues values = new ContentValues();
        values.put(KEY_UNIVERSITY_NAME, course.getUNIVERSITY_NAME());
        values.put(KEY_COURSE_NAME,course.getCOURSE_NAME());
        values.put(KEY_SEMESTER,course.getSEMESTER());
        values.put(KEY_CREDIT_HOUR,course.getCREDIT_HOUR());
        values.put(KEY_TUTION_FEES,course.getTUTION_FEES());

        db.insert(TABLE_NAME_2, null, values);


        db.close();
    }

    public Course getSingleCourse(int id){
        SQLiteDatabase db =this.getReadableDatabase();
        Cursor cursor =db.query(TABLE_NAME_2,new String[]{KEY_ID,KEY_UNIVERSITY_NAME,KEY_COURSE_NAME,KEY_SEMESTER,KEY_CREDIT_HOUR,KEY_TUTION_FEES},
                KEY_ID+"=?",new String[]{String.valueOf(id)},null,null,null,null);
        if(cursor!=null){
            cursor.moveToFirst();
        }
        Course myCourse =new Course(Integer.parseInt(cursor.getString(0)),cursor.getString(1),cursor.getString(2),cursor.getString(3),
                cursor.getString(4),cursor.getString(5));
        return myCourse;
    }

    public void deleteSingleCourse(int id){
        SQLiteDatabase db =this.getWritableDatabase();
        //String s="Delete "+TABLE_NAME_2+" where id="+id;
        //db.execSQL(s);
        db.delete(TABLE_NAME_2, KEY_ID+"=?", new String[]{String.valueOf(id)});
        db.close();
    }
    public List<Course> getAllCourse(){
        List<Course> myCourseList=new ArrayList<Course>();
        SQLiteDatabase db=getReadableDatabase();
        String selectquery="SELECT * FROM "+ TABLE_NAME_2;
        Cursor cursor=db.rawQuery(selectquery, null);
        if(cursor.moveToFirst()){
            do{
                Course course =new Course(Integer.parseInt(cursor.getString(0)),cursor.getString(1),cursor.getString(2),cursor.getString(3),
                        cursor.getString(4),cursor.getString(5));
                myCourseList.add(course);
            }while(cursor.moveToNext());
        }
        return myCourseList;
    }
    public List<Course> getAllCourseOfUniversity(String university){
        List<Course> myCourseList=new ArrayList<Course>();
        SQLiteDatabase db=getReadableDatabase();
        String selectquery="SELECT * FROM "+ TABLE_NAME_2+" where "+KEY_UNIVERSITY_NAME+" ='"+university+"'";
        Cursor cursor=db.rawQuery(selectquery, null);
        if(cursor.moveToFirst()){
            do{
                Course course =new Course(Integer.parseInt(cursor.getString(0)),cursor.getString(1),cursor.getString(2),cursor.getString(3),
                        cursor.getString(4),cursor.getString(5));
                myCourseList.add(course);
            }while(cursor.moveToNext());
        }
        return myCourseList;
    }
    public List<University> getAllUniversity(){
        List<University> myUniversityList=new ArrayList<University>();
        SQLiteDatabase db=getReadableDatabase();
        String selectquery="SELECT * FROM "+ TABLE_NAME_1;
        Cursor cursor=db.rawQuery(selectquery, null);
        if(cursor.moveToFirst()){
            do{
                University university=new University(Integer.parseInt(cursor.getString(0)),cursor.getString(1),
                        Integer.parseInt(cursor.getString(2)),cursor.getString(3),cursor.getString(4),cursor.getString(5),
                        cursor.getString(6),cursor.getString(7),cursor.getString(8),cursor.getString(9));
                myUniversityList.add(university);
            }while(cursor.moveToNext());
        }
        return myUniversityList;
    }
    public List<Course> getAllCourseOfUniversityAndCourse(String university,String course1){
        List<Course> myCourseList=new ArrayList<Course>();
        SQLiteDatabase db=getReadableDatabase();
        String selectquery="SELECT * FROM "+ TABLE_NAME_2+" where "+KEY_UNIVERSITY_NAME+" ='"+university+"',"+KEY_COURSE_NAME+" ='"+course1+"'";
        Cursor cursor=db.rawQuery(selectquery, null);
        if(cursor.moveToFirst()){
            do{
                Course course =new Course(Integer.parseInt(cursor.getString(0)),cursor.getString(1),cursor.getString(2),cursor.getString(3),
                        cursor.getString(4),cursor.getString(5));
                myCourseList.add(course);
            }while(cursor.moveToNext());
        }
        return myCourseList;
    }
    public boolean isDatabaseEmpty(){
        SQLiteDatabase db=getReadableDatabase();
        String selectquery="SELECT * FROM "+ TABLE_NAME_1;
        Cursor cursor=db.rawQuery(selectquery, null);
        if(cursor.moveToFirst()){
            return false;
        }
        return true;
    }
}
