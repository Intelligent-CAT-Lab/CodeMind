```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int A = scanner.nextInt();
        int B = scanner.nextInt();

        int minVal = Math.min(A, B);
        int maxVal = Math.max(A + B - N, 0);

        System.out.println(minVal + " " + maxVal);
    }
}
```
