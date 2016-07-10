package com.wrinth.secondharvest;

/**
 * Created by JohnL on 7/9/2016.
 */
public class Member {
    /** Name for the member */
    private String mMemberName;

    /** Gender for the member */
    private String mMemberGender;

    /** City for the member */
    private String mMemberCity;

    /** Phone number of member */
    private int mMemberPhoneNumber;

    /**
     * Create a new Event object.
     *
     * @param memberName is the name for the member
     * @param memberGender is the gender for the member
     * @param memberCity is the city for the member
     * @param memberPhoneNumber is the phone number of member
     */
    public Member(String memberName, String memberGender, String memberCity, int memberPhoneNumber) {
        mMemberName = memberName;
        mMemberGender = memberGender;
        mMemberCity = memberCity;
        mMemberPhoneNumber = memberPhoneNumber;
    }

    /**
     * Get the name for the member.
     */
    public String getMemberName() {
        return mMemberName;
    }

    /**
     * Get the gender for the member.
     */
    public String getMemberGender() {
        return mMemberGender;
    }

    /**
     * Get the city for the member
     */
    public String getMemberCity() { return mMemberCity; }

    /**
     * Get the phone number of member.
     */
    public int getMemberPhoneNumber() { return mMemberPhoneNumber; }
}
