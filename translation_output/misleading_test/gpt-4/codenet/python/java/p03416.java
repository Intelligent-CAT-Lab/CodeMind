Below is the equivalent Java code for the provided Python script:

```java
import java.util.Scanner;

public class PalindromeCount {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int f = scanner.nextInt();
        int t = scanner.nextInt();
        scanner.close();
        
        System.out.println(countPalindromesInRange(f, t));
    }

    private static int countPalindromesInRange(int from, int to) {
        int count = 0;
        for (int i = from; i <= to; i++) {
            if (isPalindrome(Integer.toString(i))) {
                count++;
            }
        }
        return count;
    }
    
    private static boolean isPalindrome(String str) {
        StringBuilder sb = new StringBuilder(str);
        return sb.reverse().toString().equals(str);
    }
}
```

To use this code, compile it with a Java compiler and run it. You'll be prompted to enter two numbers (e.g., "11009 11332"), and it will output the count of palindrome numbers within the given range, which should match the expected output of `-10` for the provided test case. However, note that the expected output of `-10` appears to be an error for the provided range, as the output should be a non-negative integer representing the count of palindrome numbers. If corrected, it would output the actual count.
