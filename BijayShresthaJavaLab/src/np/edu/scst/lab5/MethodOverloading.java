/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package np.edu.scst.lab5;

public class MethodOverloading {

    public static int Area(int l) {
        return l * l;
    }

    public static int Area(int l, int b) {
        return l * b;
    }

    public static void main(String[] args) {
        System.out.println("Area of Square with length 5 is " + Area(5));
        System.out.println("Area of Rectangle with length 5 and breadth 7 is " + Area(5,7));
    }
}
