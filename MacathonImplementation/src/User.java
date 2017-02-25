import java.util.Date;

/**
 * Created by DucLe on 2/25/17.
 */
public class User {
    private String destination;
    private String origin;
    private Date dateAndTime;
    private double price;
    private int numberOfSeat;

    public User(String destination, String origin, Date dateAndTime, double price, int numberOfSeat) {
        this.destination = destination;
        this.origin = origin;
        this.dateAndTime = dateAndTime;
        this.price = price;
        this.numberOfSeat = numberOfSeat;
    }

    public String getDestination(){
        return (this.destination);
    }

    public String getOrigin(){
        return (this.origin);
    }

    public Date getDateAndTime(){
        return (this.dateAndTime);
    }

    public double getPrice(){
        return (this.price);
    }

    public int getNumberOfSeat(){
        return (this.numberOfSeat);
    }
}
