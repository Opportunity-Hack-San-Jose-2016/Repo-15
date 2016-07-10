package com.wrinth.secondharvest;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class MemberActivity extends AppCompatActivity {

    private Button newMemberButton, memberListButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_member);

        newMemberButton = (Button) findViewById(R.id.new_event_button);
        // Set a click listener on that View
        newMemberButton.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the New Event Button is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link NewEventActivity}
                Intent newMemberIntent = new Intent(MemberActivity.this, NewMemberActivity.class);

                // Start the NewMemberActivity
                startActivity(newMemberIntent);
            }
        });

        memberListButton = (Button) findViewById(R.id.events_list_button);
        // Set a click listener on that View
        memberListButton.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the Events List Button is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link EventsListActivity}
                Intent memberListIntent = new Intent(MemberActivity.this, MemberListActivity.class);

                // Start the MemberListActivity
                startActivity(memberListIntent);
            }
        });

    }
}
