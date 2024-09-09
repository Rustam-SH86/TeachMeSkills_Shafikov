import java.util.Arrays;
import java.util.Random;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.println("Hello and welcome!");
        Random random = new Random();
        int[] array = new int[7];
        int[] arr = new int[10];
        double[][] multiArr;
        multiArr = new double[][]{{2, 3}, {3, 3}};

        for (int i = 0;  i < array.length; i++) {
            array[i] = random.nextInt(15,50);
        }System.out.println(Arrays.toString(array) + Arrays.toString(arr) + " " + Arrays.deepToString(multiArr) );
    }
}