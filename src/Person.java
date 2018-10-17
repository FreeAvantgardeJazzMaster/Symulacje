public class Person {
    public boolean isGoing() {
        return isGoing;
    }

    public void setGoing(boolean going) {
        isGoing = going;
    }

    public int getHotelID() {
        return hotelID;
    }

    public void setHotelID(int hotelID) {
        this.hotelID = hotelID;
    }

    private boolean isGoing;
    private int hotelID;

    public Person(boolean isGoing, int hotelID ){
        setGoing(isGoing);
        setHotelID(hotelID);
    }
}
