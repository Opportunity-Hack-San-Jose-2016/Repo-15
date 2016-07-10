package com.wrinth.secondharvest;

import android.app.Activity;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by JohnL on 7/9/2016.
 */
public class MemberAdapter extends ArrayAdapter<Member> {

    public MemberAdapter(Activity context, ArrayList<Member> word) {
        super(context, 0, word);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        final Member currentMember = getItem(position);

        View listItemView = convertView;
        if(listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.member_list_item, parent, false);
        }

        TextView memberNameTextView = (TextView) listItemView.findViewById(R.id.user_name);
        memberNameTextView.setText(currentMember.getMemberName());

        TextView memberGenderTextView = (TextView) listItemView.findViewById(R.id.user_gender);
        memberGenderTextView.setText(currentMember.getMemberGender());

        TextView memberAddressTextView = (TextView) listItemView.findViewById(R.id.user_address);
        memberAddressTextView.setText(currentMember.getMemberCity());

        TextView memberPhoneNumberTextView = (TextView) listItemView.findViewById(R.id.user_phone_number);
        memberPhoneNumberTextView.setText(Integer.toString(currentMember.getMemberPhoneNumber()));

        return listItemView;
    }

}
