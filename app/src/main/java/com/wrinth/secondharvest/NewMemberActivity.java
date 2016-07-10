package com.wrinth.secondharvest;

import android.app.DatePickerDialog;
import android.app.Dialog;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

import org.json.JSONException;
import org.json.JSONObject;

import java.util.Calendar;

public class NewMemberActivity extends AppCompatActivity{

    private String first_name;
    private String middle_name;
    private String last_name;
    private String gender;
    private int day;
    private int month;
    private int year;
    private String language;

    private EditText first_name_text_view;
    private EditText middle_name_text_view;
    private EditText last_name_text_view;
    private RadioButton gender_radio;
    private TextView date_text_view;
    private EditText language_text_view;

    private RadioGroup gender_group;

    static final int DATE_PICKER_ID = 1111;

//    private
    private Button next;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new_member);
        getWindow().setSoftInputMode(WindowManager.LayoutParams.SOFT_INPUT_STATE_HIDDEN);

        first_name_text_view = (EditText) findViewById(R.id.first_name);
        middle_name_text_view = (EditText) findViewById(R.id.middle_name);
        last_name_text_view = (EditText) findViewById(R.id.last_name);
        date_text_view = (TextView) findViewById(R.id.date_view);
        gender_group = (RadioGroup) findViewById(R.id.gender_radio_group);

        language_text_view = (EditText) findViewById(R.id.lang_text);

        // Get current date by calender
        final Calendar c = Calendar.getInstance();
        year  = c.get(Calendar.YEAR);
        month = c.get(Calendar.MONTH);
        day   = c.get(Calendar.DAY_OF_MONTH);
        // Show current date

        date_text_view.setText(new StringBuilder()
                // Month is 0 based, just add 1
                .append("xx").append("-").append("xx").append("-")
                .append("xx").append(" "));

        // Button listener to show date picker dialog

        date_text_view.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                // On button click show datepicker dialog
                showDialog(DATE_PICKER_ID);

            }

        });


        next = (Button) findViewById(R.id.next);

        next.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View v)
            {
                JSONObject obj = new JSONObject();

                try {
                    obj.put("first_name",first_name_text_view.getText().toString());
                    obj.put("middle_name",middle_name_text_view.getText().toString());
                    obj.put("last_name",last_name_text_view.getText().toString());
                    obj.put("dob",date_text_view.getText().toString());
                    obj.put("language",language_text_view.getText().toString());

                } catch (JSONException e) {
                    e.printStackTrace();
                }


                gender_radio = (RadioButton) findViewById(gender_group.getCheckedRadioButtonId());

                if (gender_radio.getText().equals("Male")){
                    try {
                        obj.put("gender","male");
                    } catch (JSONException e) {
                        e.printStackTrace();
                    }
                }
                else{
                    try {
                        obj.put("gender","female");
                    } catch (JSONException e) {
                        e.printStackTrace();
                    }
                }

                System.out.println(obj);
                Intent memberIntent = new Intent(NewMemberActivity.this, NewMember2Activity.class);
                memberIntent.putExtra("obj", obj.toString());
                startActivity(memberIntent);
            }
        });


    }


    @Override
    protected Dialog onCreateDialog(int id) {
        switch (id) {
            case DATE_PICKER_ID:

                // open datepicker dialog.
                // set date picker for current date
                // add pickerListener listner to date picker
                return new DatePickerDialog(this, pickerListener, year, month,day);
        }
        return null;
    }

    private DatePickerDialog.OnDateSetListener pickerListener = new DatePickerDialog.OnDateSetListener() {

        // when dialog box is closed, below method will be called.
        @Override
        public void onDateSet(DatePicker view, int selectedYear,
                              int selectedMonth, int selectedDay) {

            year  = selectedYear;
            month = selectedMonth;
            day   = selectedDay;

            // Show selected date
            date_text_view.setText(new StringBuilder().append(month + 1)
                    .append("-").append(day).append("-").append(year)
                    .append(" "));

        }
    };
}
