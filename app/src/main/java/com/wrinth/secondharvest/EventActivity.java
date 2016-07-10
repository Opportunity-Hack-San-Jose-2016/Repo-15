package com.wrinth.secondharvest;


import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class EventActivity extends AppCompatActivity {





    private Button newEventButton, eventListButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_event);

        newEventButton = (Button) findViewById(R.id.new_event_button);
        // Set a click listener on that View
        newEventButton.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the New Event Button is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link NewEventActivity}
                Intent newEventIntent = new Intent(EventActivity.this, NewEventActivity.class);

                // Start the NewEEventActivity
                startActivity(newEventIntent);
            }
        });

        eventListButton = (Button) findViewById(R.id.events_list_button);
        // Set a click listener on that View
        eventListButton.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the Events List Button is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link EventsListActivity}
                Intent eventListIntent = new Intent(EventActivity.this, EventListActivity.class);

                // Start the EventsListActivity
                startActivity(eventListIntent);
            }
        });
    }
}
