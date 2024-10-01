package Office_and_Tea_HT_11;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class WorkingDay {
    private final TeaBank teaBank;
    private final Map<String, Employee> employees;

    public WorkingDay() {
        teaBank = new TeaBank();
        employees = createEmployees();
    }
    private Map<String, Employee> createEmployees() {
        Map<String, Employee> employees = new HashMap<>();
        Random random = new Random();
        for (int i = 1; i <= 5; i++) {
            int wishedTea = random.nextInt(6);
            employees.put("Employee " + i, new Employee("Employee " + i, wishedTea));
        }
        System.out.println("Employee request for tea: " + employees);
        return employees;
    }

    public void simulateDay() {
        for (Employee employee : employees.values()) {
            for (int i = 0; i < employee.getWishedTea(); i++) {
                if (teaBank.hasTea()) {
                    employee.drinkTea(teaBank.getTea());
                } else {
                    System.out.println(employee.getName() + " wanted to drink tea, but there was no tea left ");
                    break;
                }
            }
        }


        System.out.println("End of the day:");
        for (Employee employee : employees.values()) {
            if (employee.getTeasConsumed().isEmpty()) {
                System.out.println(employee.getName() + " didn't drink ");
            } else {
                System.out.println(employee.getName() + " drink : " + employee.getTeasConsumed());
            }
        }

        System.out.println("Leftover of tea inside the tea bank: " + teaBank.teaRemaining());
    }
}
