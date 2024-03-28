Here's the equivalent Java code for the given Python script:

```java
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.next();
        char[] s = input.toCharArray();
        boolean canBePalindrome = true;
        Map<Character, Integer> dt = new HashMap<>();
        
        for (char c : s) {
            dt.put(c, dt.getOrDefault(c, 0) + 1);
        }
        
        int cnt = 0;
        for (int value : dt.values()) {
            if (value % 2 != 0) {
                if (cnt < 1) {
                    cnt++;
                } else {
                    canBePalindrome = false;
                    break;
                }
            }
        }
        
        if (canBePalindrome) {
            System.out.println("First");
        } else if (!canBePalindrome && s.length % 2 == 0) {
            System.out.println("Second");
        } else if (!canBePalindrome && s.length % 2 != 0) {
            System.out.println("First");
        }
        
        sc.close();
    }
}
```

This code reads a string from the input, counts the occurrences of each character, and then determines if the characters can be rearranged to form a palindrome based on the counts being even or at most one character having an odd count. It then prints the output according to the conditions specified in the original Python script. 

To run the provided test case in Java, you would input the given string into the program, and the expected output would be "Second" since there's more than one character with an odd count, and the length of the string is even.
