package Animals;

public class Parrot extends Animal{
    private int flightHeight;
    private String color;

    public Parrot(String name, int age, int flightHeight, String color) {
        super(name, age);
        this.flightHeight = flightHeight;
        this.color = color;
    }

    @Override
    public String getInfo() {
        return "ParrotID: " + id + ", Name: " + name + ", Age: " + age + ", Flight Height: " + flightHeight + " meters, Feather Color: " + color;
    }

    public void fly() {
        System.out.println(name + " is flying at a height of " + flightHeight + " meters.");
    }

    @Override
    public void speak() {
        System.out.println(name + " says: My name is Kesha!");
    }
}
