
/**
 * WAP to compute the area of a circle with radius r.
 */

package np.edu.scst.lab2;


public class AreaCircle {

    public static float circleArea(float r) {
        final float PI = 3.14f;
        return PI * r * r;
    }

    public static void main(String[] args) {
        float radius = 5f;
        System.out.println("The area of circle with radius " + radius + " is " + circleArea(radius));
    }
}
