package com.furokey.smartcalendar.LogicLayer;


import android.location.Location;

public class CalendarEvent extends CalendarEntry {

    private Location eventLocation;

    public Location getEventLocation() {
        return eventLocation;
    }

    public void setEventLocation(Location eventLocation) {
        this.eventLocation = eventLocation;
    }


}
