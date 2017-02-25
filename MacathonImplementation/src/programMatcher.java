import java.util.Date;

/**
 * Created by DucLe on 2/25/17.
 */
public class programMatcher {

    public static void main(String[] args) {
        Driver driver1 = new Driver("Walmart", "Macalester College", new Date(1000000), 5, 2);
        Driver driver2 = new Driver("University of Minnesota", "Macalester College", new Date(1000000), 10, 1);
        Passenger passenger1 = new Passenger("Walmart", "Macalester College", new Date(1000000), 3, 1);
        Passenger passenger2 = new Passenger("Downtown", "Macalester College", new Date(1000000), 8, 2);

        Matcher matcher = new Matcher(driver1, passenger1);

        System.out.println(matcher.getScore());

    }

}
