import java.util.Objects;

/**
 * Created by DucLe on 2/25/17.
 */
public class Matcher {
    private User driver;
    private User passenger;
    private int score;

    public Matcher(User driver, User passenger){
        this.driver = driver;
        this.passenger = passenger;
        this.score = calculateScore();
    }

    public int getScore(){
        return(this.score);
    }

    private int calculateScore(){
        score = 0;
        String driverLocation = driver.getDestination().toLowerCase();
        String passengerLocation = passenger.getDestination().toLowerCase();
        if (Objects.equals(passengerLocation, driverLocation)) {
            score += 100; //matching destination is most important
            if (driver.getNumberOfSeat() < passenger.getNumberOfSeat()){
                score -= 70;
            }
            long driverTime = driver.getDateAndTime().getTime();
            long passengerTime = passenger.getDateAndTime().getTime();
            if (driverTime == passengerTime) {
                score += 100;
            } else if (Math.abs(driverTime - passengerTime) <= 900000) {
                //if time difference is 15 minutes or less, penalize based on time difference
                score -= Math.abs(driverTime - passengerTime) * 0.00005;
            } else {
                score -= 60;
            }
        }
        return (score);
    }
}
