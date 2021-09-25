package bijayshrestha.labthree;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * WAP containing a method to count all vowels in a string.
 */
public class VowelsCount {

    public static int countVowels(String str) {
        int count = 0;
        final ArrayList<String> VOWELS = new ArrayList(Arrays.asList("a", "A", "e", "E", "i", "I", "o", "O", "u", "U"));
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (VOWELS.contains(String.valueOf(ch))) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        String name = "Bijay Shrestha";
        System.out.println("The number of vowels in " + name + " is " + countVowels(name));
    }
}
