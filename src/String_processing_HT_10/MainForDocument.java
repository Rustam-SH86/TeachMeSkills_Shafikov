package String_processing_HT_10;

import static String_processing_HT_10.ProcessingOfString.*;

public class MainForDocument {
    public static void main(String[] args) {
        String documentNumber = "1234-abc-5678-def-9a0b";
        System.out.println("Номер документа: " + documentNumber);

        printFirstTwoBlocks(documentNumber);
        replaceLettersWithStars(documentNumber);
        printLettersInLowerCase(documentNumber);
        printUpperCaseBuilder(documentNumber);
        containsABC(documentNumber);
        startWith555(documentNumber);
        endWith1a2b(documentNumber);
    }
}
