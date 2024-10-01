package Office_and_Tea_HT_11;
import java.util.*;


public class MainForTeaOffice {

    public static void main(String[] args) {
        for (int day = 1; day <= 2; day++) {
            System.out.println("Day " + day + ":");
            WorkingDay workingDay = new WorkingDay();
            workingDay.simulateDay();
            System.out.println();

       }

    }
}
