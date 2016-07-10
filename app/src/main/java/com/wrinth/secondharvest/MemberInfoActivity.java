package com.wrinth.secondharvest;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class MemberInfoActivity extends AppCompatActivity {

    String memberID;

    private Button edit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_member_info);

//        Bundle extraMemberID = getIntent().getExtras();
//        if (extraMemberID == null) {
//            memberID = "0";
//        }
//        memberID = extraMemberID.getString("eventID");

//        FirebaseDatabase database = FirebaseDatabase.getInstance();
//        DatabaseReference myRef = database.getReference();
//
//        myRef.setValue("Hello, World!asdfasdfasdfasdfasdfsadfsdfdsf");

        edit = (Button) findViewById(R.id.edit);

        edit.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View v)
            {
                Intent memberIntent = new Intent(MemberInfoActivity.this, MemberInfoUpdateActivity.class);
                startActivity(memberIntent);
            }
        });

    }
}
