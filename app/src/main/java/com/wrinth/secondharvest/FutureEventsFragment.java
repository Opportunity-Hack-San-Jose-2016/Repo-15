package com.wrinth.secondharvest;

import android.content.Context;
import android.media.AudioManager;
import android.media.MediaPlayer;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class FutureEventsFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.activity_future_events, container, false);

        final ArrayList<Event> futureEventArray = new ArrayList<Event>();
        futureEventArray.add(new Event("Family Harvest", "07/09/2016", "San Jose", 62));

        EventAdapter itemAdapter =
                new EventAdapter(getActivity(), futureEventArray);

        ListView listView = (ListView) rootView.findViewById(R.id.futureEventsView);

        listView.setAdapter(itemAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {


            }
        });

        return rootView;
    }
}
