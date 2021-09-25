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
public class Child2 extends Parent{
    int propertyC2 = 10000;
    public static void main(String[] args) {
        Child2 c2 = new Child2();
        System.out.println(c2.propertyC2);
        System.out.println(c2.propertyP);
    }
}
