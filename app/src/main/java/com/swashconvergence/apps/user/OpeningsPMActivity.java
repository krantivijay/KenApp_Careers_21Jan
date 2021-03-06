package com.swashconvergence.apps.user;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.AppCompatTextView;
import android.view.View;
import android.view.WindowManager;
import android.widget.ImageView;

public class OpeningsPMActivity extends AppCompatActivity implements View.OnClickListener {

    AppCompatTextView textView_read_more,textView_read_more1,textView_read_more2;
    ImageView img_back;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.feed_pm_row_item);
        initView();

    }

    private void initView() {
        textView_read_more= (AppCompatTextView) findViewById(R.id.textView_read_more);
        textView_read_more.setOnClickListener(this);
        textView_read_more1= (AppCompatTextView) findViewById(R.id.textView_read_more1);
        textView_read_more1.setOnClickListener(this);
        textView_read_more2= (AppCompatTextView) findViewById(R.id.textView_read_more2);
        textView_read_more2.setOnClickListener(this);
        img_back= (ImageView) findViewById(R.id.img_back);
        img_back.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.textView_read_more:
                Intent readMorIntent=new Intent(OpeningsPMActivity.this,JobDetailsPMActivity.class);
                startActivity(readMorIntent);
                //finish();
            break;
            case R.id.textView_read_more1:
                Intent readMorIntent2=new Intent(OpeningsPMActivity.this,JobDetailsPMActivity.class);
                startActivity(readMorIntent2);
                //finish();
                break;
            case R.id.textView_read_more2:
                Intent readMorIntent3=new Intent(OpeningsPMActivity.this,JobDetailsPMActivity.class);
                startActivity(readMorIntent3);
                //finish();
                break;
            case R.id.img_back:
                onBackPressed();
                break;
        }

    }
}
