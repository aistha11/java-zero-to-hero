/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package np.edu.scst.lab6;
public class Triangle extends Shape {
    @Override
    public void area() {
        System.out.println("Area of Trianle is (base * height)/2");
    }
    public static void main(String[] args) {
        Triangle triangle = new Triangle();
        triangle.area();
        triangle.display();
    }
}
