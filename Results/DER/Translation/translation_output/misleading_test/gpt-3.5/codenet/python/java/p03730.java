```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        foo(a, b, c);
    }

    public static void foo(int a, int b, int c) {
        Set<Integer> seen = new HashSet<>();
        int m = a % b;
        int i = m;
        while (!seen.contains(i)) {
            if (i == c) {
                System.out.println("YES");
                return;
            }
            seen.add(i);
            i = (m + i) % b;
        }
        System.out.println("NO");
    }
}
```
