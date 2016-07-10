package com.wrinth.secondharvest;

import android.content.Intent;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class PastEventsFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.activity_past_events, container, false);

        final ArrayList<Event> pastEventArray = new ArrayList<Event>();
        pastEventArray.add(new Event("12", "Family Harvest", "06/09/2016", "Santa Clara", 62));
        pastEventArray.add(new Event("13", "Family Harvest", "05/13/2016", "San Jose", 62));
        pastEventArray.add(new Event("16", "Family Harvest", "04/17/2016", "San Jose", 82));
        pastEventArray.add(new Event("20", "Senior Harvest", "04/02/2016", "San Jose", 122));

        EventAdapter itemAdapter =
                new EventAdapter(getActivity(), pastEventArray);

        ListView listView = (ListView) rootView.findViewById(R.id.pastEventsView);

        listView.setAdapter(itemAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                Event event = pastEventArray.get(position);
                String eventID = event.getEventID();

                // Create a new intent to open the {@link EventsInfoActivity}
                Intent eventInfoIntent = new Intent(getActivity(), EventInfoActivity.class);

                eventInfoIntent.putExtra("eventID", eventID);

                // Start the EventsInfoActivity
                startActivity(eventInfoIntent);

            }
        });

        return rootView;
    }
}
