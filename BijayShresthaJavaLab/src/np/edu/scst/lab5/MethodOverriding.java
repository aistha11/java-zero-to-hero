/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package np.edu.scst.lab5;

class Animal{
    public void eat(){
        System.out.println("Animal is eating");
    }
}

class Dog extends Animal{

    @Override
    public void eat() {
        System.out.println("Dog is eating");
        super.eat(); 
    }
    
}
public class MethodOverriding {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.eat();
    }
}
