package com.wrinth.secondharvest;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;

public class MemberInfoUpdateActivity extends AppCompatActivity {

    private Button update;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_member_info_update);
        getWindow().setSoftInputMode(WindowManager.LayoutParams.SOFT_INPUT_STATE_HIDDEN);

        update = (Button) findViewById(R.id.update);

        update.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View v)
            {
                Intent memberIntent = new Intent(MemberInfoUpdateActivity.this, MemberInfoActivity.class);
                startActivity(memberIntent);
            }
        });
    }
}
