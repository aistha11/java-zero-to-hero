/*
 WAP to perform a division operation, with the handling of a possible exception that may arise
 */
package np.edu.scst.lab7;

/**
 *
 * @author Dell
 */
public class DivisionDemo {
    public static void main(String[] args) {
        int x=15,y=0;
        double z;
        try{
            z = x/y;
            System.out.println("The result is "+z);
        }catch(Exception e){
            System.out.println(e.toString());
        }  
    }
}
