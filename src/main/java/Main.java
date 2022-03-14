// Задача Использование JUnit
// Конвертор номера телефона

public class Main {

    static final String ru = "Абонент из России";
    static final String notRu = "Абонент не из России";

    public static void main(String[] args) {

        String text1 = "8950";
        String text2 = "9001234";

        String resultContact = text1.concat(text2);
        System.out.println("Полученный номер: " + resultContact);
        System.out.println(checkingTheCountry(resultContact));

        if (correctNumber(resultContact)) {
            String numberPhone = convertNumberContactRU(resultContact);
            System.out.println("Конвертированный номер: " + numberPhone);
        } else {
            System.out.println("Номер не корректный!");
        }
    }

    public static String checkingTheCountry(String txt) {
        char[] arr = txt.toCharArray();
        if (arr[0] == '8') {
            return ru;
        } else {
            return notRu;
        }
    }

    public static boolean correctNumber(String txt) {
        return txt.length() == 11;
    }

    public static String convertNumberContactRU(String str) {
        StringBuilder newNumber = new StringBuilder();
        String codeCountryRU = "+7";
        String result;
        char[] arr = str.toCharArray();
        if (arr[0] == '8') {
            newNumber.append(codeCountryRU);
            for (int i = 1; i < arr.length; i++) {
                if (i == 1) {
                    newNumber.append("(");
                }
                if (i == 4) {
                    newNumber.append(")");
                }
                if (i == 7 || i == 9) {
                    newNumber.append("-");
                }
                newNumber.append(arr[i]);
            }
        }
        return result = newNumber.toString();
    }
}