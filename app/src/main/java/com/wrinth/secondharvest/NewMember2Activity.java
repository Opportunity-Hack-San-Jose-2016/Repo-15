package com.wrinth.secondharvest;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;

import org.json.JSONException;
import org.json.JSONObject;

public class NewMember2Activity extends AppCompatActivity {

    private Button next;

    private EditText add1_view;
    private EditText add2_view;
    private EditText city_view;
    private EditText state_view;
    private EditText country_view;
    private EditText zip_view;
    private EditText num_view;
    private EditText email_view;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new_member2);

        getWindow().setSoftInputMode(WindowManager.LayoutParams.SOFT_INPUT_STATE_HIDDEN);

        next = (Button) findViewById(R.id.next);
        add1_view = (EditText) findViewById(R.id.add1);
        add2_view = (EditText) findViewById(R.id.add2);
        city_view = (EditText) findViewById(R.id.city);
        state_view = (EditText) findViewById(R.id.state);
        country_view = (EditText) findViewById(R.id.country);
        zip_view = (EditText) findViewById(R.id.zip);
        num_view = (EditText) findViewById(R.id.num);
        email_view = (EditText) findViewById(R.id.email);

        next.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View v)
            {

                JSONObject obj = new JSONObject();

                try {
                    obj.put("add1",add1_view.getText().toString());
                    obj.put("add2",add2_view.getText().toString());
                    obj.put("city",city_view.getText().toString());
                    obj.put("state",state_view.getText().toString());
                    obj.put("country",country_view.getText().toString());
                    obj.put("zip",zip_view.getText().toString());
                    obj.put("num",num_view.getText().toString());
                    obj.put("email",email_view.getText().toString());

                } catch (JSONException e) {
                    e.printStackTrace();
                }

                System.out.println(obj);
                Intent memberIntent = new Intent(NewMember2Activity.this, NewMember3Activity.class);
                memberIntent.putExtra("obj", obj.toString());
                startActivity(memberIntent);

            }
        });
    }
}
