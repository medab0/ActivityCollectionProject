package com.example.activitycollectionproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class PassingIntentsExercise2 extends AppCompatActivity {
    TextView tfFirstName, tfLastName, tfGender,tfStudentID,  tfBirthDate, tfPhoneNumber, tfEmailAddress,tfStatus, tfEthnicity, tfCourse, tfAddress;

    Button btnReturn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_passing_intents_exercise2);
        initialize();

        btnReturn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });
    }



    public void initialize() {
        tfFirstName = findViewById(R.id.tfFirstName);
        tfLastName = findViewById(R.id.tfLastName);
        tfGender = findViewById(R.id.tfGender);
        tfStudentID= findViewById(R.id.tfStudentID);
        tfBirthDate= findViewById(R.id.tfBirthDate);
        tfPhoneNumber= findViewById(R.id.tfPhoneNumber);
        tfEmailAddress= findViewById(R.id.tfEmailAddress);
        tfStatus = findViewById(R.id.tfStatus);
        tfEthnicity = findViewById(R.id.tfEthnicity);
        tfCourse = findViewById(R.id.tfCourse);
        tfAddress = findViewById(R.id.tfAddress);
        btnReturn = findViewById(R.id.btnReturn);
        String firstName , lastName, gender, studentID, birthDate, phoneNumber,
                email, ethnicity ,course,  address, status;


        Intent intent = getIntent();
        firstName = intent.getStringExtra("firstName");
        lastName = intent.getStringExtra("lastName");
        gender = intent.getStringExtra("gender");
        status = intent.getStringExtra("status");
        studentID= intent.getStringExtra("studentID");
        birthDate= intent.getStringExtra("birthDate");
        phoneNumber= intent.getStringExtra("phoneNumber");
        email= intent.getStringExtra("email");
        ethnicity = intent.getStringExtra("ethnicity");
        course = intent.getStringExtra("course");
        address = intent.getStringExtra("address");

        tfFirstName.setText(firstName);
        tfLastName.setText(lastName);
        tfGender.setText(gender);
        tfStudentID.setText(studentID);
        tfBirthDate.setText(birthDate);
        tfPhoneNumber.setText(phoneNumber);
        tfEmailAddress.setText(email);
        tfStatus.setText(status);
        tfCourse.setText(course);
        tfEthnicity.setText(ethnicity);
        tfAddress.setText(address);
    }

}
