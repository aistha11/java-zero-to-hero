/**
 *WAP to print 10 numbers using a while loop
 */

package np.edu.scst.lab1;


public class WhileLoop {
    public static void main(String[] args) {
        int i = 0;
        int[] num = {1,3,5,7,9,11,13,15,17,19,21,23};
        while(i<10){
            System.out.println(num[i]);
            i++;
        }
    }
}
