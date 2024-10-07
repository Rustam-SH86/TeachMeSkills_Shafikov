package HomeTask12;

import java.util.Scanner;

public class DocuValidation {

    public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            DocuDeduplication docManager = new DocuDeduplication();

            System.out.println("Введите номера документов и после введите цифру 0 для завершения ввода: ");

            while (true) {
                String input = scanner.nextLine();
                if (input.equals("0")) {
                    break;
                }
                docManager.addDocument(input);
            }
            docManager.printValidationReport();
        }
}
