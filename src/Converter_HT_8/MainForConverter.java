package Converter_HT_8;

public class MainForConverter {
    public static void main(String[] args) {

        BaseConverter baseConverter = new BaseConverter();
        System.out.println("30°C в Кельвины это " + baseConverter.convert(35, Type.CELSIUS, Type.KELVIN) + "K");
        System.out.println("30°C в Фаренгейты это " + baseConverter.convert(35, Type.CELSIUS, Type.FAHRENHEIT) + "F");
        System.out.println("350K в Цельсий это " + baseConverter.convert(350, Type.KELVIN, Type.CELSIUS) + "C");
        System.out.println("80F в Цельсий это " + baseConverter.convert(80, Type.FAHRENHEIT, Type.CELSIUS) + "C");





    }
}
