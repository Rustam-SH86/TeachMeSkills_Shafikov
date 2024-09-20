package Animals;

public class Crow extends Animal{
    private int maxFlightHeight;


    public Crow(String name, int age, int maxFlightHeight) {
        super(name, age);
        this.maxFlightHeight = maxFlightHeight;
    }

    @Override
    public String getInfo() {
        return "CrowID: " + id + ", Name: " + name + ", Age: " + age + ", Max Flight Height: " + maxFlightHeight + " meters";
    }

    public void fly() {
        System.out.println(name + " is flying at a height of " + maxFlightHeight + " meters.");
    }

    @Override
    public void speak() {
        System.out.println(name + " says: Caw!");
    }


}
