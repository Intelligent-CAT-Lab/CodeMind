```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        for (int i = 0; i <= n; i++) {
            for (int j = i + 1; j < n; j++) {
                int x = i ^ j;
                int ct = 0;
    
                while (x > 0) {
                    x /= 2;
                    ct++;
                }
    
                System.out.print(ct + " ");
            }
            System.out.println();
        }
    }
}
```
