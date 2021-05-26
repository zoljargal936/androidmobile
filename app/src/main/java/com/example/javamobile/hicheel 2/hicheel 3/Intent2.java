package com.example.myapplication.Lesson3;

import androidx.appcompat.app.AppCompatActivity;

import android.media.Image;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.myapplication.R;

public class Intent2 extends AppCompatActivity {
    private TextView tv;
    private ImageView iv;
    private int[] img = {R.drawable.
            test1,R.drawable.test2,R.drawable.test3,R.drawable.test4};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_intent2);
        tv = (TextView) findViewById(R.id.tv);
        iv = (ImageView) findViewById(R.id.iv);
        Bundle bundle = getIntent().getExtras();
        int pos = bundle.getInt("pic");
        iv.setImageResource(img[pos]);
    }
}