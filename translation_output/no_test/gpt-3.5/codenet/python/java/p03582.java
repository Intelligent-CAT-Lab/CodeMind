```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();

        List<Integer> L = new ArrayList<>();
        for (int i = 0; i < a; i++) {
            L.add(0);
        }
        for (int i = 0; i < b; i++) {
            L.add(1);
        }
        for (int i = 0; i < c; i++) {
            L.add(2);
        }

        while (L.size() > 1) {
            int last = L.remove(L.size() - 1);
            L.set(0, L.get(0) + last);
            Collections.sort(L);
        }

        StringBuilder result = new StringBuilder();
        for (int i : L) {
            result.append((i == 0) ? 'a' : (i == 1) ? 'b' : 'c');
        }
        System.out.println(result);
    }
}
```
