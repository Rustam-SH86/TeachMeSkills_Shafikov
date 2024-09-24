package Animals;

public class Crow extends Bird implements canFly{


    public Crow(String name, int age, int maxFlightHeight) {
        super(name, age, maxFlightHeight);
    }

    @Override
    public void fly() {
        System.out.println(name + " is flying at a height of " + getMaxFlightHeight() + " meters.");

    }


    @Override
    public String getInfo() {
        return "CrowID: " + id + ", Name: " + name + ", Age: " + age + ", Max Flight Height: " + getMaxFlightHeight() + " meters";
    }



    @Override
    public void speak() {
        System.out.println(name + " says: Caw!");
    }



}
