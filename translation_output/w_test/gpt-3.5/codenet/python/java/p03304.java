```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int d = scanner.nextInt();
        
        if (d > 0) {
            System.out.printf("%.10f%n", 2.0 * (n - d) * (m - 1) / Math.pow(n, 2));
        } else {
            System.out.printf("%.10f%n", (m - 1) / (double) n);
        }
    }
}
```  
