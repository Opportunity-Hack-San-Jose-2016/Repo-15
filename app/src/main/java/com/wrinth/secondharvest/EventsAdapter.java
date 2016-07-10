package com.wrinth.secondharvest;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

/**
 * Created by JohnL on 7/9/2016.
 */
public class EventsAdapter extends FragmentPagerAdapter  {

    /** Context of the app */
    private Context mContext;

    /**
     * Create a new {@link EventsAdapter} object.
     *
     * @param fm is the fragment manager that will keep each fragment's state in the adapter
     *           across swipes.
     */
    public EventsAdapter(Context context, FragmentManager fm) {
        super(fm);
        mContext = context;
    }

    /**
     * Return the {@link Fragment} that should be displayed for the given page number.
     */
    @Override
    public Fragment getItem(int position) {
        if (position == 0) {
            return new PastEventsFragment();
        } else if (position == 1) {
            return new TodayEventsFragment();
        } else {
            return new FutureEventsFragment();
        }
    }

    @Override
    public CharSequence getPageTitle(int position) {
        if (position == 0) {
            return mContext.getString(R.string.past_events_list);
        } else if (position == 1) {
            return mContext.getString(R.string.today_events_list);
        } else {
            return mContext.getString(R.string.future_events_list);
        }
    }

    /**
     * Return the total number of pages.
     */
    @Override
    public int getCount() {
        return 3;
    }
}
