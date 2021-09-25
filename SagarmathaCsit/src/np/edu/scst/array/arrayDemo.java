package np.edu.scst.array;

/*
Array is an indexed, fixed-sized colllection of data element of same type, stored under a common variable name.
From C/C# int num1[] = {1,2,3,4}; allowd for java too
For java recommended: int []num2 = {1,2,3,4};

Data/classtype ---- Default value
int --> 0
float --> 0.0
String --> null
boolean --> false
char --> blank

 */
public class arrayDemo {

    public static void main(String[] args) {
        int[] num = {1, 2, 3, 4, 5, 6};
        String[] names = {"Ram", "Hari", "Laxman", "Shyam", "Bharat"};
        String[] fruits = new String[5];
        fruits[1] = "Banana";
        // Access array element
        System.out.println(fruits[0]);
        //Modify array element
        names[1] = "Ai Stha";
        
        // For loop
        System.out.println("For each loop");
        for (int i = 0; i < names.length; i++) {
            System.out.println(names[i]);
        }
        
        // For each loop
        // Datatype/Classtype loopVariable : arrayName
        for(int var : num){
            System.out.println(var);
        }
        for(String var:names){
            System.out.println(var);
        }
        
        
        
        
        
    }
}
