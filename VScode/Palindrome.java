package VScode;

public class Palindrome {
    public static void main(String[] args) {
        String str = "racecar";
        int left = 0;
        int right = str.length() - 1;

        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                System.out.println(str + " is not a palindrome.");
                return;
            }
            left++;
            right--;
        }
        System.out.println(str + " is a palindrome.");
    }
}