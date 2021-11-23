/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package np.edu.scst.lab4;

/**
 *
 * @author dell
 */
public class ModifiedCircle {
    double x, y, radius;

    public ModifiedCircle(double x, double y, double radius) {
        this.x = x;
        this.y = y;
        this.radius = radius;
    }

    public static void main(String[] args) {
        ModifiedCircle circle = new ModifiedCircle(8,9,11);
        System.out.println("Center (x,y): (" + circle.x + "," + circle.y + ")");
        System.out.println("Radius: " + circle.radius);
    }
}
