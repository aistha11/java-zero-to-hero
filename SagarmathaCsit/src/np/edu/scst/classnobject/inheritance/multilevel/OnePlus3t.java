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
public class OnePlus3t extends OnePlus{

    public OnePlus3t() {
        System.out.println("Model: Oneplus 3t");
    }
    
    public void ram(){
        System.out.println("Ram: 6/8 GB");
    }
    
    public static void main(String[] args) {
        OnePlus3t mob = new OnePlus3t();
        mob.technology();
        mob.brand();
        mob.ram();
    }
    
}
