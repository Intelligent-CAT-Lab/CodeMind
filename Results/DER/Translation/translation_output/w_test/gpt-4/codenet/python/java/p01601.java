Here's the equivalent Java code for the Python script you've provided. Please note that in Java, we need to handle input and output explicitly through `System.in` and `System.out`. Also, the method to check whether a number is a palindrome is slightly different in Java since we don't have Python's string slicing features.

```java
import java.util.Scanner;

public class PalindromeFinder {

    public static boolean isPalindrome(int n) {
        String numStr = String.valueOf(n);
        String reversedStr = new StringBuilder(numStr).reverse().toString();
        return numStr.equals(reversedStr);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.close();

        for (int i = 0; i < 100000; i++) {
            if (n >= i && isPalindrome(n - i)) {
                System.out.println(n - i);
                break;
            }
            if (isPalindrome(n + i)) {
                System.out.println(n + i);
                break;
            }
        }
    }
}
```

You would run this Java program and input `13` as test input. The expected output would be `11` as this is the nearest palindrome less than or equal to 13.
