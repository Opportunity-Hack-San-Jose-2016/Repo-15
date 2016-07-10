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
import android.widget.TextView;

import org.json.JSONException;
import org.json.JSONObject;

import java.util.Calendar;

public class NewEventActivity extends AppCompatActivity   {

    private TextView date_text_view;
    private EditText time_start;
    private EditText time_end;
    private Button create_button;
    private EditText location_text;
    private String format = "";

    private int year;
    private int month;
    private int day;
    private int hour;
    private int min;

    private  JSONObject obj = new JSONObject();

    static final int DATE_PICKER_ID = 1111;
    static final int TIME_PICKER_ID = 2222;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new_event);
        getWindow().setSoftInputMode(WindowManager.LayoutParams.SOFT_INPUT_STATE_HIDDEN);

        date_text_view = (TextView) findViewById(R.id.date);
        location_text = (EditText)findViewById(R.id.location_text);
        create_button = (Button) findViewById(R.id.create_button);
        time_start = (EditText) findViewById(R.id.start_time);
        time_end = (EditText) findViewById(R.id.end_time);

        // Get current date by calender
        final Calendar c = Calendar.getInstance();
        year  = c.get(Calendar.YEAR);
        month = c.get(Calendar.MONTH);
        day   = c.get(Calendar.DAY_OF_MONTH);
        // get current time
        hour = c.get(Calendar.HOUR_OF_DAY);
        min = c.get(Calendar.MINUTE);

        date_text_view.setText(new StringBuilder()
                // Month is 0 based, just add 1
                .append(month + 1).append("-").append(day).append("-")
                .append(year).append(" "));

        showTime(hour,min);
        // Button listener to show date picker dialog

        date_text_view.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                // On button click show datepicker dialog
                showDialog(DATE_PICKER_ID);

            }

        });



        create_button.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View v)
            {
                System.out.println(obj);

                try {
                    obj.put("date",date_text_view.getText().toString());
                    obj.put("start_time",time_start.getText().toString());
                    obj.put("end_time",time_end.getText().toString());
                    obj.put("location",location_text.getText().toString());
                } catch (JSONException e) {
                    e.printStackTrace();
                }
                System.out.println(obj);
                Intent memberIntent = new Intent(NewEventActivity.this, EventListActivity.class);
                startActivity(memberIntent);

            }
        });

    }
    public void showTime(int hour, int min) {
        if (hour == 0) {
            hour += 12;
            format = "AM";
        }
        else if (hour == 12) {
            format = "PM";
        } else if (hour > 12) {
            hour -= 12;
            format = "PM";
        } else {
            format = "AM";
        }
        time_start.setText(new StringBuilder().append(hour).append(" : ").append(min)
                .append(" ").append(format));
        time_end.setText(new StringBuilder().append(hour+1).append(" : ").append(min)
                .append(" ").append(format));
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
