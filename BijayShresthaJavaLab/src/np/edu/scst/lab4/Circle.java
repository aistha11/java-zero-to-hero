/*
    WAP that creates a class circle with instance variables for the centre and the radius. 
    Initialize and display its variables
 */
package np.edu.scst.lab4;

public class Circle {

    double x, y, radius;

    public static void main(String[] args) {
        Circle circle = new Circle();
        circle.x = 8;
        circle.y = 9;
        circle.radius = 11;
        System.out.println("Center (x,y): (" + circle.x + "," + circle.y + ")");
        System.out.println("Radius: " + circle.radius);
    }
}
