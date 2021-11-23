/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package np.edu.scst.lab5;

class Parent {
    String eyeColor= "Black";
    int property = 1000000;
    
    public void msg(){
        System.out.println("Hello");
    }
}
class Child extends Parent {
    int property2 = 10000;
}
public class SimpleInheritance {
    public static void main(String[] args) {
        Child c = new Child();
        System.out.println(c.eyeColor);
        System.out.println(c.property);
        System.out.println(c.property2);
        c.msg();
        Parent p = new Parent();
        System.out.println(p.property);
    }
}
