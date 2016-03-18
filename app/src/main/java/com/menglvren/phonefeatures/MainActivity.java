package com.menglvren.phonefeatures;

import android.os.Build;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.Display;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView tv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        tv= (TextView) findViewById(R.id.tv);

        DisplayMetrics dms=getResources().getDisplayMetrics();

        StringBuilder sb=new StringBuilder();
        sb.append("screen features:\n");
        sb.append("  heightPixels->"+dms.heightPixels+",widthPixel->"+dms.widthPixels+"\n");
        sb.append("  density->"+dms.density+"\n");
        sb.append("  heightDps->"+dms.heightPixels/dms.density+",widthDps->"+dms.widthPixels/dms.density+"\n");

        tv.setText(sb);

    }
}
