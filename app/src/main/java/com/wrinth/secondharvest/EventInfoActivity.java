package com.wrinth.secondharvest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

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

        FirebaseDatabase database = FirebaseDatabase.getInstance();
        DatabaseReference myRef = database.getReference();

        myRef.setValue("Hello, World!asdfasdfasdfasdfasdfsadfsdfdsf");

    }
}
