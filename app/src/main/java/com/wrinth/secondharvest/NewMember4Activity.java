package com.wrinth.secondharvest;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;






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
                FirebaseDatabase database = FirebaseDatabase.getInstance();
                DatabaseReference myRef = database.getReference();


                User user = new User("chun", "ha", "awerew", "awerew", "asdfasdfasd", "werwer", "werwer","werwer","werwer","werwer", "werwer");


                myRef.child("user_detail").setValue(user);


                Intent memberIntent = new Intent(NewMember4Activity.this, MemberActivity.class);
                startActivity(memberIntent);





            }
        });
    }
}
