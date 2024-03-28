```java
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String S = scanner.next();

        boolean b = S.replace("A", "").equals("KIHBR");
        if (b) {
            String[] parts = ("*" + S.replace("A", "*") + "*").split("A");
            int[] L = Arrays.stream(parts)
                    .mapToInt(String::length)
                    .toArray();
            int[] X = new int[]{1, 0, 0, 1, 1, 1, 1};
            for (int i = 0; i < L.length; i++) {
                b &= L[i] <= X[i];
            }
        }

        System.out.println(b ? "YES" : "NO");
    }
}
```
