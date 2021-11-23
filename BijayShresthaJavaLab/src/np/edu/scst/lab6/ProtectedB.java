/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package np.edu.scst.lab6;

public class ProtectedB extends ProtectedA{

    @Override
    protected void hello() {
        System.out.println("Hello form Protected B");
        super.hello(); //To change body of generated methods, choose Tools | Templates.
    }
    
    public static void main(String[] args) {
        ProtectedB obj = new ProtectedB();
        obj.hello();
    }
    
}
