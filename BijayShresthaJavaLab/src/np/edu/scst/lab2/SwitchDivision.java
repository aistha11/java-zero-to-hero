
/**
 * WAP using switch-case to tell the student’s division based on his/her marks.
 */

package np.edu.scst.lab2;


public class SwitchDivision {

    public static String checkDivision(int result, int noOfSub) {
        if (result > 500) {
            return "Marks should be from 0 to 100";
        }
        switch (result / (noOfSub*10)) {
            case 10:
            case 9:
            case 8:
                return "Distinction";
            case 7:
            case 6:
                return "First Division";
            case 5:
                return "Second Division";
            case 4:
                return "Third Division";
            default:
                return "Fail";
        }
    }

    public static void main(String[] args) {
        int result = 342, noOfSub = 5;
        System.out.println("Your got " + result + " in " + noOfSub + " of subject.");
        System.out.println("Your division is: " + checkDivision(result, noOfSub));
    }
}