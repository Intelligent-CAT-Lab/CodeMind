```java
import java.util.Scanner;

public class PalindromeCount {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int f = scanner.nextInt();
        int t = scanner.nextInt();
        int count = 0;
        
        for (int i = f; i <= t; i++) {
            if (isPalindrome(i)) {
                count++;
            }
        }
        
        System.out.println(count);
    }
    
    public static boolean isPalindrome(int num) {
        String numStr = Integer.toString(num);
        String reversedNumStr = new StringBuilder(numStr).reverse().toString();
        return numStr.equals(reversedNumStr);
    }
}
```
Just copy and paste the above Java code into your IDE or editor and run the program. It will take two integers as input and output the count of palindrome numbers between those two integers.
