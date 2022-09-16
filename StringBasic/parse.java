public class parse {
    public static void main(String[] args) {
        System.out.println(stringToInt("-1"));
        System.out.println(intToString(123));

    }

    public static int stringToInt(String s) {
        int result = 0;
        for (int i = s.charAt(0) == '-' ? 1 : 0; i < s.length(); ++i) {
            int digit = s.charAt(i) - '0';// this use to deletn the vaue of '0 in asscii''0'value is 48 than
            result = result * 10 + digit;
        }

        return s.charAt(0) == '-' ? -result : result;
    }

    public static String intToString(int x) {
        boolean isNegative = false;
        if (x < 0) {
            isNegative = true;
        }

        StringBuilder s = new StringBuilder();
        do {
            s.append((char) ('0' + Math.abs(x % 10)));
            x /= 10;
        } while (x != 0);
        if (isNegative) {
            s.append('-'); // Adds the negative sign back .

            s.reverse();
        }
        return s.toString();
    }

}