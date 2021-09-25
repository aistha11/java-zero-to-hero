package bijayshrestha.labone;

/**
 * WAP which checks whether a number (initialized by you) is prime or not.
 */
public class PrimeNumber {

    public static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }
        for (int i = 2; i <= n / 2; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int num = 17;
        if (isPrime(num)) {
            System.out.println("The number " + num + " is a Prime Number");
        } else {
            System.out.println("The number " + num + " is not a Prime Number");
        }
    }
}
