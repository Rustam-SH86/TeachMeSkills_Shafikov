package Office_and_Tea_HT_11;

import java.util.ArrayList;
import java.util.List;

public class Employee {
    private final String name;
    private final int wishedTea;
    private final List<TeaType> consumedTea;

    public Employee(String name, int wishedTea) {
        this.name = name;
        this.wishedTea = wishedTea;
        this.consumedTea = new ArrayList<>();
    }


    public String getName() {
        return name;
    }

    public int getWishedTea() {
        return wishedTea;
    }
    public void drinkTea(TeaType tea){
        consumedTea.add(tea);
        System.out.println(name + " drank " + tea);
    }
    public List<TeaType> getTeasConsumed() {
        return consumedTea;
    }

    @Override

    public String toString() {
        return " today wanna to drink " + wishedTea ;
    }
}
