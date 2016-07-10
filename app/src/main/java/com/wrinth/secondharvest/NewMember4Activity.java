package com.wrinth.secondharvest;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;

public class NewMember4Activity extends AppCompatActivity {

    private Button done;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new_member4);
        getWindow().setSoftInputMode(WindowManager.LayoutParams.SOFT_INPUT_STATE_HIDDEN);

        done = (Button) findViewById(R.id.done);

        done.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View v)
            {
                Intent memberIntent = new Intent(NewMember4Activity.this, MemberListActivity.class);
                startActivity(memberIntent);
            }
        });
    }
}
