package ca.ualberta.cs.lonelytwitter.model;


import java.util.Date;

public class Mood1 extends Current_Mood {

    Mood1(){
        super.setdate(new Date());
    }
    Mood1(Date inputDate){
        super.setdate(inputDate);
    }


    @Override
    public String return_mood() {
        return this.getClass().getSimpleName();
    }

}
