import java.util.HashSet;
import java.util.Scanner;


public class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashSet<Character> sHash = new HashSet<>(); // To hold our characters (non-repeating)
        int longestSs = 0;  // Default longest substring
        int sLength = s.length(); // String length
        int i = 0; // For iterations, tracks index when HashSet adds a new character
        int j = 0; // For iteration, tracks index when HashSet contains character. Removes char at this index

        while (i < sLength && j < sLength) {

            if (!sHash.contains(s.charAt(i))) {
                sHash.add(s.charAt(i));
                i++;
                longestSs = Math.max(longestSs, i - j);
            }
            else {
                sHash.remove(s.charAt(j));
                j++;
            }
        }

        return longestSs;
    }


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Solution solution = new Solution();

        System.out.println("Enter a string. For that string, the program will output the length of the longest substring without repeating characters.");

        String inS = scan.next();
        System.out.println("The length of the longest substring is: " + solution.lengthOfLongestSubstring(inS));
    }


}
