public class problem {
    public static void main(String[] args) {
   
        System.out.println(convertBase("1", 3, 10));
    }public static String convertBase(String numAsString , int bl, int b2) {
        boolean isNegative = numAsString.startsWith("-");
        int numAsInt = 0;
        for (int i = (isNegative ? 1 : 0); i < numAsString.length(); ++i) {
        numAsInt *= bl ;
        numAsInt += Character.isDigit(numAsString.charAt(i))
        ? numAsString .charAt(i) -'0'
        : numAsString .charAt(i) - 'A' + 10;
        }
        return (isNegative ?"0" : "")
        + (numAsInt == 0 ? "®" : constructFromBase(numAsInt , b2));
        }
        private static String constructFromBase(int numAsInt, int base) {
        return numAsInt == 0
        ? ""
        
        : constructFromBase(numAsInt / base, base)
        + (char)(numAsInt % base >= 10 ? 'A' + numAsInt % base - 10
        : 'A' + numAsInt % base);
        }
}
