package com.wrinth.secondharvest;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class EventInfoActivity extends AppCompatActivity {

    private Button eventRemainderButton, eventStatisticButton, eventCheckInButton;
    String eventID;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_event_info);

        eventRemainderButton = (Button) findViewById(R.id.remainder_button);
        // Set a click listener on that View
        eventRemainderButton.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the New Event Button is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link EventNotificationActivity}
                Intent eventIntent = new Intent(EventInfoActivity.this, EventNotificationActivity.class);

                // Start the EventNotificationActivity
                startActivity(eventIntent);
            }
        });

        eventStatisticButton = (Button) findViewById(R.id.statistic_button);
        // Set a click listener on that View
        eventStatisticButton.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the New Event Button is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link EventStatisticActivity}
                Intent eventIntent = new Intent(EventInfoActivity.this, EventStatisticActivity.class);

                // Start the EventStatisticActivity
                startActivity(eventIntent);
            }
        });

        eventCheckInButton = (Button) findViewById(R.id.check_in_button);
        // Set a click listener on that View
        eventCheckInButton.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the New Event Button is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link EventCheckInActivity}
                Intent eventIntent = new Intent(EventInfoActivity.this, EventCheckInActivity.class);

                // Start the EventCheckInActivity
                startActivity(eventIntent);
            }
        });

        Bundle extraEventID = getIntent().getExtras();
        if (extraEventID == null) {
            eventID = "0";
        }
        eventID = extraEventID.getString("eventID");

//        FirebaseDatabase database = FirebaseDatabase.getInstance();
//        DatabaseReference myRef = database.getReference();
//
//        myRef.setValue("Hello, World!asdfasdfasdfasdfasdfsadfsdfdsf");

    }
}
