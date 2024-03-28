```java
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String S = scanner.next();

        boolean b = S.replace("A", "").equals("KIHBR");

        if (b) {
            List<Integer> L = new ArrayList<>();
            for (String s : S.replaceAll("(?<!A)A", "*").split("\\*")) {
                L.add(s.length());
            }

            int[] X = {1, 0, 0, 1, 1, 1, 1};
            for (int i = 0; i < L.size(); i++) {
                b &= L.get(i) <= X[i];
            }
        }

        System.out.println(b ? "YES" : "NO");
    }
}
```
