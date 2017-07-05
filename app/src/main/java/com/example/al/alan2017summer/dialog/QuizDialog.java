package com.example.al.alan2017summer.dialog;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.support.annotation.IdRes;
import android.support.annotation.NonNull;
import android.view.View;
import android.widget.RadioGroup;

import com.example.al.alan2017summer.R;

import java.util.Map;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

import static android.R.id.list;

/**
 * Created by Al on 7/3/2017.
 */

public class QuizDialog extends Dialog {


    private final IQuizDialogListener quizDialogListener;

    @BindView(R.id.activity_radio_quiz)
    RadioGroup radioGroup;

    private int checkedID;

    public interface IQuizDialogListener{

        public void onOKClicked(String msg);
        //abstract void onCancelClicked();
    }


    @OnClick(R.id.activity_quiz_yes)
    public void yes(View view){
        quizDialogListener.onOKClicked("Yes");
        cancel();
    }

    @OnClick(R.id.activity_quiz_no)
    public void no(View view){
        quizDialogListener.onOKClicked("No");
        cancel();
    }

    @OnClick(R.id.activity_quiz_exit)
    public void exit(View view){
        System.exit(0);
    }

    @OnClick(R.id.activity_quiz_cancel)
    public void cancel(View view){
        cancel();
    }

//    @OnClick(R.id.activity_quiz_ok)
//    public void ok(View view){
//        quizDialogListener.onOKClicked("OK");
//        cancel();
//    }

//    @OnClick(R.id.activity_check_box_submit)
//    public void submit(View view){
//        String s = "You checked";
//        for(Map.Entry<String,Boolean> entry: list.entrySet()){
//            if(entry.getValue()){
//                s = s + " " +  entry.getKey();
//            }
//        }
//        shortToast(s);
//    }


    public QuizDialog(@NonNull Context context, IQuizDialogListener quizDialogListener) {
        super(context, R.style.dialog);
        setContentView(R.layout.dialog_quiz);
        ButterKnife.bind(this);

        radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
        @Override
        public void onCheckedChanged(RadioGroup radioGroup, @IdRes int checkedId) {
            checkedID = checkedId;
            }
        });


        this.quizDialogListener = quizDialogListener;
    }
}
