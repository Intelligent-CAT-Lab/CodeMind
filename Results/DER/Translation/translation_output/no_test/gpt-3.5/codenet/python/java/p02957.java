```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        
        double x = (Math.pow(A, 2) - Math.pow(B, 2)) / (2 * (A - B));

        if (x % 1 == 0) {
            System.out.println((int) x);
        } else {
            System.out.println("IMPOSSIBLE");
        }
    }
}
```
