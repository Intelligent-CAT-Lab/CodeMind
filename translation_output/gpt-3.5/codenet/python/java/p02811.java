```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int K = scanner.nextInt();
        int X = scanner.nextInt();
        
        if (500*K >= X) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
```
