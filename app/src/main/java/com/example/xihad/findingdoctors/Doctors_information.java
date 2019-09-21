package com.example.xihad.findingdoctors;

import android.annotation.SuppressLint;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class Doctors_information extends AppCompatActivity {


    private ImageView imageView;
    private TextView textView, textView1;

    @SuppressLint("RestrictedApi")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_doctors_information);

        imageView = findViewById(R.id.infoImageId);
        textView = findViewById(R.id.indoctorsname);
        textView1 = findViewById(R.id.indoctorsinfo);



        String val = getIntent().getStringExtra("name");
        if (val.equals("abul")) {
            textView.setText("Dr K M Muiaj");
            textView1.setText(R.string.DrKMMuiaj);
        }
        if (val.equals("abul1")) {
            textView.setText("Dr A S M Misbah Uddin");
            textView1.setText(R.string.DrASMMisbahUddin);
        }
        if (val.equals("abul2")) {
            textView.setText("Dr MD Ismail Patuary");
            textView1.setText(R.string.DrMDIsmailPatuary);
        }
        if (val.equals("abul3")) {
            textView.setText("Dr.Hasib Rahman");
            textView1.setText(R.string.DrHasibRahman);
        }
        if (val.equals("abul4")) {
            textView.setText("Dr.Alomgir Safauouth");
            textView1.setText(R.string.DrAlomgirSafauouth);
        }
        if (val.equals("abul5")) {
            textView.setText("Dr.Modushudon Saha");
            textView1.setText(R.string.DrModushudonSaha);
        }

        if (val.equals("abul6")) {
            textView.setText("Dr.Aoliur Rohaman");
            textView1.setText(R.string.DrAoliurRohaman);
        }

        if (val.equals("abul7")) {
            textView.setText("Dr.MD Oliur Rahman");
            textView1.setText(R.string.DrMDOliurRahman);
        }

        if (val.equals("abul8")) {
            textView.setText("Dr.Sayed Shofi Ahmead");
            textView1.setText(R.string.DrSayedShofiAhmead);
        }

        if (val.equals("abul9")) {
            textView.setText("Profesor DR K M J Jaki");
            textView1.setText(R.string.ProfesorDRKMJJaki);
        }
        if (val.equals("abul10")) {
            textView.setText("Dr.Abdul Manan");
            textView1.setText(R.string.DrAbdulManan);
        }
        if (val.equals("abul11")) {
            textView.setText("Dr.Tahmina Sattar");
            textView1.setText(R.string.DrTahminaSattar);
        }
        if (val.equals("abul12")) {
            textView.setText("Dr.MD Monirul Islam");
            textView1.setText(R.string.DrMDMonirulIslam);
        }
        if (val.equals("abul13")) {
            textView.setText("Dr.M Deilwar Hossain");
            textView1.setText(R.string.DrMDeilwarHossain);
        }
        if (val.equals("abul14")) {
            textView.setText("Dr.Shekh A H M Misbah Ul Islam");
            textView1.setText(R.string.DrShekhAHMMisbahUlIslam);
        }
        if (val.equals("abul15")) {
            textView.setText("Dr.Sudangsu Rongon Dey");
            textView1.setText(R.string.DrSudangsuRongonDey);
        }
        if (val.equals("abul16")) {
            textView.setText("Dr.MD Shabuddin");
            textView1.setText(R.string.DrMDShabuddin);
        }
        if (val.equals("abul17")) {
            textView.setText("Dr. MD Bodrul Islam");
            textView1.setText(R.string.DrMDBodrulIslam);
        }
        if (val.equals("abul18")) {
            textView.setText("Dr. MD Sah Jamal Hossein");
            textView1.setText(R.string.DrMDSahJamalHossein);
        }
        if (val.equals("abul19")) {
            textView.setText("Dr. Mrinal Kanti Das");
            textView1.setText(R.string.DrMrinalKantiDas);
        }
        if (val.equals("abul20")) {
            textView.setText("Dr.Ajoy Kumar Dotto");
            textView1.setText(R.string.DrAjoyKumarDotto);
        }
        if (val.equals("abul21")) {
            textView.setText("Dr.Hirnomoy Das");
            textView1.setText(R.string.DrHirnomoyDas);
        }
        if (val.equals("abul22")) {
            textView.setText("Dr.MD Faruk Uddin");
            textView1.setText(R.string.DrAjoyKumarDotto);
        }
        if (val.equals("abul23")) {
            textView.setText("Dr.Dilip Kumar Sorkar");
            textView1.setText(R.string.DrDilipKumarSorkar);
        }
        if (val.equals("abul24")) {
            textView.setText("Dr.Hasan Akther");
            textView1.setText(R.string.DrHasanAkther);
        }
        if (val.equals("abul25")) {
            textView.setText("Dr.Pranoshis Saha");
            textView1.setText(R.string.DrPranoshisSaha);
        }
        if (val.equals("abul26")) {
            textView.setText("Dr.Mujibur Rahman");
            textView1.setText(R.string.DrMujiburRahman);
        }
        if (val.equals("abul27")) {
            textView.setText("Dr.Ashraful Islam");
            textView1.setText(R.string.DrAshrafulIslam);
        }
        if (val.equals("abul28")) {
            textView.setText("Dr M A Malik");
            textView1.setText(R.string.DrMAMalik);
        }
        if (val.equals("abul29")) {
            textView.setText("Dr M A High");
            textView1.setText(R.string.DrMAHigh);
        }
        if (val.equals("abul30")) {
            textView.setText("Dr.Moshahid Takur");
            textView1.setText(R.string.DrMoshahidTakur);
        }
        if (val.equals("abul31")) {
            textView.setText(">Dr.A.An.Am Yusuf");
            textView1.setText(R.string.DrAAnAmYusuf);
        }
        if (val.equals("abul32")) {
            textView.setText("Dr.Khayer Ahmead Chowdhury");
            textView1.setText(R.string.DrKhayerAhmeadChowdhury);
        }
        if (val.equals("abul33")) {
            textView.setText("Profesor DR Sakhawoaht Hossain Chowdhory");
            textView1.setText(R.string.ProfesorDRSakhawoahtHossainChowdhory);
        }
        if (val.equals("abul34")) {
            textView.setText("Dr.Abdul Latif");
            textView1.setText(R.string.DrAbdulLatif);
        }
        if (val.equals("abul35")) {
            textView.setText("Dr.Najmus Shakib");
            textView1.setText(R.string.DrNajmusShakib);
        }
        if (val.equals("abul36")) {
            textView.setText("Dr.Uttom Kumar Saha");
            textView1.setText(R.string.DrUttomKumarSaha);
        }
        if (val.equals("abul37")) {
            textView.setText("Dr.MD Rashidunobi Khan");
            textView1.setText(R.string.DrMDRashidunobiKhan);
        }
        if (val.equals("abul38")) {
            textView.setText("Dr.Afjal Momin");
            textView1.setText(R.string.DrAfjalMomin);
        }
        if (val.equals("abul39")) {
            textView.setText("Dr.D A Hasan Chowdhury");
            textView1.setText(R.string.DrDAHasanChowdhury);
        }
        if (val.equals("abul40")) {
            textView.setText("Dr.D A Rofiqul Salehhin");
            textView1.setText(R.string.DrDARofiqulSalehhin);
        }
        if (val.equals("abul41")) {
            textView.setText("Dr.D A Sayekh Aziz Chowdhury");
            textView1.setText(R.string.DrDASayekhAzizChowdhury);
        }
        if (val.equals("abul42")) {
            textView.setText("Dr.Shamim Anwaral Haque");
            textView1.setText(R.string.DrShamimAnwaralHaque);
        }
        if (val.equals("abul43")) {
            textView.setText("Dr S S Al-Mhamud Sadi");
            textView1.setText(R.string.DrSSAlMhamudSadi);
        }
        if (val.equals("abul44")) {
            textView.setText("Dr.Nurul Hooda Naeem");
            textView1.setText(R.string.DrNurulHoodaNaeem);
        }
        if (val.equals("abul45")) {
            textView.setText("Dr.Gopal Shanker Dey");
            textView1.setText(R.string.DrGopalShankerDey);
        }
        if (val.equals("abul46")) {
            textView.setText("Dr.Samshul Haque Chowdhury");
            textView1.setText(R.string.DrSamshulHaqueChowdhury);
        }
        if (val.equals("abul47")) {
            textView.setText("Dr.Susmhita Rai");
            textView1.setText(R.string.DrSusmhitaRai);
        }
        if (val.equals("abul48")) {
            textView.setText("Dr.Dependro Narayon Das");
            textView1.setText(R.string.DrDependroNarayonDas);
        }


    }

}
