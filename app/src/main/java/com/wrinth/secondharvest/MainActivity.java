package com.wrinth.secondharvest;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button eventButton, memberButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        eventButton = (Button) findViewById(R.id.event_button);
        // Set a click listener on that View
        eventButton.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the New Event Button is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link NewEventActivity}
                Intent eventIntent = new Intent(MainActivity.this, EventListActivity.class);

                // Start the NewEEventActivity
                startActivity(eventIntent);
            }
        });

        memberButton = (Button) findViewById(R.id.member_button);
        // Set a click listener on that View
        memberButton.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the Events List Button is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link EventsListActivity}
                Intent memberIntent = new Intent(MainActivity.this, MemberListActivity.class);

                // Start the EventsListActivity
                startActivity(memberIntent);
            }
        });


    }
}
