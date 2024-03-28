```java
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int A = input.nextInt();
        int B = input.nextInt();
        int C = input.nextInt();

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
