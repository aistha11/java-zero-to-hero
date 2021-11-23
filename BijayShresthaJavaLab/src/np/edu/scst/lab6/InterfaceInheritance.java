/*
Interface Inheritance
 */
package np.edu.scst.lab6;
interface Ia{
    public void func1();
    public void func2();
}
interface Ib{
    public void func3();
    public void func4();
}
interface Ic extends Ia,Ib{
    public void func5();
}
public class InterfaceInheritance implements Ic{
    @Override
    public void func5() {
        System.out.println("Function 5");
    }
    @Override
    public void func1() {
         System.out.println("Function 1");
    }
    @Override
    public void func2() {
         System.out.println("Function 2");
    }
    @Override
    public void func3() {
         System.out.println("Function 3");
    }
    @Override
    public void func4() {
         System.out.println("Function 4");
    }
    public static void main(String[] args) {
        InterfaceInheritance obj = new InterfaceInheritance();
        obj.func1();
        obj.func2();
        obj.func3();
        obj.func4();
        obj.func5();
    }
}
