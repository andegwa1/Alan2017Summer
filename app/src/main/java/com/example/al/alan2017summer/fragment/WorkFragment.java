package com.example.al.alan2017summer.fragment;

//import android.app.Fragment;
import android.content.Context;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;
import android.provider.Settings;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.ListView;

import com.example.al.alan2017summer.BaseActivity;
import com.example.al.alan2017summer.MainActivity;
import com.example.al.alan2017summer.R;
import com.example.al.alan2017summer.adapter.ListNormalAdapter;
import com.example.al.alan2017summer.dialog.CustomDialog;
import com.example.al.alan2017summer.dialog.QuizDialog;

import org.w3c.dom.Text;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;


public class WorkFragment extends Fragment {



    public WorkFragment() {
        // Required empty public constructor
    }



    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ButterKnife.bind(getActivity());
        //System.exit(0);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_work, container, false);

        Button sub_bt = (Button)view.findViewById(R.id.submit_button);
        sub_bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getActivity(),"Submission successful", Toast.LENGTH_SHORT).show();
            }
        });


        Button qz3 = (Button)view.findViewById(R.id.button_quiz3);
        qz3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                QuizDialog quizDialog = new QuizDialog(getActivity(), new QuizDialog.IQuizDialogListener() {
                    @Override
                    public void onOKClicked(String msg) {
                        Toast.makeText(getActivity(),msg, Toast.LENGTH_SHORT).show();
                    }
                });
                quizDialog.setCanceledOnTouchOutside(true);
                quizDialog.show();
            }
        });




        return view;
    }


//    @OnClick(R.id.submit_button)
//    public void clickSubmit(View v) {
////        Toast.makeText(getContext(), "Submission is Successful!", Toast.LENGTH_SHORT).show();
//        //shortToast("Submission succesful");
//        Toast.makeText(getActivity(),"Submission successful", Toast.LENGTH_SHORT).show();
//
//    }

        @OnClick(R.id.button_quiz1)
        public void clickQuiz1 (View v){
            Toast.makeText(getActivity(),"Quiz 1", Toast.LENGTH_SHORT).show();
        }

        @OnClick(R.id.button_quiz3)
        public void clickQuiz3 (View view){
            QuizDialog quizDialog = new QuizDialog(getActivity(), new QuizDialog.IQuizDialogListener() {
                @Override
                public void onOKClicked(String msg) {
                    Toast.makeText(getActivity(),"Submission successful", Toast.LENGTH_SHORT).show();
                }
            });
            quizDialog.setCanceledOnTouchOutside(true);
            quizDialog.show();

        }




    //}
}