package Animals;

public class Fish extends Animal{
    public Fish(String name, int age) {
        super(name, age);
    }

    @Override
    public String getInfo() {
        return "FishID: " + id + ", Name: " + name + ", Age: " + age;
    }

    public void swim() {
        System.out.println(name + " is swimming.");
    }
}
