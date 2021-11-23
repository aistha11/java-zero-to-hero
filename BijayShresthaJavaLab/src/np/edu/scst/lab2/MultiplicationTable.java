
/**
 * WAP to print a multiplication table upto 10 of any number.
 */

package np.edu.scst.lab2;

public class MultiplicationTable {

    public static void multiplicationTable(int n) {
        for (int i = 1; i <= 10; i++) {
            System.out.println(n + " * " + i + " = " + n * i);
        }
    }

    public static void main(String[] args) {
        int n = 7;
        multiplicationTable(n);
    }
}