package org.example.taskmanager;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.ArrayList;

public class AddNotes<T extends Schedule> implements Serializable {

    private ArrayList<T> schedals;

    public AddNotes() {
        this.schedals = new ArrayList<>();
    }

    public ArrayList<T> getSchedals() {
        return schedals;
    }
    public void showShedules() {
        int i = 1;
        for(Schedule sch : schedals) {
            System.out.println("\n№\t " + i + " " + sch);
            i++;
        }
    }

    public void addSchedule(T schedule) {
        this.schedals.add(schedule);
    }
    public void removeSchedule(T schedule) {
        this.schedals.remove(schedule);
    }

    public void changeNotes(T schedule, String notes) {
        schedule.setNotes(notes);
    }
    public void changePriority(T schedule, Priority priority) {
        schedule.setPriority(priority);
    }
    public void changeDeadline(T schedule, LocalDateTime deadline) {
        schedule.setDeadLine(deadline); // "yyyy.MM.dd G 'at' HH:mm:ss z"
    }
    public void changeDateStart(T schedule, LocalDateTime startTime) {
        schedule.setStartTime(startTime);
    }

}
