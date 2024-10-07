package HomeTask12;

import java.util.HashSet;

public class DocuDeduplication {
    private HashSet<String> documentNumbers;

    public DocuDeduplication() {
        documentNumbers = new HashSet<>();
    }
    public void addDocument(String docNum) {
        if (!documentNumbers.contains(docNum)) {
            documentNumbers.add(docNum);
        }
    }

    public void printValidationReport() {
        System.out.println("Информация по введенным документам: ");
        for (String docNum : documentNumbers) {
            String validationMessage = DocuValidator.validateDocument(docNum);
            System.out.println(docNum + " - " + validationMessage);
        }
    }
}
