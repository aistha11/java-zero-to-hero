/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package np.edu.scst.lab5;
class A{
    public void funcA(){
        System.out.println("A class");
    }
}
class B extends A{
    public void funcB(){
        System.out.println("B class");
    }
}
class C extends B{
    public void funcC(){
        System.out.println("C class");
    }
}
public class MultilevelInheritance {
    public static void main(String[] args) {
        C obj = new C();
        obj.funcA();
        obj.funcB();
        obj.funcC();
    }
}
