package com.example.al.alan2017summer;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.example.al.alan2017summer.fragment.DemoFragment;
import com.example.al.alan2017summer.fragment.WorkFragment;

public class MainActivity extends AppCompatActivity {

    private TextView tv_demo;
    private TextView tv_work;

    private Button submit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initialView();
        setListener();
    }

    private void initialView() {
        tv_demo = (TextView)findViewById(R.id.activity_tool_demo);
        tv_work = (TextView)findViewById(R.id.activity_tool_work);

        submit = (Button) findViewById(R.id.submit_button);
    }

    private void setListener() {
        final WorkFragment workFragment = new WorkFragment();
        DemoFragment demoFragment = new DemoFragment();
//        getFragmentManager().beginTransaction().replace(R.id.activity_main_fragment,
//                demoFragment).commit();
        getSupportFragmentManager().beginTransaction().replace(R.id.activity_main_fragment,
                demoFragment).commit();

        tv_demo.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "You clicked Demo", Toast.LENGTH_SHORT).show();
            }
        });


        OnClickListener listener = new OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "You clicked work", Toast.LENGTH_SHORT).show();
                tv_work.setTextColor(Color.RED);
                tv_demo.setTextColor(Color.BLACK);
                getSupportFragmentManager().beginTransaction().replace(R.id.activity_main_fragment,
                        workFragment).commit();

            }
        };
//            }
//        };
                tv_work.setOnClickListener(listener);

//        OnClickListener listener1 = new OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Toast.makeText(MainActivity.this, "Submission successful", Toast.LENGTH_SHORT).show();
//                getSupportFragmentManager().beginTransaction().replace(R.id.submit_button,
//                        workFragment).commit();
//
//            }
//        };
//
//        submit.setOnClickListener(listener);
            }

            public void login(View v) {
                Toast.makeText(MainActivity.this, "You clicked login", Toast.LENGTH_SHORT).show();
            }


        }
