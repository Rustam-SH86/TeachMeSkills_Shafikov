
import CreditCard.CreditCard;

import java.util.Arrays;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {

        int[] arr = new int[]{1,2,3};

        try {
            System.out.println("access for third element " + arr[5]);

        } catch (ArrayIndexOutOfBoundsException d){
            System.out.println("Error: " + d);

        }
        finally {
            System.out.println("access for third element " + arr[2]);
        }


    }
}