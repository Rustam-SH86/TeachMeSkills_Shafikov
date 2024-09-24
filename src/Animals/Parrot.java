package Animals;

public class Parrot extends Bird implements canFly{
    private String color;

    public Parrot(String name, int age, int maxFlightHeight, String color) {
        super(name, age, maxFlightHeight);
        this.color = color;
    }

    @Override
    public String getInfo() {
        return "ParrotID: " + id + ", Name: " + name + ", Age: " + age + ", Flight Height: " + getMaxFlightHeight() + " meters, Feather Color: " + color;
    }

    @Override
    public void fly() {
        System.out.println(name + " is flying at a height of " + getMaxFlightHeight() + " meters.");

    }

    @Override
    public void speak() {
        System.out.println(name + " says: My name is Kesha!");
    }
}
