package Restaurant;

public class Restaurant {
    private String name;
    private int maxGuestCapacity;
    private int currentGuestCount = 0;
    private int availableSeats;
    public Restaurant (String restaurantName, int capacity) {
        maxGuestCapacity = capacity;
        name = restaurantName;
    }
    public int availableSeatsSoFar () {
        availableSeats = maxGuestCapacity - currentGuestCount;
       return availableSeats;
    }


    public void toSeatGuests (int guestsNumber) {
        if (currentGuestCount + guestsNumber <= maxGuestCapacity) {
            if (availableSeats >= guestsNumber && guestsNumber > 0) {
             currentGuestCount = currentGuestCount +guestsNumber;
             availableSeats = maxGuestCapacity-currentGuestCount;
                System.out.println("You have seated " + guestsNumber + " guest(s).");
            } if(guestsNumber<=0){
                System.out.println("Please enter valid data.");
            }
        } else {
            System.out.println("You have only " + availableSeats + " available seats.");
        }
    }

    public void removeParty (int numOfGuestsThatIsLeft) {
        if (numOfGuestsThatIsLeft <= currentGuestCount && numOfGuestsThatIsLeft>0) {
            currentGuestCount = currentGuestCount - numOfGuestsThatIsLeft;
            availableSeats = maxGuestCapacity-currentGuestCount;
            System.out.println("You have successfully removed party of " +numOfGuestsThatIsLeft +" guests.");
        } else {
            System.out.println("Please enter valid data.");
        }
    }

    public void restaurantSummary() {
        System.out.println("\nName: "+name+
                "\nMax Capacity: "+ maxGuestCapacity+
                "\nCurrent guest count: "+ currentGuestCount+
                "\nAvailable seats: "+availableSeats);
    }
}
