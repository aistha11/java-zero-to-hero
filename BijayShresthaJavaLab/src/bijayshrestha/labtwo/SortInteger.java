
package bijayshrestha.labtwo;

import java.util.Arrays;

/**
 * WAP to sort the elements of an integer array in ascending order.
 */
public class SortInteger {
    public static void main(String[] args) {
        int ages[] = {2,5,3,1,8,3,9,6,4,5};
        System.out.println("Before Sorting");
        for(int age : ages){
            System.out.println(age);
        }
        Arrays.sort(ages);
        System.out.println("After Sorting");
        for(int age : ages){
            System.out.println(age);
        }
    }
}
