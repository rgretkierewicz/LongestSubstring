import java.util.HashSet;
import java.util.Scanner;

public class Solution {
    public int lengthOfLongestSubstring(String s) {
        int longestSs = 1;
        HashSet<Character> sHash = new HashSet<>();

        for (int i = 0; i < s.length(); i++) {
            if (sHash.contains(s.charAt(i))) {
                if (longestSs < sHash.size()) {
                    longestSs = sHash.size();
                }
                sHash.clear();
            }
            sHash.add(s.charAt(i));
        }

        // Check if the final value of the hash set is bigger than the current value saved for longest substring
        if (longestSs < sHash.size()) {
            longestSs = sHash.size();
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
