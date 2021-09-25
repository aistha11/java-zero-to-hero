package bijayshrestha.labthree;

/**
 * WAP containing a method to display the middle character of a String.
 */
public class MiddleCharOfString {

    public static void middleChar(String str) {
        int pos;

        if (str.length() % 2 == 0) {
            pos = str.length() / 2 - 1;
        } else {
            pos = str.length() / 2;
        }
        System.out.println("The middle character of " + str + " is "
                + str.charAt(pos));
    }

    public static void main(String[] args) {
        String name = "Bijay";
        middleChar(name);
    }
}
