package ca.ualberta.cs.lonelytwitter.model;

import java.util.Date;

public abstract class Current_Mood {
    private Date mdate;
    public Date getdate() {
        return this.mdate;
    }
    public void setdate(Date inputDate) {
        this.mdate = inputDate;
    }
    public abstract String return_mood();

}
