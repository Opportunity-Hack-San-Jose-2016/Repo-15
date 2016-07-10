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

public class TodayEventsFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.activity_today_events, container, false);

        final ArrayList<Event> todayEventArray = new ArrayList<Event>();
        todayEventArray.add(new Event("34", "Family Harvest", "07/09/2016", "San Jose", 122));
        todayEventArray.add(new Event("12", "Senior Harvest", "07/09/2016", "San Jose", 72));

        EventAdapter itemAdapter =
                new EventAdapter(getActivity(), todayEventArray);

        ListView listView = (ListView) rootView.findViewById(R.id.todayEventsView);

        listView.setAdapter(itemAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                Event event = todayEventArray.get(position);
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
