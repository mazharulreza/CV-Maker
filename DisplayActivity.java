package com.example.resumebuilder;

import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.view.View;
import android.widget.TextView;

public class DisplayActivity extends AppCompatActivity {

    TextView tv1,tv2,tv3,tv4,tv5,tv6;
    String st1,st2,st3,st4,st5,st6,st7,st8,st9,st10,st11,st12,st13,st14;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        /*FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });*/

        tv1 = findViewById(R.id.basicInfo);
        tv2 = findViewById(R.id.Skills);
        tv3 = findViewById(R.id.language);
        tv4 = findViewById(R.id.academicInfo);
        tv5 = findViewById(R.id.experiences);
        tv6 = findViewById(R.id.reference);
        st1 = getIntent().getExtras().getString("Name");
        st2 = getIntent().getExtras().getString("Phone");
        st3 = getIntent().getExtras().getString("Email");
        st4 = getIntent().getExtras().getString("Address");
        st5 = getIntent().getExtras().getString("Skill");
        st6 = getIntent().getExtras().getString("Lang");
        st7 = getIntent().getExtras().getString("Edu");
        st8 = getIntent().getExtras().getString("Degree");
        st9 = getIntent().getExtras().getString("Major");
        st10 = getIntent().getExtras().getString("CGPA");
        st11 = getIntent().getExtras().getString("Institute");
        st12 = getIntent().getExtras().getString("Year");
        st13 = getIntent().getExtras().getString("Experience");
        st14 = getIntent().getExtras().getString("Reference");
        tv1.setText("Name: "+st1+"\nPhone Number: "+st2+"\nEmail ID: "+st3+"\nAddress: "+st4);
        tv2.setText(st5);
        tv3.setText(st6);
        tv4.setText("Level of Education: "+st7+"\nDegree: "+st8+"\nMajor: "+st9+"\nCGPA: "+st10+"\nInstitution Name: "+st11+"\nYear of Pass: "+st12);
        tv5.setText(st13);
        tv6.setText(st14);
    }
}
