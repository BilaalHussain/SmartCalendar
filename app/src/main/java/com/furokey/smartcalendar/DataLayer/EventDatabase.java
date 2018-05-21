package com.furokey.smartcalendar.DataLayer;

import android.os.Build;
import android.support.annotation.RequiresApi;

import com.furokey.smartcalendar.LogicLayer.CalendarEntry;

import java.time.LocalDateTime;
import java.util.ArrayList;

public class EventDatabase {

    private static ArrayList<CalendarEntry> mainDB = new ArrayList<CalendarEntry>();



    private void addEvent(CalendarEntry entryToAdd) {
        mainDB.add(entryToAdd);
    }

    public static void populateDB(){

    }

    @RequiresApi(api = Build.VERSION_CODES.O)
    public  CalendarEntry returnFirstEventAtTime(LocalDateTime currentTime){
        for (CalendarEntry event : mainDB) {
            if (event.getStartDateTime().isBefore(currentTime) & event.getEndDateTime().isAfter(currentTime)) {
                return event;
            }

        }
        return null;
    }
}
