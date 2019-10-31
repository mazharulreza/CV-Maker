package com.example.resumebuilder;

import android.content.Intent;
import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.EditText;

public class ScrollingActivity extends AppCompatActivity {

    EditText name,num,mail,add,skl,lang,edu,deg,mjr,cg,inst,yr,exp,ref;
    String sName,sNum,sMail,sAdd,sSkl,sLang,sEdu,sDeg,sMjr,sCg,sInst,sYr,sExp,sRef;
    Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_scrolling);
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

        btn = findViewById(R.id.saveButton);
        name = findViewById(R.id.personName);
        num = findViewById(R.id.phoneNumber);
        mail = findViewById(R.id.email);
        add = findViewById(R.id.address);
        skl = findViewById(R.id.skills);
        lang = findViewById(R.id.languages);
        edu = findViewById(R.id.level);
        deg = findViewById(R.id.degree);
        mjr = findViewById(R.id.major);
        cg = findViewById(R.id.grade);
        inst = findViewById(R.id.institution);
        yr = findViewById(R.id.passingyear);
        exp = findViewById(R.id.experience);
        ref = findViewById(R.id.references);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(ScrollingActivity.this, DisplayActivity.class);
                sName = name.getText().toString();
                sNum = num.getText().toString();
                sMail = mail.getText().toString();
                sAdd = add.getText().toString();
                sSkl = skl.getText().toString();
                sLang = lang.getText().toString();
                sEdu = edu.getText().toString();
                sDeg = deg.getText().toString();
                sMjr = mjr.getText().toString();
                sCg = cg.getText().toString();
                sInst = inst.getText().toString();
                sYr = yr.getText().toString();
                sExp = exp.getText().toString();
                sRef = ref.getText().toString();
                myIntent.putExtra("Name",sName);
                myIntent.putExtra("Phone", sNum);
                myIntent.putExtra("Email",sMail);
                myIntent.putExtra("Address",sAdd);
                myIntent.putExtra("Skill",sSkl);
                myIntent.putExtra("Lang",sLang);
                myIntent.putExtra("Edu",sEdu);
                myIntent.putExtra("Degree",sDeg);
                myIntent.putExtra("Major",sMjr);
                myIntent.putExtra("CGPA",sCg);
                myIntent.putExtra("Institute",sInst);
                myIntent.putExtra("Year",sYr);
                myIntent.putExtra("Experience",sExp);
                myIntent.putExtra("Reference",sRef);
                startActivity(myIntent);
                finish();
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_scrolling, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}
