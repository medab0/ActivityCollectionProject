package com.example.activitycollectionproject;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class PassingIntentsExercise extends AppCompatActivity {
    EditText fieldFirstName, fieldLastName, fieldBirthDate, fieldPhoneNumber, fieldEmailAddress, fieldStudentID, fieldEthnicity, fieldCourse, fieldAddress;

    Button btnClearForm, btnSubmitForm, rdbtnMale, rdbtnFemale, rdbtnOthers, rdbtnSingle, rdbtnMarried, rdbtnComplicated;

    RadioGroup rdgGender, rdgStatus;
    EditText[] editText;
    String gender, status;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_passing_intents_exercise);
        initialize();


        btnClearForm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                fieldFirstName.setText("");
                fieldLastName.setText("");
                rdgGender.clearCheck();
                rdgStatus.clearCheck();
                fieldStudentID.setText("");
                fieldBirthDate.setText("");
                fieldPhoneNumber.setText("");
                fieldEmailAddress.setText("");
                fieldEthnicity.setText("");
                fieldCourse.setText("");
                fieldAddress.setText("");
            }
        });

        btnSubmitForm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                for(int i = 0 ; i < editText.length; i++) {
                    if(editText[i].getText().toString().length() == 0) {
                        Toast.makeText(PassingIntentsExercise.this, "Please ensure all fields are filled out before proceeding", Toast.LENGTH_SHORT).show();
                        return;
                    }
                }
                int sGender = rdgGender.indexOfChild(findViewById(rdgGender.getCheckedRadioButtonId()));
                String gender;

                switch (sGender) {
                    case 0:
                        gender = "Male";
                        break;
                    case 1:
                        gender = "Female";
                        break;
                    case 2:
                        gender = "Other";
                        break;
                    default:
                        Toast.makeText(PassingIntentsExercise.this, "Gender not selected", Toast.LENGTH_SHORT).show();
                        return;
                }
                for(int i = 0 ; i < editText.length; i++) {
                    if(editText[i].getText().toString().length() == 0) {
                        Toast.makeText(PassingIntentsExercise.this, "Please ensure all fields are filled out before proceeding", Toast.LENGTH_SHORT).show();
                        return;
                    }
                }
                int sStatus = rdgStatus.indexOfChild(findViewById(rdgStatus.getCheckedRadioButtonId()));
                String status;

                switch (sStatus) {
                    case 0:
                        status = "Single";
                        break;
                    case 1:
                        status = "Married";
                        break;
                    case 2:
                        status = "Complicated";
                        break;
                    default:
                        Toast.makeText(PassingIntentsExercise.this, "Complicated not selected", Toast.LENGTH_SHORT).show();
                        return;
                }

                Intent intent = new Intent(PassingIntentsExercise.this, PassingIntentsExercise2.class);
                intent.putExtra("firstname", fieldFirstName.getText().toString());
                intent.putExtra("lastname", fieldLastName.getText().toString());
                intent.putExtra("gender",gender);
                intent.putExtra("status",status);
                intent.putExtra("studentid", fieldStudentID.getText().toString());
                intent.putExtra("birthdate",fieldBirthDate.getText().toString());
                intent.putExtra("phonenumber",fieldPhoneNumber.getText().toString());
                intent.putExtra("email",fieldEmailAddress.getText().toString());
                intent.putExtra("ethnicity",fieldEthnicity.getText().toString());
                intent.putExtra("course",fieldCourse.getText().toString());
                intent.putExtra("address",fieldAddress.getText().toString());
                startActivity(intent);
                System.out.println("Successfully submitted");
            }
        });

    }


    public void initialize() {

        fieldFirstName = findViewById(R.id.fieldFirstName);
        fieldLastName = findViewById(R.id.fieldLastName);
        rdgGender = findViewById(R.id.rdgGender);
        rdbtnMale = findViewById(R.id.rdbtnMale);
        rdbtnFemale = findViewById(R.id.rdbtnFemale);
        rdbtnOthers = findViewById(R.id.rdbtnOthers);
        rdgStatus = findViewById(R.id.rdgStatus);
        rdbtnSingle = findViewById(R.id.rdbtnSingle);
        rdbtnMarried = findViewById(R.id.rdbtnMarried);
        rdbtnComplicated = findViewById(R.id.rdbtnComplicated);
        fieldStudentID = findViewById(R.id.fieldStudentID);
        fieldBirthDate = findViewById(R.id.fieldBirthDate);
        fieldPhoneNumber = findViewById(R.id.fieldPhoneNumber);
        fieldEmailAddress = findViewById(R.id.fieldEmailAddress);
        fieldEthnicity = findViewById(R.id.fieldEthnicity);
        fieldCourse = findViewById(R.id.fieldCourse);
        fieldAddress = findViewById(R.id.fieldAddress);
        btnClearForm = findViewById(R.id.btnClearForm);

        editText = new EditText[]{
                fieldFirstName, fieldLastName, fieldStudentID, fieldBirthDate, fieldPhoneNumber, fieldEmailAddress, fieldEthnicity, fieldCourse, fieldAddress
        };
        btnSubmitForm = findViewById(R.id.btnSubmitForm);
        System.out.println("StudentID: "+ fieldFirstName);
        System.out.println("Clear button: "+btnClearForm);
    }

/*
    public void onClick(View v){
        String fName = eFName.getText().toString();
        String LName = eLName.getText().toString();
        String gender;
        if(rMale.isChecked()){
            gender = "Male";
        } else if (rFem.isChecked()) {
            gender = "Female";
        }
        else if (roth.isChecked()){
            gender = "Others";
        } else{
            gender = "Unknown";
        }
        String bDate = eBDate.getText().toString();
        String pNumber = eNum.getText().toString();
        String emailAdd = eMail.getText().toString();
    }
    Intent intent = new Intent(PassingIntentsExercise.this, PassingIntentsExercise2.class);
    intent.putExtra("fname_key", fName);

    intent.putExtra("fname_key", fName);
    */


}
