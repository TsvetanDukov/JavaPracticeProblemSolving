public class IsPrimeNumber {
    public static void main(String[] args) {
        System.out.println(isNumberPrime(6));
    }

    /**
     * Check if number is prime or not.
     * @param number selected number.
     * @return true or false.
     */
    public static boolean isNumberPrime(int number) {
        if (number < 2) {
            return false;
        }
        if (number % 2 == 0) {
            return false;
        }
        return true;
    }
}
