package com.example.abrarfahim.alumniassociation;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;

public class AddStudent extends AppCompatActivity {
    EditText editStudentName,editGraduationYear,editBatchYear,editCurrentCity,editProfession,editRollNo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_student);
        editStudentName;
        editGraduationYear;
        editBatchYear;
        editCurrentCity;
        editProfession;
        editRollNo;
    }

    public void onClickBackButton(View v) {
        finish();
    }
}
