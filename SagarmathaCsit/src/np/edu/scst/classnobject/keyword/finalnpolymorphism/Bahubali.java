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
public class Bahubali extends Shivagami{
    
    final int a = 3;
    final double d = 3.14;

    @Override
    public void gift() {
        System.out.println("Devsena");
        super.gift(); //To change body of generated methods, choose Tools | Templates.
    }
    
    final void katappa(){
        System.out.println("Katappa le bahubali ko kyu mara?");
    }
    
    public static void main(String[] args) {
        final int c;
        c=20;
        System.out.println(c);
        //c=25; //Throws an error
        Bahubali b = new Bahubali();
        b.gift();
        b.katappa();
    }
}


