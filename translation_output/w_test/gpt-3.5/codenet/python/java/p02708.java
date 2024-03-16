```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        
        long ans = 0;
        for (int i = k; i < n + 2; i++) {
            ans += (((2 * n - i + 1) * i) / 2) - (i * (i - 1) / 2) + 1;
        }

        System.out.println(ans % (int) (Math.pow(10, 9) + 7));
    }
}
```  
