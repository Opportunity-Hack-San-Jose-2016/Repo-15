package com.wrinth.secondharvest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MemberInfoActivity extends AppCompatActivity {

    String memberID;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_member_info);

        Bundle extraMemberID = getIntent().getExtras();
        if (extraMemberID == null) {
            memberID = "0";
        }
        memberID = extraMemberID.getString("eventID");
    }
}
