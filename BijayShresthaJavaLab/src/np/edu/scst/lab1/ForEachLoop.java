/**
 * Create a one dimensional float array of size 10, 
 * fill it with values from 1 to 10 using a for loop. 
 * Now print the array using enhanced for loop (for each loop).
 */

package np.edu.scst.lab1;

public class ForEachLoop {
    public static void main(String[] args) {
        float degrees[] = new float[10];
        for(int i=0;i<degrees.length;i++){
            degrees[i] = (float)Math.random() * 10;
        }
        for(float degree : degrees){
            System.out.println(degree);
        }
    }
}
