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
        String numStr = String.valueOf(num);
        return numStr.equals(new StringBuilder(numStr).reverse().toString());
    }
}
```
