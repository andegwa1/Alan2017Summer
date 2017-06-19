package com.example.al.alan2017summer;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class ActivityA extends BaseActivity {

    @OnClick(R.id.activity_a_a)
    public void toA(View view){
        toActivity(ActivityA.class);
//      Intent intent = new Intent(this, ActivityA.class);
//      startActivity(intent);
    }

    @OnClick(R.id.activity_a_b)
    public void toB(View view){
        toActivity(ActivityB.class);
    }

    @OnClick(R.id.activity_a_c)
    public void toC(View view){
        toActivity(ActivityC.class);
    }

    @OnClick(R.id.activity_a_d)
    public void toD(View view){
        toActivity(ActivityD.class);
    }



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_a);
        ButterKnife.bind(this);
        showToast("onCreate");
    }

    @Override
    protected void onNewIntent(Intent intent){
        super.onNewIntent(intent);
        showToast("onNewIntent");
    }

}
