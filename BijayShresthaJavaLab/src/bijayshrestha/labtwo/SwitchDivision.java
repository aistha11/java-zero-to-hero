package bijayshrestha.labtwo;

/**
 * WAP using switch-case to tell the student’s division based on his/her marks.
 */
public class SwitchDivision {

    public static String checkDivision(int result) {
        if (result > 100) {
            return "Marks should be from 0 to 100";
        }
        switch (result / 10) {
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
        int result = 39;
        System.out.println(checkDivision(result));
    }
}
