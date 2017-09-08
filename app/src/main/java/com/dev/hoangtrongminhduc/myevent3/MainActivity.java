package com.dev.hoangtrongminhduc.myevent3;

import android.content.DialogInterface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
        Button btn_sum;
        EditText edta, edtb;
        TextView txvkq;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button btn_sum=(Button) findViewById(R.id.btn_sum);
        btn_sum.setOnClickListener(this);
        edta=(EditText) findViewById(R.id.edta);
        edtb=(EditText) findViewById(R.id.edtb);
        txvkq=(TextView) findViewById(R.id.txvkq);
    }
    @Override
    public void onClick(View v){
        int a=Integer.parseInt(edta.getText()+"");
        int b=Integer.parseInt(edtb.getText()+"");
        txvkq.setText((a+b)+"");
    }
}

