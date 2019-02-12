package com.example.user.audrytablef;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.widget.TableLayout;
import android.widget.TableRow;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        init();
    }
    public void init() {
        TableLayout stk = (TableLayout) findViewById(R.id.table_main);
        TableRow tbrow0 = new TableRow(this);
        TextView tv0 = new TextView(this);
        tv0.setText("ID");
        tv0.setTextColor(Color.WHITE);
        tbrow0.addView(tv0);
        TextView tv1 = new TextView(this);
        tv0.setPadding(20,10,20,10);
        tv1.setText(" NAME ");
        tv1.setTextColor(Color.WHITE);
        tbrow0.addView(tv1);
        TextView tv2 = new TextView(this);
        tv1.setPadding(20,10,20,10);
        tv2.setText(" CGPA");
        tv2.setTextColor(Color.WHITE);
        tbrow0.addView(tv2);
        tv2.setPadding(20,10,20,10);
        TextView tv3 = new TextView(this);
        tv3.setText(" DOB ");
        tv3.setTextColor(Color.WHITE);
        tbrow0.addView(tv3);
        stk.addView(tbrow0);
        for (int i = 1; i <= 50; i++) {
            TableRow tbrow = new TableRow(this);
            TextView t1v = new TextView(this);
            t1v.setText("" + i);
            t1v.setTextColor(Color.BLACK);
            t1v.setGravity(Gravity.CENTER);
            tbrow.addView(t1v);
            t1v.setPadding(20,10,20,10);
            TextView t2v = new TextView(this);
            t2v.setText("Audry " + i);
            t2v.setTextColor(Color.BLACK);
            t2v.setGravity(Gravity.CENTER);
            tbrow.addView(t2v);
            t2v.setPadding(50,10,50,10);
            TextView t3v = new TextView(this);
            t3v.setText("Cgpa" + i);
            t3v.setTextColor(Color.RED);
            t3v.setGravity(Gravity.CENTER);
            tbrow.addView(t3v);
            t3v.setPadding(50,10,50,10);
            TextView t4v = new TextView(this);
            t4v.setText("31.12.1997"  );
            t4v.setTextColor(Color.BLACK);
            t4v.setGravity(Gravity.CENTER);
            tbrow.addView(t4v);
            stk.addView(tbrow);
        }

    }
}
