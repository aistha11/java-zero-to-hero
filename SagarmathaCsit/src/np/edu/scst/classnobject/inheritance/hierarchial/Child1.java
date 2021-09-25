/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package np.edu.scst.classnobject.inheritance.hierarchial;

/**
 *
 * @author dell
 */
public class Child1 extends Parent {
    int propertyC1 = 1000;
    public static void main(String[] args) {
        Child1 c1 = new Child1();
        System.out.println(c1.propertyC1);
        System.out.println(c1.propertyP);
    }
}
