```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int n = scanner.nextInt();
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        
        int k = n / (a + b);
        int p = n % (a + b);
        
        System.out.println(k * a + Math.min(p, a));
    }
}
```
