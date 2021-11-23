/**
 * WAP containing method to find the smallest number among three numbers.
 */
package np.edu.scst.lab3;

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
        System.out.println();
        System.out.println("The smallest between " + a + " ," + b + " and " + c + " is " + smallestNumber(a, b, c));
    }
}
