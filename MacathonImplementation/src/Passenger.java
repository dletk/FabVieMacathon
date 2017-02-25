import java.util.Date;

/**
 * Created by DucLe on 2/25/17.
 */
public class Passenger extends User {

    public Passenger(String destination, String origin, Date dateAndTime, double price, int numberOfSeat) {
        super(destination, origin, dateAndTime, price, numberOfSeat);
    }

}
