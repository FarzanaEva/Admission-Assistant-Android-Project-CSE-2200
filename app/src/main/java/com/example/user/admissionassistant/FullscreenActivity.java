package com.example.user.admissionassistant;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.os.Handler;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;

import com.example.user.admissionassistant.DatabaeHelper;
import com.example.user.admissionassistant.University;

import java.util.List;

/**
 * An example full-screen activity that shows and hides the system UI (i.e.
 * status bar and navigation/system bar) with user interaction.
 */
public class FullscreenActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_fullscreen);
        DatabaeHelper db = new DatabaeHelper(this);
        Course course;

        Log.d("Inserting: ", "Inseting.....");
        if(db.isDatabaseEmpty()){
            Log.d("Database Detais:","Database is empty");
            //AUST
        db.addUniversity(new University("Ahsanullah university of science and Technology",8,
                "The Ahsanullah University of Science and Technology\n" +
                        "(AUST) was founded by the Dhaka Ahsania Mission in\n" +
                        "1995.\n" +
                        "Dhaka Ahsania Mission is a nonprofit\n" +
                        "voluntary\n" +
                        "organization in Bangladesh. The Mission was established\n" +
                        "in 1958 by Khan Bahadur Ahsanullah, an outstanding\n" +
                        "educationist and social reformer of undivided India. With\n" +
                        "his own vision of a better society, characterized by a\n" +
                        "wealth of moral and spiritual values of the highest\n" +
                        "humanism that are universally acclaimed through ages\n" +
                        "and manifested in every sphere of life\uDBC2\uDF1Bsocial, economic\n" +
                        "and cultural; and access to education and resources, he\n" +
                        "established the Mission. His remarkable educational\n" +
                        "reforms include among others introduction of roll number\n" +
                        "system in the public examination and creating equal\n" +
                        "opportunity for education of all groups of people in the\n" +
                        "society.\n",
                " -> Full free\n" + " -> Half free tuition award\n" +
                        "** applicable for distress quota,freedom fighter quota,sibling quota,remote area quota."
                        ,"Hostel Facilities are limited",
                "Ahsanullah University of Science & Technology\n" +
                "141 & 142, Love Road, Tejgaon Industrial Area, Dhaka1208.",
                "info@aust.edu, regr@aust.edu","Tel. (8802) 8870422, Ext. 107, 114, Fax : (8802) 887041718",
                "http://www.aust.edu"));


        Log.d("course","course Table....");
        db.addCourse(new Course("Ahsanullah university of science and Technology","Architecture Engineering",
                "5 years course.6 month per semester.Total 8 semester.","At most 21 credit hour in a semester.Total 206 credit hour",
                "In time of Addmission 1,04,800.00 tk and every other semester 80,400.00 tk.Total 8,28,400.00 tk."));
        db.addCourse(new Course("Ahsanullah university of science and Technology","CIVIL ENGNIEERING",
                "4 years course.6 month per semester.Total 8 semester.","At most 21 credit hour in a semester.Total 164 credit hour",
                "In time of Addmission 1,04,800.00 tk and every other semester 80,400.00 tk.Total 6,67,600.00 tk."));

        db.addCourse(new Course("Ahsanullah university of science and Technology","Computer Science and Engineering",
                "4 years course.6 month per semester.Total 8 semester.","At most 21 credit hour in a semester.Total 164 credit hour",
                "In time of Addmission 1,04,800.00 tk and every other semester 80,400.00 tk.Total 6,67,600.00 tk."));
        db.addCourse(new Course("Ahsanullah university of science and Technology","ELECTRICAL AND ELECTRONOCAL Engineering",
                "4 years course.6 month per semester.Total 8 semester.","At most 21 credit hour in a semester.Total 164 credit hour",
                "In time of Addmission 1,04,800.00 tk and every other semester 80,400.00 tk.Total 6,67,600.00 tk."));
        db.addCourse(new Course("Ahsanullah university of science and Technology","Textile Engineering",
                "4 years course.6 month per semester.Total 8 semester.","At most 21 credit hour in a semester.Total 164 credit hour",
                "In time of Addmission 1,04,800.00 tk and every other semester 80,400.00 tk.Total 6,67,600.00 tk."));
        db.addCourse(new Course("Ahsanullah university of science and Technology","Industrial Production Engineering",
                "4 years course.6 month per semester.Total 8 semester.","At most 21 credit hour in a semester.Total 164 credit hour",
                "In time of Addmission 1,04,800.00 tk and every other semester 80,400.00 tk.Total 6,67,600.00 tk."));

        db.addCourse(new Course("Ahsanullah university of science and Technology","MECANICAL Engineering",
                "4 years course.6 month per semester.Total 8 semester.","At most 21 credit hour in a semester.Total 164 credit hour",
                "In time of Addmission 1,04,800.00 tk and every other semester 80,400.00 tk.Total 6,67,600.00 tk."));
        db.addCourse(new Course("Ahsanullah university of science and Technology","BBA",
                "4 years course.6 month per semester.Total 8 semester.","At most 21 credit hour in a semester.Total 164 credit hour",
                "In time of Addmission 80,360.00 tk and every other semester 64,660.00 tk.Total 5,32,980.00 tk."));

            //EWU
        db.addUniversity(new University("East West University",
                14,
                "The idea of establishing a private university to provide quality education at an affordable cost in Bangladesh was first mooted by a group\n" +
                        " of prominent academics, business leaders, professionals and education enthusiasts led by Dr. Mohammed Farashuddin. With this end in view,\n" +
                        " this group formed a non-profit, non-political, charitable organization called Progoti Foundation for Education and Development (PFED).\n" +
                        "After being accorded permission by the Government under the Private University Act (Act 34) of 1992,\n" +
                        " East West University was launched in 1996. \n" +
                        "Classes started in September 1996 with 6 faculty members and 20 students in the campus located at 43 Mohakhali C/A, Dhaka-1212.",
                " -> merit scholarship\n" +
                        "->trustee's scholarship\n" +
                        "->freedom fighter scholarship\n" +
                        "-> Benefit for EWU Employees\n" +
                        "->The Medha Lalon Fund",
                "Hostel Facilities are limited",
                "The Admission Office\n" +
                        "A/2, Jahurul Islam Avenue | Jahurul Islam City | Aftabnagar |\n" +
                        "Dhaka-1212 | Bangladesh\n",
                "admissions@ewubd.edu  info@ewubd.edu",
                "Phone:9858261, 09666775577,\nMobile: 01755587224",
                "www.ewubd.edu"));

        db.addCourse(new Course("East West University","BBA",
                "4 years course.4 month per semester.Total 12 semester.","At most 9 credit hour in a semester.Total 123 credit hour",
                "tuition fee=5,81,700/=,\nlab fee=18,120/=,\naddmission fee=15,000/=,\ntotal fee=6,14,820/=,\nStudent Activity Fee=Tk. 510/- per semester\n"));
        db.addCourse(new Course("East West University","BSS in Economics",
                "4 years course.4 month per semester.Total 12 semester.","At most 9 credit hour in a semester.Total 123 credit hour",
                "tuition fee=4,72,500/=,\nlab fee=18,120/=,\naddmission fee=15,000/=,\ntotal fee=5,05,620/=,\nStudent Activity Fee=Tk. 510/- per semester\n"));
        db.addCourse(new Course("East West University","BA in English",
                "4 years course.4 month per semester.Total 12 semester.","At most 9 credit hour in a semester.Total 123 credit hour",
                "tuition fee=4,64,100/=,\nlab fee=18,120/=,\naddmission fee=15,000/=,\ntotal fee=4,97,220/=,\nStudent Activity Fee=Tk. 510/- per semester\n"));
        db.addCourse(new Course("East West University","BSS in Sociology",
                "4 years course.4 month per semester.Total 12 semester.","At most 9 credit hour in a semester.Total 123 credit hour",
                "tuition fee=4,55,700/=,\nlab fee=18,120/=,\naddmission fee=15,000/=,\ntotal fee=4,88,820/=,\nStudent Activity Fee=Tk. 510/- per semester\n"));
        db.addCourse(new Course("East West University","BSS in Information Studies and Library Management",
                "4 years course.4 month per semester.Total 12 semester.","At most 9 credit hour in a semester.Total 123 credit hour",
                "tuition fee=4,00,500/=,\nlab fee=18,120/=,\naddmission fee=15,000/=,\ntotal fee=4,33,620/=,\nStudent Activity Fee=Tk. 510/- per semester\n"));
        db.addCourse(new Course("East West University","LL.B (Hon’s)",
                "4 years course.4 month per semester.Total 12 semester.","At most 9 credit hour in a semester.Total 135 credit hour",
                "tuition fee=4,32,300/=,\nlab fee=18,120/=,\naddmission fee=15,000/=,\ntotal fee=4,65,420/=,\nStudent Activity Fee=Tk. 510/- per semester\n"));
        db.addCourse(new Course("East West University","BS in Applied Statistics",
                "4 years course.4 month per semester.Total 12 semester.","At most 9 credit hour in a semester.Total 127 credit hour",
                "tuition fee=4,78,100/=,\nlab fee=18,120/=,\naddmission fee=15,000/=,\ntotal fee=5,11,220/=,\nStudent Activity Fee=Tk. 510/- per semester\n"));
        db.addCourse(new Course("East West University","B. Sc. in ETE",
                "4 years course.4 month per semester.Total 12 semester.","At most 9 credit hour in a semester.Total 140 credit hour",
                "tuition fee=6,77,600/=,\nlab fee=36,120/=,\naddmission fee=15,000/=,\ntotal fee=7,28,720/=,\nStudent Activity Fee=Tk. 510/- per semester\n"));


        db.addCourse(new Course("East West University","B. Sc. in ICE",
                "4 years course.4 month per semester.Total 12 semester.","At most 9 credit hour in a semester.Total 140 credit hour",
                "tuition fee=6,77,600/=,\nlab fee=36,120/=,\naddmission fee=15,000/=,\ntotal fee=7,28,720/=,\nStudent Activity Fee=Tk. 510/- per semester\n"));
        db.addCourse(new Course("East West University","B. Sc. in CSE",
                "4 years course.4 month per semester.Total 12 semester.","At most 9 credit hour in a semester.Total 140 credit hour",
                "tuition fee=6,77,600/=,\nlab fee=36,120/=,\naddmission fee=15,000/=,\ntotal fee=7,28,720/=,\nStudent Activity Fee=Tk. 510/- per semester\n"));
        db.addCourse(new Course("East West University","B. Sc. in EEE",
                "4 years course.4 month per semester.Total 12 semester.","At most 9 credit hour in a semester.Total 140 credit hour",
                "tuition fee=6,77,600/=,\nlab fee=36,120/=,\naddmission fee=15,000/=,\ntotal fee=7,28,720/=,\nStudent Activity Fee=Tk. 510/- per semester\n"));
        db.addCourse(new Course("East West University","B. Pharm.",
                "4 years course.4 month per semester.Total 12 semester.","At most 9 credit hour in a semester.Total 158 credit hour",
                "tuition fee=7,65,800/=,\nlab fee=36,120/=,\naddmission fee=15,000/=,\ntotal fee=8,16,920/=,\nStudent Activity Fee=Tk. 765/- per semester\n"));
        db.addCourse(new Course("East West University","B. Sc. in GEB",
                "4 years course.4 month per semester.Total 12 semester.","At most 9 credit hour in a semester.Total 133 credit hour",
                "tuition fee=6,43,300/=,\nlab fee=36,120/=,\naddmission fee=15,000/=,\ntotal fee=6,94,420/=,\nStudent Activity Fee=Tk. 510/- per semester\n"));
        db.addCourse(new Course("East West University","B.Sc. in Civil Engineering",
                "4 years course.4 month per semester.Total 12 semester.","At most 9 credit hour in a semester.Total 156.5 credit hour",
                "tuition fee=7,58,450/=,\nlab fee=36,120/=,\naddmission fee=15,000/=,\ntotal fee=8,09,570/=,\nStudent Activity Fee=Tk. 510/- per semester\n"));

            //nsu
        db.addUniversity(new University("North South University",
                14,
                "North South University, the first private university in Bangladesh, was established by a group of philanthropists, industrialists, bureaucrats and academics. \n" +
                        "The government of Bangladesh approved the establishment of North South University in 1992 under Private University Act (PUA)-1992 (now replaced by PUA-2010). \n" +
                        "The university was formally inaugurated on 10 February, 1993 by the then Prime Minister of Bangladesh.\n" +
                        "The honorable President of the People's Republic of Bangladesh is the Chancellor of NSU.",
                "Financial Aid for the wards of freedom fighters (WoFF) of liberation war(Quota based waiver).\n" +
                        "Financial Aid based on previous academic attainment and admission test result(Merit based tuition waiver).\n" +
                        "Financial Aid based on high academic achievement at NSU (Merit based tuition waiver). \n" +
                        "Financial Aid based on financial NEED of a student (based onhumanitarian ground).\n" +
                        "Financial Aid based on Need and Merit of a student (Merit-Need based waiver).\n" +
                        "Financial Aid based on siblings study together at NSU.\n" +
                        "Financial Aid in the form of student employment at NSU (Work-Studybased waiver).",
                "Hostel Facilities are limited",
                "North South University\n" +
                        "Plot 15, Block B, Bashundhara R/A\n" +
                        "Dhaka 1229, Bangladesh",
                "admissions@northsouth.edu",
                "Contact Information\n" +
                        "For Online Application Information\n" +
                        "Call: +880 1724878502\n" +
                        "\n" +
                        "For Admission related information\n" +
                        "Call: 880-2-55668200, Ext: 5000,5002,5004,4001",
                "http://www.northsouth.edu/"));
        db.addCourse(new Course("North South University","Bachelor of Business Administration",
                "4 years course.4 month per semester.Total 12 semester.","At most 9 credit hour in a semester.Total 140 credit hour",
                "addmission fee=20,000, tuition fee per credit=5,500 , student activity fee=2,000 , library fee=500, computer lab fee=1,500."));
        db.addCourse(new Course("North South University","Bachelor of Architecture",
                "5 years course.4 month per semester.Total 15 semester.","At most 9 credit hour in a semester.Total 140 credit hour",
                "addmission fee=20,000, tuition fee per credit=5,500 , student activity fee=2,000 , library fee=500, computer lab fee=1,500 , science lab fee=, studio course fee=3,000."));
        db.addCourse(new Course("North South University","B Pharm",
                "4 years course.4 month per semester.Total 12 semester.","At most 9 credit hour in a semester.Total 140 credit hour",
                "addmission fee=20,000, tuition fee per credit=5,500 , student activity fee=2,000 , library fee=500, computer lab fee=1,500 , science lab fee=750."));
        db.addCourse(new Course("North South University","Biochemistry & Biotechnology",
                "4 years course.4 month per semester.Total 12 semester.","At most 9 credit hour in a semester.Total 140 credit hour",
                "addmission fee=20,000, tuition fee per credit=5,500 , student activity fee=2,000 , library fee=500, computer lab fee=1,500 , science lab fee=500."));
        db.addCourse(new Course("North South University","Civil and Environmental Engineering",
                "4 years course.4 month per semester.Total 12 semester.","At most 9 credit hour in a semester.Total 140 credit hour",
                "addmission fee=20,000, tuition fee per credit=5,500 , student activity fee=2,000 , library fee=500, computer lab fee=1,500 , science lab fee=500."));
        db.addCourse(new Course("North South University","Computer Science & Engineering",
                "4 years course.4 month per semester.Total 12 semester.","At most 9 credit hour in a semester.Total 140 credit hour",
                "addmission fee=20,000, tuition fee per credit=5,500 , student activity fee=2,000 , library fee=500, computer lab fee=1,500."));
        db.addCourse(new Course("North South University","Economics",
                "4 years course.4 month per semester.Total 12 semester.","At most 9 credit hour in a semester.Total 140 credit hour",
                "addmission fee=20,000, tuition fee per credit=5,500 , student activity fee=2,000 , library fee=500, computer lab fee=1,500."));
        db.addCourse(new Course("North South University","Electrical & Electronic Engineering",
                "4 years course.4 month per semester.Total 12 semester.","At most 9 credit hour in a semester.Total 140 credit hour",
                "addmission fee=20,000, tuition fee per credit=5,500 , student activity fee=2,000 , library fee=500, computer lab fee=1,500."));
        db.addCourse(new Course("North South University","Electronic & Telecommunication Engineering",
                "4 years course.4 month per semester.Total 12 semester.","At most 9 credit hour in a semester.Total 140 credit hour",
                "addmission fee=20,000, tuition fee per credit=5,500 , student activity fee=2,000 , library fee=500, computer lab fee=1,500."));
        db.addCourse(new Course("North South University","Environmental Management",
                "4 years course.4 month per semester.Total 12 semester.","At most 9 credit hour in a semester.Total 140 credit hour",
                "addmission fee=20,000, tuition fee per credit=5,500 , student activity fee=2,000 , library fee=500, computer lab fee=1,500."));
        db.addCourse(new Course("North South University","Environmental Science",
                "4 years course.4 month per semester.Total 12 semester.","At most 9 credit hour in a semester.Total 140 credit hour",
                "addmission fee=20,000, tuition fee per credit=5,500 , student activity fee=2,000 , library fee=500, computer lab fee=1,500 , science lab fee=500."));
        db.addCourse(new Course("North South University","Microbiology",
                "4 years course.4 month per semester.Total 12 semester.","At most 9 credit hour in a semester.Total 140 credit hour",
                "addmission fee=20,000, tuition fee per credit=5,500 , student activity fee=2,000 , library fee=500, computer lab fee=1,500 , science lab fee=500."));
        db.addCourse(new Course("North South University","English-TESOL, Linguistics, Literature",
                "4 years course.4 month per semester.Total 12 semester.","At most 9 credit hour in a semester.Total 140 credit hour",
                "addmission fee=20,000, tuition fee per credit=5,500 , student activity fee=2,000 , library fee=500, computer lab fee=1,500."));
        db.addCourse(new Course("North South University","LLB (Hon’s)",
                "4 years course.4 month per semester.Total 12 semester.","At most 9 credit hour in a semester.Total 140 credit hour",
                "addmission fee=20,000, tuition fee per credit=5,500 , student activity fee=2,000 , library fee=500, computer lab fee=1,500."));

            //bracu
        db.addUniversity(new University("BRAC University",
                11,
                "BRAC University (BRACU) was established in 2001. It follows a liberal arts approach to education which nurtures fresh ideas and gives new impetus to the field of tertiary education." +
                        " It ensures a high quality of education and aims to meet the demands of contemporary times. Building on BRAC's experience of seeking solutions to challenges posed by extreme poverty," +
                        " BRACU hopes to instill in its students a commitment to working towards national development and progress. The medium of instruction and examination at BRAC University is English. \n" +
                        "BRACU is accredited by the University Grants Commission (UGC) and approved by the Ministry of Education, Government of Bangladesh.",
                "-> Merit Based Scholarship\n" +
                        "-> Performance Based Scholarship\n" +
                        "-> BRAC Scholarship.",
                "BRAC University offers accommodations to the Female Students on need basis who come to study from distance.\n" +
                        "Relationship Management Office (RMO) provides all logistic support to the residing students. \n" +
                        "RMO ensures smooth functioning of the BRACU Hostel through the Hostel Superintendents. \n" +
                        "RMO also resolve the issue and other problems of BRACU Female Students’ Accommodation.",
                "BRAC University\n" +
                        "66 Mohakhali\n" +
                        "Dhaka 1212\n" +
                        "Bangladesh",
                "info@bracu.ac.bd",
                "Phone: +880-2-9844051-4 (PABX) (Information Desk ext. 4003), +880-2-9853948-9\n" +
                        "Fax: +880-2-58810383, +880-2-9856163",
                "http://www.bracu.ac.bd"));
        db.addCourse(new Course("BRAC University","Bachelor of Architecture",
                "5 years course.4 month per semester.Total 15 semester.","At most 9 credit hour in a semester.Total 170 credit hour",
                "(Admission Fee + Semester Fee + 6 Credit Tuition Fee + Library Membership Fee)(Non- Refundable) Tk. 72,500,"+
                        "Tuition Fee per credit:Tk. 6,500,Fee Per Semester (IT facility, Library, Student Activities) Tk. 7,000," +
                        "Studio Lab fee=Tk. 2,500 per Semester."));
        db.addCourse(new Course("BRAC University","Computer Science and Engineering",
                "4 years course.4 month per semester.Total 12 semester.","At most 9 credit hour in a semester.Total 140 credit hour",
                "(Admission Fee + Semester Fee + 6 Credit Tuition Fee + Library Membership Fee)(Non- Refundable) Tk. 70,000,"+
                        "Tuition Fee per credit:Tk. 6,000,Fee Per Semester (IT facility, Library, Student Activities) Tk. 7,000," +
                        "Lab fee=Tk. 2,500 per Semester."));
        db.addCourse(new Course("BRAC University","Electrical and Electronic Engineering",
                "4 years course.4 month per semester.Total 12 semester.","At most 9 credit hour in a semester.Total 140 credit hour",
                "(Admission Fee + Semester Fee + 6 Credit Tuition Fee + Library Membership Fee)(Non- Refundable) Tk. 70,000,"+
                        "Tuition Fee per credit:Tk. 6,000,Fee Per Semester (IT facility, Library, Student Activities) Tk. 7,000."));
        db.addCourse(new Course("BRAC University","Electronic and Communication Engineering",
                "4 years course.4 month per semester.Total 12 semester.","At most 9 credit hour in a semester.Total 140 credit hour",
                "(Admission Fee + Semester Fee + 6 Credit Tuition Fee + Library Membership Fee)(Non- Refundable) Tk. 70,000,"+
                        "Tuition Fee per credit:Tk. 6,000,Fee Per Semester (IT facility, Library, Student Activities) Tk. 7,000."));
        db.addCourse(new Course("BRAC University","Economics",
                "4 years course.4 month per semester.Total 12 semester.","At most 9 credit hour in a semester.Total 140 credit hour",
                "(Admission Fee + Semester Fee + 6 Credit Tuition Fee + Library Membership Fee)(Non- Refundable) Tk. 70,000,"+
                        "Tuition Fee per credit:Tk. 6,000,Fee Per Semester (IT facility, Library, Student Activities) Tk. 7,000."));
        db.addCourse(new Course("BRAC University","Physics",
                "4 years course.4 month per semester.Total 12 semester.","At most 9 credit hour in a semester.Total 140 credit hour",
                "(Admission Fee + Semester Fee + 6 Credit Tuition Fee + Library Membership Fee)(Non- Refundable) Tk. 70,000,"+
                        "Tuition Fee per credit:Tk. 6,000,Fee Per Semester (IT facility, Library, Student Activities) Tk. 7,000."));
        db.addCourse(new Course("BRAC University","Applied Physics and Electronics",
                "4 years course.4 month per semester.Total 12 semester.","At most 9 credit hour in a semester.Total 140 credit hour",
                "(Admission Fee + Semester Fee + 6 Credit Tuition Fee + Library Membership Fee)(Non- Refundable) Tk. 70,000,"+
                        "Tuition Fee per credit:Tk. 6,000,Fee Per Semester (IT facility, Library, Student Activities) Tk. 7,000."));
        db.addCourse(new Course("BRAC University","Microbiology",
                "4 years course.4 month per semester.Total 12 semester.","At most 9 credit hour in a semester.Total 140 credit hour",
                "(Admission Fee + Semester Fee + 6 Credit Tuition Fee + Library Membership Fee)(Non- Refundable) Tk. 70,000,"+
                        "Tuition Fee per credit:Tk. 6,000,Fee Per Semester (IT facility, Library, Student Activities) Tk. 7,000."));
        db.addCourse(new Course("BRAC University","Biotechnology",
                "4 years course.4 month per semester.Total 12 semester.","At most 9 credit hour in a semester.Total 140 credit hour",
                "(Admission Fee + Semester Fee + 6 Credit Tuition Fee + Library Membership Fee)(Non- Refundable) Tk. 70,000,"+
                        "Tuition Fee per credit:Tk. 6,000,Fee Per Semester (IT facility, Library, Student Activities) Tk. 7,000."));
        db.addCourse(new Course("BRAC University","Mathematics",
                "4 years course.4 month per semester.Total 12 semester.","At most 9 credit hour in a semester.Total 140 credit hour",
                "(Admission Fee + Semester Fee + 6 Credit Tuition Fee + Library Membership Fee)(Non- Refundable) Tk. 70,000,"+
                        "Tuition Fee per credit:Tk. 6,000,Fee Per Semester (IT facility, Library, Student Activities) Tk. 7,000."));
        db.addCourse(new Course("BRAC University","Bachelor of Pharmacy (Honours)",
                "4 years course.6 month per semester.Total 8 semester.","At most 9 credit hour in a semester.Total 140 credit hour",
                "(Admission Fee + Semester Fee + 6 Credit Tuition Fee + Library Membership Fee)(Non- Refundable) Tk. 73,000,"+
                        "Tuition Fee per credit:Tk. 6,000,Fee Per Semester (IT facility, Lab, Library, Student Activities) Tk. 10,000."));

            //aiub
        db.addUniversity(new University("American International University Bangladesh",
                11,
                "American International University - Bangladesh (AIUB) is a government approved private university founded in 1994 by Dr. Anwarul Abedin. \n" +
                        "The university is an independent organization with its own Board of Trustees.",
                "-> Tuition fee award\n" +
                        "-> merit award.",
                "Hostel Facilities are limited.",
                "American International University-Bangladesh (AIUB)\n" +
                        "House 83/B, Road 4, Kemal Ataturk Avenue, Banani,\n" +
                        "Dhaka 1213, Bangladesh",
                "info@aiub.edu",
                "+88-02-9894229, +88-02-9897387, +88-02-58815357,+88-02-8813233",
                "http://www.aiub.edu"));
        db.addCourse(new Course("American International University Bangladesh","BBA",
                "4 years course.6 month per semester.Total 8 semester.","At most 9 credit hour in a semester.Total 123 credit hour",
                "Admission (one-time)=20,000.00,Tuition/credit-hour=5,000.00,Development (Annual)=10,000.00,Student Activity (Annual)=9,000.00,Laboratory (Computer)=2,500.00," +
                        "Laboratory (Science)=2,000.00,Laboratory (Language)=2,500.00,Miscellaneous=3,500.00."));
        db.addCourse(new Course("American International University Bangladesh","Computer Science",
                "4 years course.6 month per semester.Total 8 semester.","At most 9 credit hour in a semester.Total 130 credit hour",
                "Admission (one-time)=20,000.00,Tuition/credit-hour=5,000.00,Development (Annual)=10,000.00,Student Activity (Annual)=9,000.00,Laboratory (Computer)=2,500.00," +
                        "Laboratory (Science)=2,000.00,Laboratory (Language)=2,500.00,Miscellaneous=3,500.00."));

        db.addCourse(new Course("American International University Bangladesh","Computer Engineering",
                "4 years course.6 month per semester.Total 8 semester.","At most 9 credit hour in a semester.Total 140 credit hour",
                "Admission (one-time)=20,000.00,Tuition/credit-hour=5,000.00,Development (Annual)=10,000.00,Student Activity (Annual)=9,000.00,Laboratory (Computer)=2,500.00," +
                        "Laboratory (Science)=2,000.00,Laboratory (Language)=2,500.00,Miscellaneous=3,500.00."));
        db.addCourse(new Course("American International University Bangladesh","Electrical and Electronic Engineering",
                "4 years course.6 month per semester.Total 8 semester.","At most 9 credit hour in a semester.Total 145 credit hour",
                "Admission (one-time)=20,000.00,Tuition/credit-hour=5,000.00,Development (Annual)=10,000.00,Student Activity (Annual)=9,000.00,Laboratory (Computer)=2,500.00," +
                        "Laboratory (Science)=2,000.00,Laboratory (Language)=2,500.00,Miscellaneous=3,500.00."));
        db.addCourse(new Course("American International University Bangladesh","COMPUTER INFORMATION SYSTEMS",
                "4 years course.6 month per semester.Total 8 semester.","At most 9 credit hour in a semester.Total 135 credit hour",
                "Admission (one-time)=20,000.00,Tuition/credit-hour=5,000.00,Development (Annual)=10,000.00,Student Activity (Annual)=9,000.00,Laboratory (Computer)=2,500.00," +
                        "Laboratory (Science)=2,000.00,Laboratory (Language)=2,500.00,Miscellaneous=3,500.00."));
        db.addCourse(new Course("American International University Bangladesh","Software Engineering",
                "4 years course.6 month per semester.Total 8 semester.","At most 9 credit hour in a semester.Total 140 credit hour",
                "Admission (one-time)=20,000.00,Tuition/credit-hour=5,000.00,Development (Annual)=10,000.00,Student Activity (Annual)=9,000.00,Laboratory (Computer)=2,500.00," +
                        "Laboratory (Science)=2,000.00,Laboratory (Language)=2,500.00,Miscellaneous=3,500.00."));
        db.addCourse(new Course("American International University Bangladesh","Computer Science and Software Engineering",
                "4 years course.6 month per semester.Total 8 semester.","At most 9 credit hour in a semester.Total 150 credit hour",
                "Admission (one-time)=20,000.00,Tuition/credit-hour=5,000.00,Development (Annual)=10,000.00,Student Activity (Annual)=9,000.00,Laboratory (Computer)=2,500.00," +
                        "Laboratory (Science)=2,000.00,Laboratory (Language)=2,500.00,Miscellaneous=3,500.00."));
        db.addCourse(new Course("American International University Bangladesh","BSS IN ECONOMICS",
                "4 years course.6 month per semester.Total 8 semester.","At most 9 credit hour in a semester.Total 136 credit hour",
                "Admission (one-time)=20,000.00,Tuition/credit-hour=5,000.00,Development (Annual)=10,000.00,Student Activity (Annual)=9,000.00,Laboratory (Computer)=2,500.00," +
                        "Laboratory (Science)=2,000.00,Laboratory (Language)=2,500.00,Miscellaneous=3,500.00."));
        db.addCourse(new Course("American International University Bangladesh","BA IN ENGLISH",
                "4 years course.6 month per semester.Total 8 semester.","At most 9 credit hour in a semester.Total 120 credit hour",
                "Admission (one-time)=20,000.00,Tuition/credit-hour=5,000.00,Development (Annual)=10,000.00,Student Activity (Annual)=9,000.00,Laboratory (Computer)=2,500.00," +
                        "Laboratory (Science)=2,000.00,Laboratory (Language)=2,500.00,Miscellaneous=3,500.00."));
        db.addCourse(new Course("American International University Bangladesh","BA IN LAWS (L.L B)",
                "4 years course.6 month per semester.Total 8 semester.","At most 9 credit hour in a semester.Total 130 credit hour",
                "Admission (one-time)=20,000.00,Tuition/credit-hour=5,000.00,Development (Annual)=10,000.00,Student Activity (Annual)=9,000.00,Laboratory (Computer)=2,500.00," +
                        "Laboratory (Science)=2,000.00,Laboratory (Language)=2,500.00,Miscellaneous=3,500.00."));
        db.addCourse(new Course("American International University Bangladesh","Architecture",
                "5 years course.6 month per semester.Total 10 semester.","At most 9 credit hour in a semester.Total 130 credit hour",
                "Admission (one-time)=20,000.00,Tuition/credit-hour=5,000.00,Tuition/credit-hour (Studio)=5,000.00,Development (Annual)=10,000.00,Student Activity (Annual)=9,000.00,Laboratory (Computer)=2,500.00," +
                        "Laboratory (Language)=2,500.00,Miscellaneous=3,500.00."));

            //iub
        db.addUniversity(new University("Independent University of Bangladesh",
                17,
                "Independent University, Bangladesh (IUB) established in 1993 is the leading private university in Bangladesh\n" +
                        "with an explicit focus on Research and Global partnerships. \n" +
                        "We are a full service, oriented university with a current enrollment of 5,500 students, 8900 Alumni and 250 faculty members (of which 25% have PhD’s mostly from North America).",
                "->Tuition Fee waiver\n" +
                        "->Financial Assistance.",
                "Hostel Facilities are limited.",
                "Independent University, Bangladesh\n" +
                        "\n" +
                        "Plot 16 Block B, Aftabuddin Ahmed Road\n" +
                        "\n" +
                        "Bashundhara R/A, Dhaka, Bangladesh\n",
                "info@iub.edu.bd",
                "Phone:+88-02-8431645-53, 8432065-76\n" +
                        "Fax: +88-02-8431991",
                "http://www.iub.edu.bd"));
        db.addCourse(new Course("Independent University of Bangladesh","BBA",
                "4 years course.4 month per semester.Total 12 semester.","At most 12 credit hour in a semester.Total 125 credit hour",
                "Admission Fees Tk.17,500 (Once in 4 years)\n" +
                        "Tuition Fees @ Credit Tk. 5,500\n" +
                        "Library, Computer, Laboratory & \n" +
                        "Student Activities Fee\n" +
                        "(@semester): Tk.6,000\n" +
                        "If a student takes 3 courses: Tk. 73,000 (for 3 courses/ 9 credits)\n" +
                        "If a student takes 4 courses: Tk. 89,500 (for 4 courses/ 12 credits)."));
        db.addCourse(new Course("Independent University of Bangladesh","Computer Engineering",
                "4 years course.4 month per semester.Total 12 semester.","At most 12 credit hour in a semester.Total 135 credit hour",
                "Admission Fees Tk.17,500 (Once in 4 years)\n" +
                        "Tuition Fees @ Credit Tk. 5,500\n" +
                        "Library, Computer, Laboratory & \n" +
                        "Student Activities Fee\n" +
                        "(@semester): Tk.6,000\n" +
                        "If a student takes 3 courses: Tk. 73,000 (for 3 courses/ 9 credits)\n" +
                        "If a student takes 4 courses: Tk. 89,500 (for 4 courses/ 12 credits)."));
        db.addCourse(new Course("Independent University of Bangladesh","Computer Science",
                "4 years course.4 month per semester.Total 12 semester.","At most 12 credit hour in a semester.Total 130 credit hour",
                "Admission Fees Tk.17,500 (Once in 4 years)\n" +
                        "Tuition Fees @ Credit Tk. 5,500\n" +
                        "Library, Computer, Laboratory & \n" +
                        "Student Activities Fee\n" +
                        "(@semester): Tk.6,000\n" +
                        "If a student takes 3 courses: Tk. 73,000 (for 3 courses/ 9 credits)\n" +
                        "If a student takes 4 courses: Tk. 89,500 (for 4 courses/ 12 credits)."));
        db.addCourse(new Course("Independent University of Bangladesh","Computer Science & Engineering",
                "4 years course.4 month per semester.Total 12 semester.","At most 12 credit hour in a semester.Total 134 credit hour",
                "Admission Fees Tk.17,500 (Once in 4 years)\n" +
                        "Tuition Fees @ Credit Tk. 5,500\n" +
                        "Library, Computer, Laboratory & \n" +
                        "Student Activities Fee\n" +
                        "(@semester): Tk.6,000\n" +
                        "If a student takes 3 courses: Tk. 73,000 (for 3 courses/ 9 credits)\n" +
                        "If a student takes 4 courses: Tk. 89,500 (for 4 courses/ 12 credits)."));
        db.addCourse(new Course("Independent University of Bangladesh","Electrical & Electronic Engineering",
                "4 years course.4 month per semester.Total 12 semester.","At most 12 credit hour in a semester.Total 132 credit hour",
                "Admission Fees Tk.17,500 (Once in 4 years)\n" +
                        "Tuition Fees @ Credit Tk. 5,500\n" +
                        "Library, Computer, Laboratory & \n" +
                        "Student Activities Fee\n" +
                        "(@semester): Tk.6,000\n" +
                        "If a student takes 3 courses: Tk. 73,000 (for 3 courses/ 9 credits)\n" +
                        "If a student takes 4 courses: Tk. 89,500 (for 4 courses/ 12 credits)."));
        db.addCourse(new Course("Independent University of Bangladesh","Electronic & Telecommunication Engineering",
                "4 years course.4 month per semester.Total 12 semester.","At most 12 credit hour in a semester.Total 138 credit hour",
                "Admission Fees Tk.17,500 (Once in 4 years)\n" +
                        "Tuition Fees @ Credit Tk. 5,500\n" +
                        "Library, Computer, Laboratory & \n" +
                        "Student Activities Fee\n" +
                        "(@semester): Tk.6,000\n" +
                        "If a student takes 3 courses: Tk. 73,000 (for 3 courses/ 9 credits)\n" +
                        "If a student takes 4 courses: Tk. 89,500 (for 4 courses/ 12 credits)."));
        db.addCourse(new Course("Independent University of Bangladesh","Mathematics (Hon's)",
                "4 years course.4 month per semester.Total 12 semester.","At most 12 credit hour in a semester.Total 138 credit hour",
                "Admission Fees Tk.17,500 (Once in 4 years)\n" +
                        "Tuition Fees @ Credit Tk. 5,500\n" +
                        "Library, Computer, Laboratory & \n" +
                        "Student Activities Fee\n" +
                        "(@semester): Tk.6,000\n" +
                        "If a student takes 3 courses: Tk. 73,000 (for 3 courses/ 9 credits)\n" +
                        "If a student takes 4 courses: Tk. 89,500 (for 4 courses/ 12 credits)."));
        db.addCourse(new Course("Independent University of Bangladesh","Physics (Hon's)",
                "4 years course.4 month per semester.Total 12 semester.","At most 12 credit hour in a semester.Total 138 credit hour",
                "Admission Fees Tk.17,500 (Once in 4 years)\n" +
                        "Tuition Fees @ Credit Tk. 5,500\n" +
                        "Library, Computer, Laboratory & \n" +
                        "Student Activities Fee\n" +
                        "(@semester): Tk.6,000\n" +
                        "If a student takes 3 courses: Tk. 73,000 (for 3 courses/ 9 credits)\n" +
                        "If a student takes 4 courses: Tk. 89,500 (for 4 courses/ 12 credits)."));
        db.addCourse(new Course("Independent University of Bangladesh","Environmental Science",
                "4 years course.4 month per semester.Total 12 semester.","At most 12 credit hour in a semester.Total 123 credit hour",
                "Admission Fees Tk.17,500 (Once in 4 years)\n" +
                        "Tuition Fees @ Credit Tk. 5,500\n" +
                        "Library, Computer, Laboratory & \n" +
                        "Student Activities Fee\n" +
                        "(@semester): Tk.6,000\n" +
                        "If a student takes 3 courses: Tk. 73,000 (for 3 courses/ 9 credits)\n" +
                        "If a student takes 4 courses: Tk. 89,500 (for 4 courses/ 12 credits)."));
        db.addCourse(new Course("Independent University of Bangladesh","Environmental Management",
                "4 years course.4 month per semester.Total 12 semester.","At most 12 credit hour in a semester.Total 128 credit hour",
                "Admission Fees Tk.17,500 (Once in 4 years)\n" +
                        "Tuition Fees @ Credit Tk. 5,500\n" +
                        "Library, Computer, Laboratory & \n" +
                        "Student Activities Fee\n" +
                        "(@semester): Tk.6,000\n" +
                        "If a student takes 3 courses: Tk. 73,000 (for 3 courses/ 9 credits)\n" +
                        "If a student takes 4 courses: Tk. 89,500 (for 4 courses/ 12 credits)."));
        db.addCourse(new Course("Independent University of Bangladesh","Media & Development Communication",
                "4 years course.4 month per semester.Total 12 semester.","At most 12 credit hour in a semester.Total 135 credit hour",
                "Admission Fees Tk.17,500 (Once in 4 years)\n" +
                        "Tuition Fees @ Credit Tk. 5,500\n" +
                        "Library, Computer, Laboratory & \n" +
                        "Student Activities Fee\n" +
                        "(@semester): Tk.6,000\n" +
                        "If a student takes 3 courses: Tk. 73,000 (for 3 courses/ 9 credits)\n" +
                        "If a student takes 4 courses: Tk. 89,500 (for 4 courses/ 12 credits)."));
        db.addCourse(new Course("Independent University of Bangladesh","Sociology",
                "4 years course.4 month per semester.Total 12 semester.","At most 12 credit hour in a semester.Total 125 credit hour",
                "Admission Fees Tk.17,500 (Once in 4 years)\n" +
                        "Tuition Fees @ Credit Tk. 5,500\n" +
                        "Library, Computer, Laboratory & \n" +
                        "Student Activities Fee\n" +
                        "(@semester): Tk.6,000\n" +
                        "If a student takes 3 courses: Tk. 73,000 (for 3 courses/ 9 credits)\n" +
                        "If a student takes 4 courses: Tk. 89,500 (for 4 courses/ 12 credits)."));
        db.addCourse(new Course("Independent University of Bangladesh","Physics (Hon's)",
                "4 years course.4 month per semester.Total 12 semester.","At most 12 credit hour in a semester.Total 138 credit hour",
                "Admission Fees Tk.17,500 (Once in 4 years)\n" +
                        "Tuition Fees @ Credit Tk. 5,500\n" +
                        "Library, Computer, Laboratory & \n" +
                        "Student Activities Fee\n" +
                        "(@semester): Tk.6,000\n" +
                        "If a student takes 3 courses: Tk. 73,000 (for 3 courses/ 9 credits)\n" +
                        "If a student takes 4 courses: Tk. 89,500 (for 4 courses/ 12 credits)."));
        db.addCourse(new Course("Independent University of Bangladesh","LLB(Hon's)",
                "4 years course.4 month per semester.Total 12 semester.","At most 12 credit hour in a semester.Total 130 credit hour",
                "Admission Fees Tk.17,500 (Once in 4 years)\n" +
                        "Tuition Fees @ Credit Tk. 5,500\n" +
                        "Library, Computer, Laboratory & \n" +
                        "Student Activities Fee\n" +
                        "(@semester): Tk.6,000\n" +
                        "If a student takes 3 courses: Tk. 73,000 (for 3 courses/ 9 credits)\n" +
                        "If a student takes 4 courses: Tk. 89,500 (for 4 courses/ 12 credits)."));
        db.addCourse(new Course("Independent University of Bangladesh","English Literature",
                "4 years course.4 month per semester.Total 12 semester.","At most 12 credit hour in a semester.Total 124 credit hour",
                "Admission Fees Tk.17,500 (Once in 4 years)\n" +
                        "Tuition Fees @ Credit Tk. 5,500\n" +
                        "Library, Computer, Laboratory & \n" +
                        "Student Activities Fee\n" +
                        "(@semester): Tk.6,000\n" +
                        "If a student takes 3 courses: Tk. 73,000 (for 3 courses/ 9 credits)\n" +
                        "If a student takes 4 courses: Tk. 89,500 (for 4 courses/ 12 credits)."));
        db.addCourse(new Course("Independent University of Bangladesh","Microbiology",
                "4 years course.4 month per semester.Total 12 semester.","At most 12 credit hour in a semester.Total 134 credit hour",
                "Admission Fees Tk.17,500 (Once in 4 years)\n" +
                        "Tuition Fees @ Credit Tk. 5,500\n" +
                        "Library, Computer, Laboratory & \n" +
                        "Student Activities Fee\n" +
                        "(@semester): Tk.6,000\n" +
                        "If a student takes 3 courses: Tk. 73,000 (for 3 courses/ 9 credits)\n" +
                        "If a student takes 4 courses: Tk. 89,500 (for 4 courses/ 12 credits)."));
        db.addCourse(new Course("Independent University of Bangladesh","Biochemistry",
                "4 years course.4 month per semester.Total 12 semester.","At most 12 credit hour in a semester.Total 134 credit hour",
                "Admission Fees Tk.17,500 (Once in 4 years)\n" +
                        "Tuition Fees @ Credit Tk. 5,500\n" +
                        "Library, Computer, Laboratory & \n" +
                        "Student Activities Fee\n" +
                        "(@semester): Tk.6,000\n" +
                        "If a student takes 3 courses: Tk. 73,000 (for 3 courses/ 9 credits)\n" +
                        "If a student takes 4 courses: Tk. 89,500 (for 4 courses/ 12 credits)."));

            //uiu
        db.addUniversity(new University("United International University",
                6,
                "United International University is a private university approved by the Government of the People’s Republic of Bangladesh and University Grants Commission (UGC).\n" +
                        "United International University is established with the generous support and patronage of the United Group, a very successful conglomerate operating in diverse business areas in Bangladesh.",
                "-> TUITION fee waiver\n" +
                        "-> Merit waiver.",
                "Hostel Facilities are limited.",
                "House # 80, Road # 8/A,\n" +
                        "Mirza Golam Hafiz Road,\n" +
                        "Dhanmondi, Dhaka-1209,\n" +
                        "Bangladesh.",
                "info@uiu.ac.bd , admission@uiu.ac.bd",
                "Phone:+88(02) 9125913-6, 9144151, 9118213\n" +
                        "+88(02) 9118170",
                "http://www.uiu.ac.bd"));
        db.addCourse(new Course("United International University","Bachelor of Business Administration (BBA)",
                "4 years course.4 month per semester.Total 12 semester.","Atleast 9 and at most 12 credit hour in a semester.Total 123 credit hour",
                "Admission fees=15,000,Total fees=6,78,000"));
        db.addCourse(new Course("United International University","BBA in Accounting",
                "4 years course.4 month per semester.Total 12 semester.","Atleast 9 and at most 12 credit hour in a semester.Total 123 credit hour",
                "Admission fees=15,000,Total fees=6,78,000"));
        db.addCourse(new Course("United International University","Bachelor of Science in Economics",
                "4 years course.4 month per semester.Total 12 semester.","Atleast 9 and at most 12 credit hour in a semester.Total 120 credit hour",
                "Admission fees=15,000,Total fees=5,07,000"));
        db.addCourse(new Course("United International University","Computer Science & Engineering",
                "4 years course.4 month per semester.Total 12 semester.","Atleast 9 and at most 12 credit hour in a semester.Total 138 credit hour",
                "Admission fees=15,000,Total fees=7,53,000"));
        db.addCourse(new Course("United International University","Electrical & Electronic Engineering",
                "4 years course.4 month per semester.Total 12 semester.","Atleast 9 and at most 12 credit hour in a semester.Total 146.5 credit hour",
                "Admission fees=15,000,Total fees=7,95,500"));
        db.addCourse(new Course("United International University","Electronic & Telecommunication Engineering",
                "4 years course.4 month per semester.Total 12 semester.","Atleast 9 and at most 12 credit hour in a semester.Total 143.5 credit hour",
                "Admission fees=15,000,Total fees=7,80,500"));

        //seu
        db.addUniversity(new University("South East University",
                10,
                "The mission of SEU is to provide higher education to students of Bangladesh at an affordable cost, keeping in view the challenges of the twenty first century. \n" +
                        "And this mission will be achieved by imparting world class education and providing research facilities so that the students can attain their full intellectual, social and personal potentials. \n" +
                        "SEU is committed to develop human capital by cultivating creative thinking in individuals. \n" +
                        "It offers education through both campus and ICT-based online modes of teaching.The vision of Southeast University (SEU) is to flourish as a prestigious seat of learning in the South Asian region." +
                        " As a center of excellence, it aims at attracting students from all countries of the region.",
                "-> Tuition Fee Waiver \n" +
                        "-> Merit Scholarship\n" +
                        "-> Waiver for Freedom Fighters ",
                "The University makes the best possible efforts to provide the finest services and facilities within the hostels. Following are the facilities offered in the hostels :\n" +
                        "Food (The hostel has its own Mess providing hygienic and nutritious vegetarian meals three times a day .Special menus are designed for special occasions & Holydays)\n" +
                        "Rooms with attached washroom, bed, table, chair and almirahs.",
                "Contact for Admission: Admission office\n" +
                        "Road: 18, House: 64, Block: B\n" +
                        "Banani, Dhaka-1213",
                "admission@seu.ac.bd",
                "Tel: 55034135\n" +
                        "Mob: 01911781327, 01766348518\n" +
                        "For Inquiry :\n" +
                        "55034125, 55034126,\n" +
                        "55034127, 55034128, 55034192",
                "http://http://www.seu.ac.bd"));
        db.addCourse(new Course("South East University","BSc in CSE",
                "4 years course.4 month per semester.Total 12 semester.","Total 144 credit hour(Closed credit)",
                "Cost per credit=3000,\nTotal tuition=4,32,000,\nTotal cost=4,88,600"));
        db.addCourse(new Course("South East University","BSc in EEE",
                "4 years course.4 month per semester.Total 12 semester.","Total 144 credit hour(Closed credit)",
                "Cost per credit=3500,\nTotal tuition=5,04,000,\nTotal cost=5,62,100"));
        db.addCourse(new Course("South East University","BSc in Textile",
                "4 years course.4 month per semester.Total 12 semester.","Total 174 credit hour(Closed credit)",
                "Cost per credit=3000,\nTotal tuition=5,22,000,\nTotal cost=5,84,600"));
        db.addCourse(new Course("South East University","B. Pharm",
                "4 years course.6 month per semester.Total 8 semester.","Total 160 credit hour(Closed credit)",
                "Cost per credit=3500,\nTotal tuition=5,60,000,\nTotal cost=6,18,100"));
        db.addCourse(new Course("South East University","B. Architecture",
                "5 years course.4 month per semester.Total 16 semester.","Total 190 credit hour(Closed credit)",
                "Cost per credit=3000,\nTotal tuition=5,70,000,\nTotal cost=6,32,600"));
        db.addCourse(new Course("South East University","BBA",
                "4 years course.4 month per semester.Total 12 semester.","Total 124 credit hour(Closed credit)",
                "Cost per credit=4000,\nTotal tuition=4,96,000,\nTotal cost=5,33,600"));
        db.addCourse(new Course("South East University","LLB (Hons)",
                "4 years course.4 month per semester.Total 12 semester.","Total 147 credit hour(Closed credit)",
                "Cost per credit=3000,\nTotal tuition=4,41,000,\nTotal cost=4,75,600"));
        db.addCourse(new Course("South East University","BA in English",
                "4 years course.4 month per semester.Total 12 semester.","Total 120 credit hour(Closed credit)",
                "Cost per credit=2600,\nTotal tuition=3,12,000,\nTotal cost=3,45,400"));
        db.addCourse(new Course("South East University","BSS in Economics",
                "4 years course.4 month per semester.Total 12 semester.","Total 120 credit hour(Closed credit)",
                "Cost per credit=2700,\nTotal tuition=3,24,000,\nTotal cost=3,48,100"));
        db.addCourse(new Course("South East University","BA in Bangla",
                "4 years course.4 month per semester.Total 12 semester.","Total 120 credit hour(Closed credit)",
                "Cost per credit=800,\nTotal tuition=96,000,\nTotal cost=1,19,600"));
        //UAP
        db.addUniversity(new University("University of Asia Pacific",
                8,
                "University of Asia Pacific (UAP) was established in 1996 as a private university under the Private University Act 1992," +
                        " with a vision to enhance the opportunities for higher education in Bangladesh. Its curriculum has been approved by" +
                        " The University Grants Commission of the Government of the People's Republic of Bangladesh. \n" +
                        "The university started its operation, i.e. the first semester of classes, in 1996, and offered four-year bachelor degree" +
                        " programs in Computer Science and Technology and Business Administration only. \n" +
                        "Now UAP offers undergraduate programs in Architecture, Business Administration, Civil and Environmental Engineering, Computer Science and Engineering and Pharmacy..",
                "-> TUITION FEE WAIVER \n" +
                        "-> Merit Waiver (based on semester result)\n" +
                        "-> Special Waiver (10%-100% VC's special tuition fee waiver for poor but meritorious students.)",
                "Hostel Facilities are limited.",
                "74/A , Green Road , Farmgate, Dhaka - 1215, Bangladesh.",
                "admission@uap-bd.edu, registrar@uap-bd.edu",
                "Telephone: +8802-9126812 PABX: +8802-58157091-4,\n" +
                        "+8802-58157096 (Ext - 0, 120) FAX:+8802-58157097",
                "http://www.uap-bd.edu"));
        db.addCourse(new Course("University of Asia Pacific","B.Arch",
                "5 years course.4 month per semester.Total 16 semester.","Total 198 credit hour.",
                "Total tuition per semester=55,500,\nTotal cost=8,32,500"));
        db.addCourse(new Course("University of Asia Pacific","BBA",
                "4 years course.4 month per semester.Total 12 semester.","Total 130 credit hour.",
                "Total tuition per semester=46,000,\nTotal cost=5,52,000"));
        db.addCourse(new Course("University of Asia Pacific","BSc. in Civil Engineering",
                "4 years course.4 month per semester.Total 12 semester.","Total 161 credit hour.",
                "Total tuition per semester=49,500,\nTotal cost=5,94,000"));
        db.addCourse(new Course("University of Asia Pacific","BSc. in CSE",
                "4 years course.4 month per semester.Total 12 semester.","Total 162 credit hour.",
                "Total tuition per semester=49,500,\nTotal cost=5,94,000"));
        db.addCourse(new Course("University of Asia Pacific","BSc. in EEE",
                "4 years course.4 month per semester.Total 12 semester.","Total 152.5 credit hour.",
                "Total tuition per semester=49,500,\nTotal cost=5,94,000"));
        db.addCourse(new Course("University of Asia Pacific","BA (Hons) in English",
                "4 years course.4 month per semester.Total 12 semester.","Total 120 credit hour.",
                "Total tuition per semester=27,000,\nTotal cost=3,24,000"));
        db.addCourse(new Course("University of Asia Pacific","LL.B (Hons)",
                "4 years course.4 month per semester.Total 12 semester.","Total 144 credit hour.",
                "Total tuition per semester=37,500,\nTotal cost=4,50,000"));
        db.addCourse(new Course("University of Asia Pacific","Bachelor of Pharmacy",
                "4 years course.6 month per semester.Total 8 semester.","Total 162 credit hour.",
                "Total tuition per semester=95,000,\nTotal cost=7,60,000"));

        //DIU
        db.addUniversity(new University("Daffodil International University",
                27,
                "Daffodil International University (DIU) is recognized in independent government assessments as one of top graded universities in Bangladesh.\n" +
                        "The university has been founded by Daffodil Group with the approval of the Ministry of Education under the Private University Act of 1992\n" +
                        "and its amendment in 1998 and Daffodil International University came into being on 24th January 2002, the University today combines impressive modern facilities \n" +
                        "and a dynamic approach to teaching and research with its proud heritage of service and achievement.\n.",
                "-> Tuition fee reward\n" +
                        "-> merit reward\n" +
                        "-> freedom fighter reward\n" +
                        "-> Professor Dr. M. Lutfar Rahman Scholarship \n" +
                        "-> Razia Begum Scholarship \n" +
                        "-> Akij Group (Trust) Scholarship.",
                "Daffodil International University has a rich Hostel and Accommodation facilities for its Students, Faculties and Guests.\n" +
                        "We already have already ……. Hostels (Separate for Male and Female) with different service standards including 4 starred, 3 starred and general standard. \n" +
                        "A group of professionals from Hospitality industries are serving here who have a huge wealth of local knowledge. \n" +
                        "We can also provide personal support, help and advice as well. \n" +
                        "We have split-level shared rooms, single rooms, VIP rooms for our guests which are all in the adjacent area..",
                "102 Shukrabad, Dhanmondi, Dhaka-1207 ( Ground Floor ).",
                "counselor@daffodilvarsity.edu.bd, admission@daffodilvarsity.edu.bd",
                "Phone: +88 02 9138234-5," +
                        "+88 02 9136694, +88 02 9116774 \n" +
                        "Cell: +88 01713493050  \n" +
                        "Fax: 88-02-9131947",
                "https://daffodilvarsity.edu.bd"));
        db.addCourse(new Course("Daffodil International University","B. Sc in Computer Science and Engineering",
                "4 years course.4 month per semester.Total 12 semester.","Total 148 credit hour.",
                "Installment: 20,050, Admission Fee: 29,100, Semester Cost(Average): 61,750, Total: 7,40,400."));
        db.addCourse(new Course("Daffodil International University","B. Sc in Computer Science\n" +
                "and Engineering (CSE) (For Diploma Holder)",
                "Total 10 semester.","Total 115 credit hour.",
                "Installment: 14,000, Admission Fee: 28,350, Semester Cost(Average): 43,725, Total: 4,37,850."));
        db.addCourse(new Course("Daffodil International University","Computing and Information System",
                "4 years course.4 month per semester.Total 12 semester.","Total 142 credit hour.",
                "Installment: 17,650, Admission Fee: 29,100, Semester Cost(Average): 52,960, Total: 6,52,100."));
        db.addCourse(new Course("Daffodil International University","B. Sc in Computer Science",
                "4 years course.4 month per semester.Total 12 semester.","Total 141 credit hour.",
                "Installment: 18,150, Admission Fee: 29,100, Semester Cost(Average): 53,800, Total: 6,55,600."));
        db.addCourse(new Course("Daffodil International University","B.Sc in Software Engineering",
                "4 years course.4 month per semester.Total 12 semester.","Total 140 credit hour.",
                "Installment: 17,133, Admission Fee: 29,100, Semester Cost(Average): 53,800, Total: 6,36,300."));
        db.addCourse(new Course("Daffodil International University","B.Sc in Multimedia and Creative Technology",
                "4 years course.4 month per semester.Total 12 semester.","Total 147 credit hour.",
                "Installment: 15,767, Admission Fee: 29,100, Semester Cost(Average): 48,900, Total: 5,86,750."));
        db.addCourse(new Course("Daffodil International University","Environmental Science and Disaster Management",
                "4 years course.4 month per semester.Total 12 semester.","Total 128 credit hour.",
                "Installment: 9,400, Admission Fee: 29,100, Semester Cost(Average): 29,850, Total: 3,55,600."));
        db.addCourse(new Course("Daffodil International University","Electronics and Telecommunication Engg.",
                "4 years course.4 month per semester.Total 12 semester.","Total 145 credit hour.",
                "Installment: 16,133, Admission Fee: 29,100, Semester Cost(Average): 50,000, Total: 6,00,100."));

        db.addCourse(new Course("Daffodil International University","Electronics and Telecommunication Engg\n" +
                "(For Diploma Holder)",
                "Total 10 semester.","Total 121 credit hour.",
                "Installment: 12,483, Admission Fee: 28,350, Semester Cost(Average): 39,050, Total: 3,93,100."));
        db.addCourse(new Course("Daffodil International University","B. Sc in Textile Engineering.",
                "4 years course.4 month per semester.Total 12 semester.","Total 154 credit hour.",
                "Installment: 16,933, Admission Fee: 34,100, Semester Cost(Average): 52,400, Total: 6,29,000."));

        db.addCourse(new Course("Daffodil International University","B. Sc in Textile Engineering\n" +
                "(For Diploma Holder)",
                "Total 10 semester.","Total 125 credit hour.",
                "Installment: 12,983, Admission Fee: 33,350, Semester Cost(Average): 40,550, Total: 4,13,100."));
        db.addCourse(new Course("Daffodil International University","Electrical & Electronic Engineering.",
                "4 years course.4 month per semester.Total 12 semester.","Total 143 credit hour.",
                "Installment: 18,233, Admission Fee: 29,100, Semester Cost(Average): 56,300, Total: 6,75,000."));
        db.addCourse(new Course("Daffodil International University","Electrical & Electronic Engineering\n" +
                "(For Diploma Holder)",
                "Total 10 semester.","Total 130 credit hour.",
                "Installment: 13,083, Admission Fee: 28,350, Semester Cost(Average): 41,850, Total: 4,11,100."));
        db.addCourse(new Course("Daffodil International University","Bachelor of Architecture",
                "5 years course.4 month per semester.Total 16 semester.","Total 194 credit hour.",
                "Installment: 23,333, Admission Fee: 35,350, Semester Cost(Average): 71,600, Total: 7,47,100."));
        db.addCourse(new Course("Daffodil International University","B.Sc in Civil Engineering.",
                "4 years course.4 month per semester.Total 12 semester.","Total 162 credit hour.",
                "Installment: 16,000, Admission Fee: 32,100, Semester Cost(Average): 49,600, Total: 5,95,100."));
        db.addCourse(new Course("Daffodil International University","B.Sc in Civil Engineering\n" +
                "(For Diploma Holder)",
                "Total 10 semester.","Total 136 credit hour.",
                "Installment: 13,800, Admission Fee: 30,850, Semester Cost(Average): 42,900, Total: 4,31,100."));

        db.addCourse(new Course("Daffodil International University","BBA",
                "4 years course.4 month per semester.Total 12 semester.","Total 126 credit hour.",
                "Installment: 17,833, Admission Fee: 29,100, Semester Cost(Average): 55,100, Total: 6,07,350."));
        db.addCourse(new Course("Daffodil International University","Entrepreneurship (BE)",
                "4 years course.4 month per semester.Total 12 semester.","Total 126 credit hour.",
                "Installment: 19,500, Admission Fee: 34,100, Semester Cost(Average): 60,100, Total: 7,36,100."));
        db.addCourse(new Course("Daffodil International University","Bachelor of Commerce",
                "4 years course.4 month per semester.Total 12 semester.","Total 125 credit hour.",
                "Installment: 11,100, Admission Fee: 29,100, Semester Cost(Average): 33,320, Total: 4,16,400."));
        db.addCourse(new Course("Daffodil International University","Real Estate (BRE)",
                "4 years course.4 month per semester.Total 12 semester.","Total 126 credit hour.",
                "Installment: 15,100, Admission Fee: 29,100, Semester Cost(Average): 46,900, Total: 5,15,100."));
        db.addCourse(new Course("Daffodil International University","Tourism and Hospitality Management",
                "4 years course.4 month per semester.Total 12 semester.","Total 130 credit hour.",
                "Installment: 14,433, Admission Fee: 29,100, Semester Cost(Average): 44,900, Total: 4,93,300."));
        db.addCourse(new Course("Daffodil International University","B. A (Hons.) in English.",
                "4 years course.4 month per semester.Total 12 semester.","Total 126 credit hour.",
                "Installment: 11,300, Admission Fee: 29,100, Semester Cost(Average): 35,500, Total: 3,90,100."));
        db.addCourse(new Course("Daffodil International University","Journalism and Mass Communication",
                "4 years course.4 month per semester.Total 12 semester.","Total 128 credit hour.",
                "Installment: 12,000, Admission Fee: 29,100, Semester Cost(Average): 37,700, Total: 4,14,100."));
        db.addCourse(new Course("Daffodil International University","LL. B (Hons.)",
                "4 years course.4 month per semester.Total 12 semester.","Total 144 credit hour.",
                "Installment: 11,533, Admission Fee: 29,100, Semester Cost(Average): 36,200, Total: 4,32,600."));
        db.addCourse(new Course("Daffodil International University","Bachelor of Pharmacy",
                "4 years course.6 month per semester.Total 8 semester.","Total 162 credit hour.",
                "Installment: 29,233, Admission Fee: 41,050, Semester Cost(Average): 89,300, Total: 7,27,600."));
        db.addCourse(new Course("Daffodil International University","Nutrition & Food Engineering.",
                "4 years course.4 month per semester.Total 12 semester.","Total 142 credit hour.",
                "Installment: 11,600, Admission Fee: 29,100, Semester Cost(Average): 36,500, Total: 4,36,300."));
        db.addCourse(new Course("Daffodil International University","Nutrition & Food Engineering\n" +
                "(For Diploma Holder)",
                "Total 10 semester.","Total 115 credit hour.",
                "Installment: 10,267, Admission Fee: 30,850, Semester Cost(Average): 32,400, Total: 3,32,250."));
        }
        /*db.deleteSingleUniversity(11);
        db.deleteSingleUniversity(12);
        for(int i=127;i<=146;i++){
            db.deleteSingleCourse(i);
        }*/







        List<University> myUniversitylist=db.getAllUniversity();
        for(University university1:myUniversitylist){
            String s="Id: "+university1.getId()+"\nName: "+university1.getUNIVERSITY_NAME()
                    +"\ncoureses: "+university1.getNUMBER_OF_COURSES()+"\nAbout: "+university1.getABOUT()
                    +"\nscholarship: "+university1.getSCHOLARSHIP()+"\nhostel facilities: "+university1.getHOSTEL_FACILITIES()
                    +"\nAddress: "+university1.getADDRESS()+"\nemail: "+university1.getEMAIL()
                    +"\nmobile: "+university1.getMOBILE()+"\nwebsite: "+university1.getWEBSITE();
            Log.d("Name:",s);
        }

       /* List<Course> myCourseList=db.getAllCourse();
        for(Course course1:myCourseList){
            String s="Id: "+course1.getId()+"\nUniversity Name: "+course1.getUNIVERSITY_NAME()
                    +"\nCourse Name: "+course1.getCOURSE_NAME()+"\nSemester: "+course1.getSEMESTER()
                    +"\nCredit Hour: "+course1.getCREDIT_HOUR()+"\nTution fees: "+course1.getTUTION_FEES();
            Log.d("s",s);
        }*/



        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent = new Intent(FullscreenActivity.this, MainActivity.class);
                startActivity(intent);
                finish();
            }
        },2000);
    }

}
