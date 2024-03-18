Below is the translated Java code that replicates the functionality of the Python code provided:

```java
import java.util.Scanner;

public class PalindromeNumber {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int result = findPalindromeNumber(n);
        System.out.println(result);
        scanner.close();
    }

    private static boolean isPalindrome(int number) {
        String numStr = Integer.toString(number);
        StringBuilder reversedStr = new StringBuilder(numStr).reverse();
        return numStr.equals(reversedStr.toString());
    }

    private static int findPalindromeNumber(int n) {
        for (int i = 0; i < 100000; i++) {
            if (n >= i && isPalindrome(n - i)) {
                return n - i;
            }
            if (isPalindrome(n + i)) {
                return n + i;
            }
        }
        return -1; // Should never reach this line if a palindrome is found within the 100000 range
    }
}
```

Here's how the code works in Java:

1. We import the `Scanner` class to read input from System.in.
2. We define a `main` method which is the entry point for the application.
3. We create a `Scanner` instance to read the input number `n`.
4. We call a method `findPalindromeNumber`, which finds the closest palindrome number.
5. We define `isPalindrome` method to check whether a number is a palindrome by comparing the original string with its reversed version.
6. The `findPalindromeNumber` method iterates over a range, similar to the Python code, checking both `n - i` and `n + i`.
7. If a palindrome is found within the range, it returns that number; otherwise, it would return -1 although it's guaranteed by the range of the loop that a palindrome will be found.
8. Finally, the result is printed to the console.
9. The `Scanner` instance is closed to prevent resource leaks.

Remember to provide input on the console when you run the application since `Scanner` is waiting for an integer input from System.in.
