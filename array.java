class array {
    public static void main(String[] args) {
System.out.println(palin(11111));
    }

    public static boolean palin(int number) {
       
        if (number == reverse(number)) {
            return true;

        }
        return false;

    }

    public static int reverse(int number) {
        int result = 0;
        while (number != 0) {
            result = result * 10 + number % 10;
            number = number / 10;
        }
        return number < 0 ? -result : result;
    }

}
