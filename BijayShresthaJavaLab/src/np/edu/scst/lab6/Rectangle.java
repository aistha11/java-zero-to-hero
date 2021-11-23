/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package np.edu.scst.lab6;
public class Rectangle extends Shape {
    @Override
    public void area() {
        System.out.println("Area of rectangle is length * breadth");
    }
    public static void main(String[] args) {
        Rectangle rect = new Rectangle();
        rect.area();
        rect.display();
    }
}
