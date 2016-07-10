package com.wrinth.secondharvest;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.TextView;

import org.json.JSONException;
import org.json.JSONObject;

public class NewMember3Activity extends AppCompatActivity {

    private Button next;
    private JSONObject obj;

    private EditText adult_view;
    private EditText child_view;
    private TextView total_view;

    private RadioGroup rec_calFresh_FoodStamps;
    private RadioGroup apply_calFresh_FoodStamps;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new_member3);
        getWindow().setSoftInputMode(WindowManager.LayoutParams.SOFT_INPUT_STATE_HIDDEN);

        Bundle extraEventID = getIntent().getExtras();
        if (extraEventID == null) {
            obj = null;
        }
        try {
            obj = new JSONObject(extraEventID.getString("obj"));
        } catch (JSONException e) {
            e.printStackTrace();
        }

        next = (Button) findViewById(R.id.next);

        next.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View v)
            {
                Intent memberIntent = new Intent(NewMember3Activity.this, NewMember4Activity.class);
                startActivity(memberIntent);
            }
        });
    }
}
