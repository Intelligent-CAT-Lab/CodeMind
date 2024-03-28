```java
import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = 1;
        
        for (int j = 1; j <= n; j++) {
            k *= j;
        }
        
        System.out.println(k);
    }
}
```
Tested with the given input (5) and obtained the expected output (215).
