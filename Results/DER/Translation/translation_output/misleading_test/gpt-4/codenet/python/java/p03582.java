Below is the translated version of the given Python code to Java:

```java
import java.util.Scanner;
import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;
import java.util.Comparator;

public class AbcStringGenerator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        
        List<List<Integer>> L = new ArrayList<>();
        for (int i = 0; i < a; i++) {
            L.add(new ArrayList<>(Arrays.asList(0)));
        }
        for (int i = 0; i < b; i++) {
            L.add(new ArrayList<>(Arrays.asList(1)));
        }
        for (int i = 0; i < c; i++) {
            L.add(new ArrayList<>(Arrays.asList(2)));
        }
        
        while (L.size() > 1) {
            List<Integer> popped = L.remove(L.size() - 1);
            L.get(0).addAll(popped);
            L.sort(Comparator.comparingInt(list -> list.get(0)));
        }
        
        StringBuilder result = new StringBuilder();
        for (Integer i : L.get(0)) {
            result.append("abc".charAt(i));
        }
        
        System.out.println(result.toString());
        
        scanner.close();
    }
}
```
To execute this code, you can compile it and provide the input `2 2 0` as specified; the expected output would be `abab`.
