Here's the Java equivalent of the provided Python code. The Java code uses a for loop to tally palindromic numbers in the given range and prints out the total count.

```java
import java.util.Scanner;

public class PalindromeCounter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int from = scanner.nextInt();
        int to = scanner.nextInt();
        int count = 0;

        for (int i = from; i <= to; i++) {
            if (isPalindrome(Integer.toString(i))) {
                count++;
            }
        }

        System.out.println(count);
    }

    public static boolean isPalindrome(String str) {
        int left = 0;
        int right = str.length() - 1;
        
        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        
        return true;
    }
}
```

This program assumes the input will be provided in the same format as the test input you've provided (`11009 11332`). When running this program, it would wait for an input in the console, where you'd enter your test case (`11009 11332`) and then output `4` as the expected result.
