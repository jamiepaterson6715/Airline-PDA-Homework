public class Passenger {


//    instance variable of class Passenger
    private String name;
    private int bags;
//
//    constructor cmd N
    public Passenger(String name, int bags) {
        this.name = name;
        this.bags =bags;

    }


//    getter
    public String findPassengerName() {
        return this.name;
    }


//    setter create new instance of variable
    public int findBags() {
        return this.bags;
    }
}
