package ca.ualberta.cs.lonelytwitter.model;

import java.util.Date;

public class Mood2 extends Current_Mood {

    Mood2(){
        super.setdate(new Date());
    }
    Mood2(Date inputDate){
        super.setdate(inputDate);
    }


    @Override
    public String return_mood() {
        return this.getClass().getSimpleName();
    }

}
