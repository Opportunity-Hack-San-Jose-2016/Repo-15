package com.wrinth.secondharvest;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;

public class NewMemberActivity extends AppCompatActivity {

    private String first_name;
    private String middle_name;
    private String last_name;
    private String gender;
    private int dob_day;
    private int dob_month;
    private int dob_year;
    private int disability;
    private String ethnicity;
    private String language;

    private EditText first_name_text_view;
    private EditText middle_name_text_view;
    private EditText last_name_text_view;
    private RadioButton gender_radio;
    private TextView date_text_view;
    private Button next_button;
    private RadioButton ethinicity_radio;
    private RadioButton disability_radio;
    private EditText language_text_view;

//    private
    private Button next;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new_member);
        getWindow().setSoftInputMode(WindowManager.LayoutParams.SOFT_INPUT_STATE_HIDDEN);

//        first_name_text_view = (EditText) findViewById(R.id.first_name);
//        middle_name_text_view = (EditText) findViewById(R.id.middle_name);
//        last_name_text_view = (EditText) findViewById(R.id.last_name);
//        language_text_view = (EditText) findViewById(R.id.language);
//        gender_radio = (RadioButton) findViewById(R.id.gender_radio);
////        ethinicity_radio = (RadioButton) findViewById(R.id.);
//        disability_radio = (RadioButton) findViewById(R.id.gender_radio);

        next = (Button) findViewById(R.id.next);

        next.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View v)
            {
                Intent memberIntent = new Intent(NewMemberActivity.this, NewMember2Activity.class);
                startActivity(memberIntent);
            }
        });


    }
}
