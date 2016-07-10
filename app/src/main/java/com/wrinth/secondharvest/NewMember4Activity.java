package com.wrinth.secondharvest;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;


public class NewMember4Activity extends AppCompatActivity {



    private Button done;
    public long totaluser;

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
                database.setPersistenceEnabled(true);
                DatabaseReference myRef = database.getReference();


                User user = new User("chun", "ha", "awerew", "awerew", "asdfasdfasd", "werwer", "werwer","werwer","werwer","werwer", "werwer");
                User user1 = new User("casdfhun", "ha", "awerew", "awerew", "asdfasdfasd", "werwer", "werwer","werwer","werwer","werwer", "werwer");
                User user2 = new User("chasdfdsafdsfsdafadsun", "ha", "awerew", "awerew", "asdfasdfasd", "werwer", "werwer","werwer","werwer","werwer", "werwer");
                User user3 = new User("chw4dgwdveun", "ha", "awerew", "awerew", "asdfasdfasd", "werwer", "werwer","werwer","werwer","werwer", "werwer");

                myRef.child("user_detail").child("0").setValue(user);
                myRef.child("user_detail").child("1").setValue(user1);
                myRef.child("user_detail").child("2").setValue(user2);
                myRef.child("user_detail").child("3").setValue(user3);
                myRef.child("user_detail").child("4").setValue(user);









                myRef.child("user_detail").addListenerForSingleValueEvent(
                        new ValueEventListener() {
                            @Override
                            public void onDataChange(DataSnapshot dataSnapshot) {



                                totaluser= dataSnapshot.getChildrenCount();
//                                System.out.println(totaluser);

                            }
                            @Override
                            public void onCancelled(DatabaseError databaseError) {
                            }
                        });









                myRef.child("user_detail").addListenerForSingleValueEvent(
                        new ValueEventListener() {
                            @Override
                            public void onDataChange(DataSnapshot dataSnapshot) {
//                                // Get user value
//                                User user2 = dataSnapshot.getValue(User.class);
//                                System.out.println(user2.firstName);
//
//                                // ...

                                for (DataSnapshot postSnapshot : dataSnapshot.getChildren()) {
                                    //Getting the data from snapshot
                                    User person = postSnapshot.getValue(User.class);

                                    //Adding it to a string
                                    String string = "Name: "+person.firstName;
                                    System.out.println(string);
                                    //Displaying it on textview
                                    //textViewPersons.setText(string);
                                }
                            }

                            @Override
                            public void onCancelled(DatabaseError databaseError) {
                            }
                        });



//
                Intent memberIntent = new Intent(NewMember4Activity.this, MemberListActivity.class);
                startActivity(memberIntent);





            }
        });
    }
}
