package Animals;

public class Cat extends Animal{


    public Cat(String name, int age) {
        super(name, age);

    }


    @Override
    public String getInfo() {
        return "CatID: " + id + ", Name: " + name + ", Age: " + age;
    }

    @Override
    public void speak() {
        System.out.println(name + " says: Meow!");
    }

}
