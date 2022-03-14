import org.junit.jupiter.api.Assertions;

public class Test {

    final String text1 = "8";
    final String text2 = "9001112233";
    final String expected = "89001112233";
    final String expectedCountryRU = "+7(900)111-22-33";
    final String ru = "Абонент из России";
    final String notRu = "Абонент не из России";


    @org.junit.jupiter.api.Test
    public void testConcat() {
        final String result = text1.concat(text2);

        Assertions.assertEquals(expected, result);
   }

    @org.junit.jupiter.api.Test
    public void testcheckingTheCountry() {
        String russia = Main.checkingTheCountry(expected);

        Assertions.assertEquals(ru, russia);
    }

    @org.junit.jupiter.api.Test
    public void testcheckingTheCountryNotRu() {
        String notRussia = Main.checkingTheCountry(text2);

        Assertions.assertEquals(notRu, notRussia);
    }

    @org.junit.jupiter.api.Test
    public void testCorrectConcatCountry() {
        String resultCorrectCountry = Main.convertNumberContactRU(expected);

        Assertions.assertEquals(expectedCountryRU, resultCorrectCountry);
    }

    @org.junit.jupiter.api.Test
    public void testCorrectConcatLenght() {
        boolean trueLenghtContact = Main.correctNumber(expected);

        Assertions.assertTrue(trueLenghtContact);
    }
}