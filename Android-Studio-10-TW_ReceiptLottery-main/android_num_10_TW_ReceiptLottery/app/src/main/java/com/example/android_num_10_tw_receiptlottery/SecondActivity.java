package com.example.android_num_10_tw_receiptlottery;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity
{
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        b_page();
    }
    public void back(View v)
    {
        finish();
    }
    private void b_page()
    {
        int num;
        Bundle bundle = this.getIntent().getExtras();
        if (bundle != null)
        {
            String mouth = bundle.getString("mouth");
            num = Integer.parseInt(bundle.getString("numberMouth"));
            TextView text = (TextView)findViewById(R.id.month);
            text.setText(mouth);
            if (num == 1)
            {
                TextView win = (TextView)findViewById(R.id.numberList);
                win.setText("111" + "\n" + "112" + "\n" + "113" + "\n" + "114" + "\n" + "115");
            }
            else if (num == 2)
            {
                TextView win = (TextView)findViewById(R.id.numberList);
                win.setText("221" + "\n" + "222" + "\n" + "223" + "\n" + "224" + "\n" + "225");
            }
            else if (num == 3)
            {
                TextView win = (TextView)findViewById(R.id.numberList);
                win.setText("331" + "\n" + "332" + "\n" + "333" + "\n" + "334" + "\n" + "335");
            }
            else if (num == 4)
            {
                TextView win = (TextView)findViewById(R.id.numberList);
                win.setText("441" + "\n" + "442" + "\n" + "443" + "\n" + "444" + "\n" + "445");
            }
            else if (num == 5)
            {
                TextView win = (TextView)findViewById(R.id.numberList);
                win.setText("551" + "\n" + "552" + "\n" + "553" + "\n" + "554" + "\n" + "555");
            }
            else if (num == 6)
            {
                TextView win = (TextView)findViewById(R.id.numberList);
                win.setText("661" + "\n" + "662" + "\n" + "663" + "\n" + "664" + "\n" + "665");
            }
        }
    }
    public void click_BtoC(View v)
    {
        EditText editText = (EditText)findViewById(R.id.editV1);
        Intent intent = new Intent(this, ThirdActivity.class);
        Bundle bundle = new Bundle();
        bundle.putString("winNum", editText.getText().toString());
        intent.putExtras(bundle);
        startActivity(intent);
    }
}