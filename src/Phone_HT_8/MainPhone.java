package Phone_HT_8;

public class MainPhone {
    public static void main(String[] args) {
        Phone firstPhone = new Phone("3-41-13","IPhone",110);
        Phone secondePhone = new Phone("3-41-13","Nokia");
        Phone thirdPhone = new Phone();

        firstPhone.printInfo();
        secondePhone.printInfo();
        thirdPhone.printInfo();

        firstPhone.receiveCall("Michael");
        System.out.println("phone number is: " + firstPhone.getNumber());

        secondePhone.receiveCall("Alex", "456-789-1230");
        System.out.println("phone number is: " + secondePhone.getNumber());

        thirdPhone.sendMessage("123", "321", "456");



    }
}
