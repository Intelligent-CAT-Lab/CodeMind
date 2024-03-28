Here's the translation of the Python code into Java:

```java
import java.util.Scanner;

public class PalindromeTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.next();
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

    private static boolean isPalindrome(String s) {
        return new StringBuilder(s).reverse().toString().equals(s);
    }
}
```

For the given test input `akasaka`, if you run this Java code, you should expect the output:

```
Yes
```

as it meets the palindrome conditions laid out in the original Python code.
