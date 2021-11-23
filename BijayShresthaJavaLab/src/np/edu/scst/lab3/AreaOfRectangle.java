/**
 * WAP containing method to calculate the area of a rectangle; The calculated
 * area should be returned as a double data-type.
 */
package np.edu.scst.lab3;

public class AreaOfRectangle {

    public static double areaOfRectangle(double l, double b) {
        return l * b;
    }

    public static void main(String[] args) {
        double length = 12.6, bredth = 8.3;
        System.out.println("The area of rectangle with " + length + " and " + bredth + " is "
                + areaOfRectangle(length, bredth)
        );
    }
}
