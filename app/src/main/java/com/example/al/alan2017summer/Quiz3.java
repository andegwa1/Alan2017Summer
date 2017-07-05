package com.example.al.alan2017summer;

import android.support.annotation.IdRes;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioGroup;

import com.example.al.alan2017summer.dialog.CustomDialog;
import com.example.al.alan2017summer.dialog.QuizDialog;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class Quiz3 extends BaseActivity {


//    @BindView(R.id.activity_dialog)
//    RadioGroup radioGroup;

    //private int checkedID;

    @OnClick(R.id.quiz3_dialog)
    public void ok(View view) {
        QuizDialog quizDialog = new QuizDialog(this, new QuizDialog.IQuizDialogListener() {
            @Override
            public void onOKClicked(String msg) {
                shortToast(msg);
            }
        });
                quizDialog.setCanceledOnTouchOutside(true);
                quizDialog.show();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz3);
        ButterKnife.bind(this);


    }
}
