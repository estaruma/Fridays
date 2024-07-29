public class RomanNumerals {
    public static String romanNumerals (int num) {

        if (num > 10 || num < 1) {
            throw new IllegalArgumentException("Number out of range (1-10)");
        }

        if (num == 10) {
            return "X";
        }
        if (num == 9) {
            return "IX";
        }
        if (num == 8) {
            return "VIII";
        }
        if (num == 7) {
            return "VII";
        }
        if (num == 6) {
            return "VI";
        }

        if (num == 5) {
            return "V";
        }

        if (num == 4) {
            return "IV";
        }

        // string builder
        StringBuilder result = new StringBuilder();

        while (num >= 1) {
            result.append("I");
            num -= 1;
        }
        return result.toString();
    }
}
