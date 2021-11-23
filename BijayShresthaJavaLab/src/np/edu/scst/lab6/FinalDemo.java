/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package np.edu.scst.lab6;
class Car {
    final String color = "Black";
    final void run(){
        System.out.println("Car is Running.");
    }
}
final class Maruti extends Car {
    void printColor() {
        System.out.println(color);
    }
}
public class FinalDemo {
    public static void main(String[] args) {
        Maruti obj = new Maruti();
        obj.printColor();
        obj.run();
    }
}
