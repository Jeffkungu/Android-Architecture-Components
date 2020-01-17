package com.example.hp.studentregister;

import android.content.Context;
import android.content.Intent;
import android.databinding.DataBindingUtil;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Toast;

import com.example.hp.studentregister.databinding.ActivityAddNewStudentBinding;


public class AddNewStudentActivity extends AppCompatActivity {

    private ActivityAddNewStudentBinding activityAddNewStudentBinding;
    private Student student;
    private NewStudentClickHandler newStudentClickHandler;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_new_student);

        student = new Student(0, "", "", "", "");

        activityAddNewStudentBinding = DataBindingUtil.setContentView(this, R.layout.activity_add_new_student);
        activityAddNewStudentBinding.setStudent(student);

        newStudentClickHandler = new NewStudentClickHandler(this);
        activityAddNewStudentBinding.setButtonClickedHandler(newStudentClickHandler);
    }

    public class NewStudentClickHandler {
        Context context;

        public NewStudentClickHandler(Context context){
            this.context = context;
        }

        public void buttonClicked(View view){
            if(TextUtils.isEmpty(student.getName())){
                Toast.makeText(getApplicationContext(),"Name field cannot be empty",Toast.LENGTH_LONG).show();
            }else{
                Intent intent=new Intent();
                intent.putExtra("NAME",student.getName());
                intent.putExtra("EMAIL",student.getEmail());
                intent.putExtra("COUNTRY",student.getCountry());
                setResult(RESULT_OK,intent);
                finish();

            }
        }
    }
}
