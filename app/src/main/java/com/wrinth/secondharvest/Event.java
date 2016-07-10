package com.wrinth.secondharvest;

/**
 * Created by JohnL on 7/9/2016.
 */
public class Event {
    /** Name for the event */
    private String mEventName;

    /** Date for the event */
    private String mEventDate;

    /** Location for the event */
    private String mEventLocation;

    /** Number of people attend the event */
    private int mAttendance;

    /**
     * Create a new Event object.
     *
     * @param eventName is the name for the event
     * @param eventDate is the date for the event
     * @param eventLocation is the location for the event
     * @param attendance is the number of people attend the event
     */
    public Event(String eventName, String eventDate, String eventLocation, int attendance) {
        mEventName = eventName;
        mEventDate = eventDate;
        mEventLocation = eventLocation;
        mAttendance = attendance;
    }

    /**
     * Get the name for the event.
     */
    public String getEventName() {
        return mEventName;
    }

    /**
     * Get the date for the event.
     */
    public String getEventDate() {
        return mEventDate;
    }

    /**
     * Get the location for the event
     */
    public String getEventLocation() { return mEventLocation; }

    /**
     * Get the number of people attend the event.
     */
    public int getAttendance() { return mAttendance; }
}
