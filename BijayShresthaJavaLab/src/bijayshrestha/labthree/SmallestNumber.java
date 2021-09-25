package bijayshrestha.labthree;

/**
 * WAP containing method to find the smallest number among three numbers.
 */
public class SmallestNumber {

    public static int smallestNumber(int x, int y, int z) {
        if (x < y) {
            if (x < z) {
                return x;
            } else {
                return z;
            }
        } else {
            if (y < z) {
                return y;
            } else {
                return z;
            }
        }
    }

    public static void main(String[] args) {
        int a = 161, b = 222, c = 50;
        System.out.println("The smallest is " + smallestNumber(a, b, c));
    }
}
