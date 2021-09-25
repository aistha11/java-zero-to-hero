/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package np.edu.scst.abstraction;

/**
 *
 * @author dell
 */
public class ChildOfInterface implements InterfaceName{

    @Override
    public void method2() {
        System.out.println("Method 1");
    }

    @Override
    public void method1() {
        System.out.println("Method 2");
    }
    
}
