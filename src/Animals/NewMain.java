package Animals;

import java.util.Random;
public class NewMain {
    public static void main(String[] args) {

        Animal[] animals = new Animal[10];
        Random random = new Random();
        for (int i = 0; i < animals.length; i++) {
            int type = random.nextInt(5);
            switch (type) {
                case 0:
                    animals[i] = new Dog("Sharik " + i, random.nextInt(10), "Mark");
                    break;
                case 1:
                    animals[i] = new Cat("Murzik " + i, random.nextInt(10));
                    break;
                case 2:
                    animals[i] = new Crow("Karkusha " + i, random.nextInt(10), random.nextInt(100));
                    break;
                case 3:
                    animals[i] = new Fish("Bilbo " + i, random.nextInt(10));
                    break;
                case 4:
                    animals[i] = new Parrot("Kesha " + i, random.nextInt(10) , random.nextInt(50) + 1, "Yellow");
                    break;
            }
        }

        for (Animal animal : animals) {
            System.out.println(animal.getInfo());
            animal.eat();

            if (animal instanceof Dog dog) {
                dog.walk();
            }

            if (animal instanceof Fish fish) {
                fish.swim();
            }

            if (animal instanceof Crow crow) {
                crow.fly();
            }

            if (animal instanceof Parrot parrot) {
                parrot.fly();
            }

            animal.speak();
            System.out.println("------------");
        }
    }
}