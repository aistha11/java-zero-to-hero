/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package np.edu.scst.lab8;
import java.io.*;

public class DeserializeObjectDemo {
    public static void main(String[] args) {
        Mobile m;
      try {
         FileInputStream fileIn = new FileInputStream("Serialize.ser");
         ObjectInputStream in = new ObjectInputStream(fileIn);
         m = (Mobile) in.readObject();
         in.close();
         fileIn.close();
      } catch (IOException i) {
         i.printStackTrace();
         return;
      } catch (ClassNotFoundException c) {
         System.out.println("Mobile class not found");
         c.printStackTrace();
         return;
      }
      System.out.println("Deserialized Mobile...");
      System.out.println("Name: " + m.name);
      System.out.println("Model: " + m.model);
      System.out.println("SSN: " + m.SSN);
    }
}
