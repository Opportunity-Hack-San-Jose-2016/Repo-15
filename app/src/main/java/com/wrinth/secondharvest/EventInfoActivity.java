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


    Button statisics;
    Button notification;
    Button checkin;
    String eventID;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_event_info);

//        Bundle extraEventID = getIntent().getExtras();
//        if (extraEventID == null) {
//            eventID = "0";
//        }
//        eventID = extraEventID.getString("eventID");

        statisics = (Button) findViewById(R.id.statistic_button);
        notification = (Button) findViewById(R.id.remainder_button);
        checkin = (Button) findViewById(R.id.check_in_button);


//        FirebaseDatabase database = FirebaseDatabase.getInstance();
//        DatabaseReference myRef = database.getReference();
//
//        myRef.setValue("Hello, World!asdfasdfasdfasdfasdfsadfsdfdsf");
        statisics.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the Events List Button is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link EventsListActivity}
                Intent memberIntent = new Intent(EventInfoActivity.this, StatisticsActivity.class);
                // Start the EventsListActivity
                startActivity(memberIntent);
            }
        });

    }
}
