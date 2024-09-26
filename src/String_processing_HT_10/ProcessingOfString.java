package String_processing_HT_10;

public class ProcessingOfString {

    public static void printFirstTwoBlocks(String documentNumber) {
        String[] blocks = documentNumber.split("-");
        System.out.println(blocks[0] + " " + blocks[2]);
    }

    public static void replaceLettersWithStars(String documentNumber) {
        String modifiedDocument = documentNumber.replaceAll("[a-zA-Z]{3}", "***");
        System.out.println(modifiedDocument);
    }

    public static void printLettersInLowerCase(String documentNumber) {
        String letters = documentNumber.replaceAll("[^a-zA-Z]", "").toLowerCase();
        String formattedLetters = letters.substring(0, 3) + "/" +
                letters.substring(3, 6) + "/" +
                letters.charAt(6) + "/" +
                letters.charAt(7);
        System.out.println(formattedLetters);
    }

    public static void printUpperCaseBuilder(String documentNumber) {
        String letters = documentNumber.replaceAll("[^a-zA-Z]", "").toUpperCase();
        StringBuilder sb = new StringBuilder("Letters:");
        sb.append(letters.substring(0, 3)).append("/")
                .append(letters.substring(3, 6)).append("/")
                .append(letters.charAt(6)).append("/")
                .append(letters.charAt(7));
        System.out.println(sb.toString());
    }


    public static void containsABC(String documentNumber) {
        if (documentNumber.toLowerCase().contains("abc")) {
            System.out.println("Документ содержит  'abc'.");
        } else {
            System.out.println("Документ не содержит  'abc'.");
        }
    }


    public static void startWith555(String documentNumber) {
        if (documentNumber.startsWith("555")) {
            System.out.println("Документ начинается с '555'.");
        } else {
            System.out.println("Документ не начинается с '555'.");
        }
    }

    public static void endWith1a2b(String documentNumber) {
        if (documentNumber.endsWith("1a2b")) {
            System.out.println("Документ заканчивается на '1a2b'.");
        } else {
            System.out.println("Документ не заканчивается на '1a2b'.");
        }
    }

}
