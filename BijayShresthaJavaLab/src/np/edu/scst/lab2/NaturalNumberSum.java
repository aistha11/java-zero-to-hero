
/**
 * WAP to display n terms of natural numbers and their sum.
 */

package np.edu.scst.lab2;

public class NaturalNumberSum {

    public static void main(String[] args) {
        int n = 8, sum = 0;
        System.out.println("The first " + n + " natural numbers are ");
        for (int i = 1; i <= n; i++) {
            System.out.println(i);
            sum += i;
        }
        System.out.println("The sum is " + sum);
    }
}
