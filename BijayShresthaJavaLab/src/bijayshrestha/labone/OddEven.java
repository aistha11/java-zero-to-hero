package bijayshrestha.labone;

/**
 * WAP which checks whether a number (initialized by you) is odd or even
 */
public class OddEven {

    public static String checkOddEven(int n) {
        return n % 2 == 0 ? "Even" : "Odd";
    }

    public static void main(String[] args) {
        int num = 11;
        System.out.println("The number " + num + " is " + checkOddEven(num));
//        if(num%2==0){
//            System.out.println("Even");
//        }else{
//            System.out.println("Odd");
//        }

    }
}

