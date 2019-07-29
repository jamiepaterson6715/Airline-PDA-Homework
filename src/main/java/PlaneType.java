public enum PlaneType {

    BOING737(2,100);

    private int capacity;
    private int weight;


//    Constructor
    PlaneType(int capacity, int weight) {
        this.capacity = capacity;
        this.weight = weight;
    }
//    Getter
    public int capacity() {

        return this.capacity = capacity;
    }
//    Getter
    public int weight() {
        return this.weight = weight;
    }

}
