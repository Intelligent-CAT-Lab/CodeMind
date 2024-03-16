```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int A = scanner.nextInt();
        int B = scanner.nextInt();

        if (B % A == 0) {
            System.out.println(-1);
            System.exit(0);
        }

        int k = (int) Math.ceil((double) B / A);
        for (int i = k; i < k + 10000000; i++) {
            int bn = i * A / B;
            int rem = i * A % B;
            int an = rem / A;
            rem %= A;
            int n = bn + an + rem;
            if (n > i) {
                System.out.println(i * A);
                System.exit(0);
            }
        }
        System.out.println(-1);
    }
}
```  
