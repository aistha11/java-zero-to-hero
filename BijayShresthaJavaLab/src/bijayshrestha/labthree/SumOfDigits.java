package bijayshrestha.labthree;

/**
 * WAP containing method to compute the sum of the digits in an integer.
 */
public class SumOfDigits {

    public static int getSumOfDigits(int n) {
        int sum;
        for (sum = 0; n != 0; n /= 10) {
            sum += n % 10;
        }
        return sum;
    }

    public static void main(String[] args) {
        int num = 12398;
        System.out.println("The sum of digits in " + num + " is " + getSumOfDigits(num));
    }
}
