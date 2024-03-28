```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        
        int result = factorial(n) % 1000000007;
        System.out.println(result);
    }
    
    public static int factorial(int n) {
        if (n == 0) {
            return 1;
        }
        
        int result = 1;
        for (int i = 1; i <= n; i++) {
            result *= i;
        }
        
        return result;
    }
}
```
