package HomeTask12;

public class DocuValidator {
    static String validateDocument(String docNum) {
        String trimmedDocNum = docNum.trim();

        if (trimmedDocNum.contains(" ")) {
            return " Введенный номер не валиден так как содержит пробелы ";
        }
        if (trimmedDocNum.length() != 15) {
            return "Введенный номер не валиден, длина должна быть 15 символов ";
        }
        if (!trimmedDocNum.startsWith("docnum")) {
            return "Введенный номер не валиден, должен начинаться с 'docnum' ";
        }
        return "Этот номер валиден ";
    }
}
