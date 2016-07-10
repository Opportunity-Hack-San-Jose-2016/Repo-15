package com.wrinth.secondharvest;

import android.app.Activity;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by JohnL on 7/9/2016.
 */
public class EventAdapter extends ArrayAdapter<Event> {

    public EventAdapter(Activity context, ArrayList<Event> event) {
        super(context, 0, event);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        final Event currentEvent = getItem(position);

        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.event_list_item, parent, false);
        }

        TextView eventNameTextView = (TextView) listItemView.findViewById(R.id.event_name);
        eventNameTextView.setText(currentEvent.getEventName());

        TextView eventDateTextView = (TextView) listItemView.findViewById(R.id.event_date);
        eventDateTextView.setText(currentEvent.getEventDate());

        TextView eventLocationTextView = (TextView) listItemView.findViewById(R.id.event_location);
        eventLocationTextView.setText(currentEvent.getEventLocation());

        TextView eventAttendanceTextView = (TextView) listItemView.findViewById(R.id.event_attendance);
        eventAttendanceTextView.setText(Integer.toString(currentEvent.getAttendance()));

        return listItemView;

    }
}
