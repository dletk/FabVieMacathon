import java.util.Date;

/**
 * Created by DucLe on 2/25/17.
 */
public class User {
    public String destination;
    public String origin;
    public Date dateAndTime;
    public double price;
    public int numberOfSeat;

    public User(String destination, String origin, Date dateAndTime, double price, int numberOfSeat) {
        this.destination = destination;
        this.origin = origin;
        this.dateAndTime = dateAndTime;
        this.price = price;
        this.numberOfSeat = numberOfSeat;
    }
}
