package VScode;

public class StringSwap {
    public static void main(String[] args) {
        String str = "Hello World";
        int str1 = 0; // Index of the first character to swap
        int str2 = 6; // Index of the second character to swap

        char[] charArray = str.toCharArray();
        char temp = charArray[str1];
        charArray[str1] = charArray[str2];
        charArray[str2] = temp;

        String swappedStr = new String(charArray);
        System.out.println("Original String: " + str);
        System.out.println("Swapped String: " + swappedStr);
    }

}
