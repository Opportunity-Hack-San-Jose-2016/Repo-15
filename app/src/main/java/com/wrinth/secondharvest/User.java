package com.wrinth.secondharvest;

import com.google.firebase.database.IgnoreExtraProperties;

/**
 * Created by vm on 7/10/16.
 */


@IgnoreExtraProperties
public class User {

    public String firstName;
    public String middleName;
    public String lastName;
    public String email;
    public String gender;
    public String birthDate;
    public String disability;
    public String ethnicity;
    public String language;
    public String foodStamps;
    public String lastMonths;




    public User() {
        // Default constructor required for calls to DataSnapshot.getValue(User.class)
    }

    public User(String firstName, String middleName, String email ,String lastName, String gender, String birthDate, String disability, String ethnicity, String language, String foodStamps, String lastMonths ) {


        this.firstName = firstName;
        this.middleName = middleName;
        this.email = email;
        this.lastName = lastName;
        this.gender = gender;
        this.birthDate = birthDate;
        this.disability = disability;
        this.ethnicity = ethnicity;
        this.language = language;
        this.foodStamps = foodStamps;
        this.lastMonths = lastMonths;
    }

}

