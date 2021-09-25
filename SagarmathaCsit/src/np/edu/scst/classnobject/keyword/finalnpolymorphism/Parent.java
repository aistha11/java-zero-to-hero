/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package np.edu.scst.classnobject.keyword.finalnpolymorphism;

/**
 *
 * @author dell
 */
public class Parent {

    public double area(double r) {
        return Math.PI * r * r;
    }

    public double area(double l, double b) {
        return l * b;
    }
    public static void main(String[] args) {
        Parent p = new Parent();
        System.out.println(p.area(7.0));
        System.out.println(p.area(5.0,4));
    }
}
