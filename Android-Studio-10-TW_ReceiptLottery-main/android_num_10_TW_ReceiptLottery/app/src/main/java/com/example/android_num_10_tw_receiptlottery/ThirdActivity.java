package com.example.android_num_10_tw_receiptlottery;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class ThirdActivity extends AppCompatActivity
{
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third);
        c_page();
    }
    public void re_month(View v)
    {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
    public void re_number(View v)
    {
        finish();
    }
    private void c_page()
    {
        int num;
        Bundle bundle = this.getIntent().getExtras();
        if (bundle != null)
        {
            num = Integer.parseInt(bundle.getString("winNum"));
            TextView textView = (TextView)findViewById(R.id.money);
            if (num == 111)
            {
                textView.setText("2000元");
            }
            else if (num == 112)
            {
                textView.setText("1000元");
            }
            else if (num == 113)
            {
                textView.setText("200元");
            }
            else if (num == 114)
            {
                textView.setText("200元");
            }
            else if (num == 115)
            {
                textView.setText("10元");
            }
            else if (num == 221)
            {
                textView.setText("2000元");
            }
            else if (num == 222)
            {
                textView.setText("1000元");
            }
            else if (num == 223)
            {
                textView.setText("200元");
            }
            else if (num == 224)
            {
                textView.setText("200元");
            }
            else if (num == 225)
            {
                textView.setText("10元");
            }
            else if (num == 331)
            {
                textView.setText("2000元");
            }
            else if (num == 332)
            {
                textView.setText("1000元");
            }
            else if (num == 333)
            {
                textView.setText("200元");
            }
            else if (num == 334)
            {
                textView.setText("200元");
            }
            else if (num == 335)
            {
                textView.setText("10元");
            }
            else if (num == 441)
            {
                textView.setText("2000元");
            }
            else if (num == 442)
            {
                textView.setText("1000元");
            }
            else if (num == 443)
            {
                textView.setText("200元");
            }
            else if (num == 444)
            {
                textView.setText("200元");
            }
            else if (num == 445)
            {
                textView.setText("10元");
            }
            else if (num == 551)
            {
                textView.setText("2000元");
            }
            else if (num == 552)
            {
                textView.setText("1000元");
            }
            else if (num == 553)
            {
                textView.setText("200元");
            }
            else if (num == 554)
            {
                textView.setText("200元");
            }
            else if (num == 555)
            {
                textView.setText("10元");
            }
            else if (num == 661)
            {
                textView.setText("2000元");
            }
            else if (num == 662)
            {
                textView.setText("1000元");
            }
            else if (num == 663)
            {
                textView.setText("200元");
            }
            else if (num == 664)
            {
                textView.setText("200元");
            }
            else if (num == 665)
            {
                textView.setText("10元");
            }
            else
                textView.setText("再接再厲!");
        }
    }
}