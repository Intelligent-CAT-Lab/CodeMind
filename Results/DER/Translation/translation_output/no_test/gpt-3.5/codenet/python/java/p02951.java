```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int A, B, C;
        A = scanner.nextInt();
        B = scanner.nextInt();
        C = scanner.nextInt();

        int get = A - B;
        int i = C - get;

        if (i < 0) {
            i = 0;
        }

        System.out.println(i);
    }
}
```
