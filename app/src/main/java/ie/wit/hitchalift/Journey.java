package ie.wit.hitchalift;

/**
 * Created by clausyd on 08/02/18.
 */

public class Journey {
    String email;
    String startCounty;
    String finishCounty;
    String date;


    public Journey(String emailIn, String startCountyIn, String finishCountyIn, String dateIn){

        email = emailIn;
        startCounty = startCountyIn;
        finishCounty = finishCountyIn;
        date = dateIn;
    }
}
