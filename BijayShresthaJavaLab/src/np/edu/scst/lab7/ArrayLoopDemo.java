/*
 WAP to print the list of characters array using for loop. Handle the possible exceptions that may arise
 */
package np.edu.scst.lab7;

/**
 *
 * @author Dell
 */
public class ArrayLoopDemo {

    public static void main(String[] args) {
        String[] fruits = {"Apple", "Banana", "Grapes", "Cherry", "Mango", "Orange"};
        try {
            for (int i = 0; i < 10; i++) {
                System.out.println(fruits[i]);
            }
        }catch(Exception exp){
            System.out.println(exp.toString());
        }finally{
            System.out.println(" are the availabe fruits.");
        }
    }
}
