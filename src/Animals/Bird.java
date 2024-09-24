package Animals;

public abstract class Bird extends Animal{
    private int maxFlightHeight;

    public Bird(String name, int age, int maxFlightHeight) {
        super(name, age);
        this.maxFlightHeight = maxFlightHeight;
    }

    public int getMaxFlightHeight() {
        return maxFlightHeight;
    }





}
