package com.wrinth.secondharvest;

import android.content.Context;
import android.content.Intent;
import android.media.AudioManager;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class MemberListActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_member_list);


        final ArrayList<Member> memberArray = new ArrayList<Member>();
        memberArray.add(new Member("2","Tom Han", "M", "San Jose", 1234567890));
        memberArray.add(new Member("12", "Jerry Queen", "M", "Santa Clara", 1234567891));
        memberArray.add(new Member("13", "John Whi", "M", "San Jose", 1234567890));
        memberArray.add(new Member("16", "Jerry Queen", "M", "Santa Clara", 1234567891));

        MemberAdapter itemAdapter =
                new MemberAdapter(this, memberArray);

        ListView listView = (ListView) findViewById(R.id.membersListView);

        listView.setAdapter(itemAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                Member member = memberArray.get(position);
                String memberID = member.getMemberID();

                // Create a new intent to open the {@link EventsInfoActivity}
                Intent memberInfoIntent = new Intent(MemberListActivity.this, MemberInfoActivity.class);

                memberInfoIntent.putExtra("memberID", memberID);

                // Start the MemberInfoActivity
                startActivity(memberInfoIntent);

            }
        });
    }
}
