package bijayshrestha.labthree;

/**
 * WAP containing method to calculate the area of a rectangle; The calculated
 * area should be returned as a double data-type.
 */
public class AreaOfRectangle {

    public static double areaOfRectangle(double l, double b) {
        return l * b;
    }

    public static void main(String[] args) {
        double length = 12.6, bredth = 8.3;
        System.out.println("The area of rectangle is "
                + areaOfRectangle(length, bredth)
        );
    }
}
