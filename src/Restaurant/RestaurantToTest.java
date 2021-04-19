package Restaurant;

import java.sql.SQLOutput;

public class RestaurantToTest {
    public static void main(String[] args) {
        Restaurant r1 = new Restaurant("Marianna", 150);
        System.out.println(r1.availableSeatsSoFar());
        r1.toSeatGuests(70);
        r1.removeParty(40);
        r1.restaurantSummary();
    }
}
