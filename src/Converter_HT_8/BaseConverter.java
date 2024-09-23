package Converter_HT_8;

import java.util.Scanner;

import static Converter_HT_8.Type.*;

public class BaseConverter {

    public double convert(double value, Type from, Type to) {

        double celsius = 0;

        switch (from){
            case KELVIN -> {
                celsius = value - 273.15;
            }
            case FAHRENHEIT -> {
                celsius = (value - 32) / 1.8;
            }
            case CELSIUS -> {
                celsius = value;
            }

        }


        switch (to) {
            case KELVIN -> {
                return celsius + 273.15;
            }
            case FAHRENHEIT -> {
                return celsius * 1.8 + 32;
            }
            case CELSIUS -> {
                return celsius;
            }
        }

        return celsius;
    }



}