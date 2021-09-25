/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package np.edu.scst.constructorsinlevels;

/**
 *
 * @author dell
 */
public class Child extends Parent{

    public Child() {
        //super();
        System.out.println("This is child constructor");
    }
    
    public Child(int a){
        System.out.println("A is " + a);
    }
    
    public static void main(String[] args) {
        Child c = new Child(5);
    }
    
}
