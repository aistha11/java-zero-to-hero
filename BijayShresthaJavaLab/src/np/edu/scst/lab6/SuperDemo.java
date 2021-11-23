/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package np.edu.scst.lab6;
class Animal {
    String color = "white";
    void eat() {
        System.out.println("Animal is eating");
    }
}
class Cat extends Animal {
    String color = "black";
    void printColor() {
        System.out.println("Cat Color: "+color);
        System.out.println("Animal Color: "+super.color);
    }
    @Override
    void eat() {
        System.out.println("Cat is eating");
        super.eat();
    }
}
public class SuperDemo {
    public static void main(String[] args) {
        Cat obj = new Cat();
        obj.printColor();
        obj.eat();
    }
}
