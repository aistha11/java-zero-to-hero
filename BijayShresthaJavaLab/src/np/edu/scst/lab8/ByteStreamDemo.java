/*
 * WAP to read a file named “lab-read.txt” using a byte stream.
 */
package np.edu.scst.lab8;
import java.io.*;
public class ByteStreamDemo {
    public static void main(String[] args) throws FileNotFoundException, IOException {
        FileInputStream fis = new FileInputStream("lab-read.txt");
        int i = 0;
        while ((i = fis.read()) != -1) {
            System.out.print((char) i);
        }
        fis.close();
    }
}
