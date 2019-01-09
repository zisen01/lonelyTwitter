package ca.ualberta.cs.lonelytwitter.model;

import java.util.Date;

public abstract class Mood {
    private Date mood_date;
    private char mood;

    mood() {
        this.mood_date = 0
        this.mood = 0
    }

    public Date getMood_date() {
        return mood_date;
    }

    public void setMood_date(Date mood_date) {
        this.mood_date = mood_date;
    }

}
