package com.wrinth.secondharvest;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class EventCheckInActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_event_check_in);


        final ArrayList<Member> memberArray = new ArrayList<Member>();
        memberArray.add(new Member("2","Tom Han", "M", "San Jose", 1234567890));
        memberArray.add(new Member("12", "Jerry Queen", "M", "Santa Clara", 1234567891));
        memberArray.add(new Member("13", "John Whi", "M", "San Jose", 1234567890));
        memberArray.add(new Member("16", "Jerry Queen", "M", "Santa Clara", 1234567891));

        MemberAdapter itemAdapter =
                new MemberAdapter(this, memberArray);

        ListView listView = (ListView) findViewById(R.id.eventCheckInView);

        listView.setAdapter(itemAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                Member member = memberArray.get(position);
                String memberID = member.getMemberID();

                Toast.makeText(EventCheckInActivity.this, "User Checked!", Toast.LENGTH_LONG).show();

            }
        });
    }

}
