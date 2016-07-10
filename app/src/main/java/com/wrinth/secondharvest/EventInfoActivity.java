package com.wrinth.secondharvest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class EventInfoActivity extends AppCompatActivity {

    String eventID;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_event_info);

        Bundle extraEventID = getIntent().getExtras();
        if (extraEventID == null) {
            eventID = "0";
        }
        eventID = extraEventID.getString("eventID");

    }
}
