```java
import java.util.Scanner;

public class InterestCalculation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int ans = 100000;
        int numIterations = Integer.parseInt(scanner.nextLine());
        
        for (int i = 0; i < numIterations; i++) {
            ans *= 1.05;
            if (ans % 1000 != 0) {
                ans += 1000 - ans % 1000;
            }
        }
        
        System.out.println(ans);
    }
}
```
