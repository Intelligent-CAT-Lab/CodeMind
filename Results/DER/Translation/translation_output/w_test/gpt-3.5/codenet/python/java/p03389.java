```java
import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int A = scanner.nextInt();
        int B = scanner.nextInt();
        int C = scanner.nextInt();
        
        int[] a = {A, B, C};
        Arrays.sort(a);

        int s = 0;

        for (int i = 0; i < 2; i++) {
            int tmp = a[2] - a[i];
            s += tmp / 2;
            a[i] += (tmp / 2) * 2;
        }

        s += Arrays.stream(a).sum() % 3;
        System.out.println(s);
    }
}
```
