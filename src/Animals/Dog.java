package Animals;

class Dog extends Animal {
    private String ownerName;

    public Dog(String name, int age, String ownerName) {
        super(name,age);
        this.ownerName = ownerName;
    }

    @Override
    public String getInfo() {
        return "DogID: " + id + ", Name: " +name + ", Age: " + age + ", Owner: " + ownerName;
    }

    @Override
    public void speak() {
        System.out.println(name + " says: Gav Gav!");
    }

    public void walk() {
        System.out.println(name + " is walking with " + ownerName + ".");
    }
}