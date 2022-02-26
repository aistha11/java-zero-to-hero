/*
 * WAP to create an object of a Mobile class. Now serialize this object and save it in "Serialize.ser" file.
 */
package np.edu.scst.lab8;
import java.io.*;

class Mobile implements Serializable {

    String name, model;
    int SSN;
}

public class SerializeObjectDemo {
    public static void main(String[] args) {
        Mobile m = new Mobile();
        m.name = "Samsung";
        m.model = "S-series";
        m.SSN = 9;
        try {
            FileOutputStream fileOut
                    = new FileOutputStream("Serialize.ser");
            ObjectOutputStream out = new ObjectOutputStream(fileOut);
            out.writeObject(m);
            out.close();
            fileOut.close();
            System.out.printf("Serialized data is saved.");
        } catch (IOException i) {
            i.printStackTrace();
        }
    }
}
