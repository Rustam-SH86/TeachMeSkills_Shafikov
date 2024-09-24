package Animals;

import java.util.Random;
import java.util.Scanner;

public class NewMain {
    public static void main(String[] args) {
        Animal[] animals = new Animal[5];
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < animals.length; i++) {
            Type type = Type.values()[random.nextInt(Type.values().length)];

            switch (type) {
                case DOG:
                    animals[i] = new Dog("Sharik " + i, random.nextInt(10), "Mark");
                    break;
                case CAT:
                    animals[i] = new Cat("Murzik " + i, random.nextInt(10));
                    break;
                case CROW:
                    animals[i] = new Crow("Karkusha " + i, random.nextInt(10), random.nextInt(100));
                    break;
                case FISH:
                    animals[i] = new Fish("Bilbo " + i, random.nextInt(10));
                    break;
                case PARROT:
                    animals[i] = new Parrot("Kesha " + i, random.nextInt(10) , random.nextInt(50) , "Yellow");
                    break;
            }
        }

        boolean count = true;
        while (count) {

            for (int i = 0; i < animals.length; i++) {
                Animal animal = animals[i];
                System.out.println((i + 1) + ". " + animal.getInfo());
            }

            System.out.println("Choose an animal from 1 to 5: ");
            int choice = getValidNum(scanner);


            if (choice < 1 || choice > animals.length) {
                System.out.println("Incorrect choice, try again...");
                continue;
            }

            Animal selectedAnimal = animals[choice - 1];
            System.out.println("You chose: " + selectedAnimal.name);

            boolean actionComplete = false;
            while (!actionComplete) {
                printUserActions(selectedAnimal);
                String userActionInput = scanner.nextLine().toUpperCase();

                try {
                    UserAction action = UserAction.valueOf(userActionInput);

                    switch (action) {
                        case FEED -> {
                            selectedAnimal.eat();
                            actionComplete = true;
                        }
                        case SPEAK -> {
                            if (selectedAnimal instanceof Dog || selectedAnimal instanceof Cat || selectedAnimal instanceof Parrot || selectedAnimal instanceof Crow) {
                                selectedAnimal.speak();
                                actionComplete = true;
                            } else System.out.println("This animal cannot speek");


                        }
                        case WALK -> {
                            if (selectedAnimal instanceof Dog dog) {
                                dog.walk();
                                actionComplete = true;
                            } else {
                                System.out.println("This animal cannot walk ");
                            }
                        }
                        case SWIM -> {
                            if (selectedAnimal instanceof Fish fish) {
                                fish.swim();
                                actionComplete = true;
                            } else {
                                System.out.println("This animal cannot swim ");
                            }
                        }
                        case FLY -> {
                            if (selectedAnimal instanceof Crow crow) {
                                crow.fly();
                                actionComplete = true;
                            } else if (selectedAnimal instanceof Parrot parrot) {
                                parrot.fly();
                                actionComplete = true;
                            } else {
                                System.out.println("This Animal cant fly ");
                            }
                        }

                        }
                   }
                catch(IllegalArgumentException e){
                            System.out.println("Incorrect action^ try again ");
                 }

                        System.out.println("------------");
             }
        }

        scanner.close();
    }



    private static void printUserActions(Animal animal) {
        System.out.println("Choose action: ");
        System.out.println("FEED");


        if (animal instanceof Dog) {
            System.out.println("WALK");
        }
        if (animal instanceof Dog || animal instanceof Cat || animal instanceof Parrot || animal instanceof Crow){
            System.out.println("SPEAK");;
        }

            if (animal instanceof Fish) {
            System.out.println("SWIM");
        }
        if (animal instanceof Crow || animal instanceof Parrot) {
            System.out.println("FLY");
        }


    }

    private static int getValidNum(Scanner scanner) {
        int input;
        while (true) {
            try {
                System.out.print("Input a number: ");
                input = Integer.parseInt(scanner.nextLine());
                break;
            } catch (NumberFormatException e) {
                System.out.println("Incorrect input, please enter a number: ");
            }
        }
        return input;
    }
}