/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package np.edu.scst.classnobject.inheritance.multilevel;

/**
 *
 * @author dell
 */
public class GrandChild extends Child{
    int propertyG = 1000;
    public static void main(String[] args) {
        GrandChild gc = new GrandChild();
        System.out.println(gc.propertyG);
        System.out.println(gc.propertyC);
        System.out.println(gc.propertyP);
    }
}
