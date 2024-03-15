Here's how you would translate your Python code to Java, taking into account syntax differences and the fact that we need to handle user input differently in Java:

```java
import java.util.Scanner;

public class PalindromeCheck {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string:");
        String s = scanner.nextLine();

        int div = s.length() / 2;
        String pre = s.substring(0, div);
        String suf = s.substring(div + 1);

        if (isPalindrome(s) && isPalindrome(pre) && isPalindrome(suf)) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }

        scanner.close();
    }

    private static boolean isPalindrome(String str) {
        return new StringBuilder(str).reverse().toString().equals(str);
    }
}
```

This Java code makes use of the `StringBuilder` class to efficiently reverse strings, just as the `[::-1]` slice notation does in Python. To read user input, Java uses the `Scanner` class. The `isPalindrome` method encapsulates the logic for checking if a string is a palindrome. Note that Java indexing is zero-based and the `substring` method is used instead of slice notation.
