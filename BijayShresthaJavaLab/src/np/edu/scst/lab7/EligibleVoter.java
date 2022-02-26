/*
 WAP to check whether a person is eligible to vote or not. If the person is not of age, throw an exception with the message “You cannot vote.”
 */
package np.edu.scst.lab7;
public class EligibleVoter {

    public static boolean checkVote(int age) {

        return age < 18;
    }

    public static void main(String[] args) {
        try {
            if (checkVote(12)) {
                throw new Exception("You cannot vote");
            } else {
                System.out.println("Fine!! You can vote");
            }
        } catch (Exception e) {
            System.out.println(e.toString());
        }
    }
}
