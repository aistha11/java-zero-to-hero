/*
 * WAP that shows passing an object as a parameter.
 */
package np.edu.scst.lab5;
public class ObjectAsParam {
    int a,b;
    public ObjectAsParam(int a, int b) {
        this.a = a;
        this.b = b;
    }
    public static int add(ObjectAsParam object){
        return object.a + object.b;
    }
    public static void main(String[] args) {
        ObjectAsParam obj = new ObjectAsParam(5,8);
        System.out.println("Result is: "+add(obj));
    }
}
