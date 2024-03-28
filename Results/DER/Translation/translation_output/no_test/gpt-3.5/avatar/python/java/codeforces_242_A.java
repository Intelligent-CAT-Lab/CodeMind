```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int y = scanner.nextInt();
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        List<int[]> c = new ArrayList<>();
        for (int i = a; i <= x; i++) {
            for (int j = b; j <= y; j++) {
                if (i > j) {
                    c.add(new int[]{i, j});
                }
            }
        }

        System.out.println(c.size());
        for (int[] pair : c) {
            System.out.println(pair[0] + " " + pair[1]);
        }
    }
}
```
