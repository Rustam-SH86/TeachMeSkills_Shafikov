package Animals;

abstract class Animal {
    private static int nextId = 1;
    protected int id;
    protected String name;
    protected int age;


    public Animal(String name, int age) {
        this.id = nextId++;
        this.name = name;
        this.age = age;
    }

    public void eat() {
        System.out.println(name + " is eating.");
    }

    public abstract String getInfo();

    public void speak() {
        System.out.println(name + " can't speak.");
    }

}
