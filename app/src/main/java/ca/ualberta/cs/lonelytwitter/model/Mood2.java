package ca.ualberta.cs.lonelytwitter.model;

import java.util.Date;

public class Mood2 extends Current_Mood {
    private Date mdate;
    Mood2(){
        this.mdate = new Date();
    }
    Mood2(Date inputDate){
        this.mdate = inputDate;
    }

    @Override
    public Date getdate() {
        return this.mdate;
    }

    @Override
    public void setdate(Date inputDate) {
        this.mdate = inputDate;
    }
    @Override
    public String return_mood() {
        //Todo: are we just simply returning the class name?
        return this.getClass().getSimpleName();
    }

}
