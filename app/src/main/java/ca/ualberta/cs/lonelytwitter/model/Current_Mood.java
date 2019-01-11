package ca.ualberta.cs.lonelytwitter.model;

import java.util.Date;

public abstract class Current_Mood {
    public abstract Date getdate();
    public abstract void setdate(Date inputDate);
    public abstract String return_mood();

}

