package Phone_HT_8;

public class Phone {
    private String number;
    private String model;
    private double weight;


    public Phone(String number,String model,double weight){
        this(number, model);
        this.weight = weight;


    }

    public Phone(String number, String model) {
        this.number = number;
        this.model = model;
    }
    public Phone(){

    }
    public void receiveCall(String name){
        System.out.println(name + " is calling");
    }
    public void receiveCall(String name, String numberOfcaller) {
        System.out.println(name + "is calling " +  ", number: " + numberOfcaller);
    }



    public String getNumber() {
        return number;


    }


    public void sendMessage(String... numbers){
        System.out.println("The message was sent to numbers: ");
        for (String arr : numbers) {
            System.out.println(arr);
        }
    }
    public void printInfo() {
        System.out.println("Number: " + number + ", Model: " + model + ", Weight: " + weight);
    }




}
