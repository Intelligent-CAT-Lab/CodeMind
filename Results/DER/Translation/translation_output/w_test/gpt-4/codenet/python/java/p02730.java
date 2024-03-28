Here is the equivalent Java code for the provided Python code. The Java code reads a string input, divides it as the Python code does, and checks if the whole string, the prefix, and the suffix are palindromes. Assuming the input is provided via standard input, for example, through `Scanner`:

```java
import java.util.Scanner;

public class PalindromeChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        int div = s.length() / 2;
        String pre = s.substring(0, div);
        String suf = s.substring(div + ((s.length() % 2 == 0) ? 0 : 1));

        if (isPalindrome(s) && isPalindrome(pre) && isPalindrome(suf)) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }

        scanner.close();
    }

    private static boolean isPalindrome(String str) {
        int start = 0, end = str.length() - 1;
        while (start < end) {
            if (str.charAt(start) != str.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }
}
```

This Java code defines a helper method `isPalindrome` to check if a string is a palindrome, which is used for the whole string, the prefix, and the suffix. The `Scanner` class is used to read input from the standard input (console). The division and string slicing follow the same logic as in the Python code, ensuring the correct indices are used in the `substring` method. The outcome "Yes" or "No" is printed to the standard output based on the palindrome checks.
