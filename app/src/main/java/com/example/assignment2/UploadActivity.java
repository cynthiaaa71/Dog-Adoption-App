package com.example.assignment2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class UploadActivity extends AppCompatActivity {

    EditText IBreed, IAge, IColor;
    RadioGroup ISex;
    RadioButton Selectedsex;
    Button Upload;

    String Sex= "Male";
    Integer Age=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_upload);
        IBreed = findViewById(R.id.editTextBreed);
        IAge = findViewById(R.id.editTextAge);
        IColor= findViewById(R.id.editTextColor);
        ISex = findViewById(R.id.radioGroupSex);
        Upload = findViewById(R.id.buttonUpload);

        ISex.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                Selectedsex = findViewById(i);
                Sex = Selectedsex.getText().toString();
            }
        });

        Upload.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String Breed = IBreed.getText().toString();
                if(IAge.getText().toString().length()!=0){
                    Age = Integer.parseInt(IAge.getText().toString());
                }

                String Color= IColor.getText().toString();
                Database db = new Database(getApplicationContext(), "dogscenter",  null, 1);
                if(Breed.length() == 0 || Age == 0 || Color.length() == 0) {
                    Toast.makeText(getApplicationContext(), "Please fill all the details", Toast.LENGTH_SHORT).show();
                }
                else{
                    db.upload(Breed, Age, Color, Sex);
                    Toast.makeText(getApplicationContext(), "Dog's details were successfully uploaded!", Toast.LENGTH_SHORT).show();
                    startActivity(new Intent(UploadActivity.this, HomeActivity.class));
                }
            }
        });

    }
}