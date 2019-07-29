public class Plane {

    /*Class?Emum type? is an instance?*/

    private PlaneType type;

    public Plane(PlaneType type) {
        this.type = type;
    }


    public int findCapacity() {
        return this.type.capacity();
    }

    public int findWeight() {
        return this.type.weight();
    }

}
