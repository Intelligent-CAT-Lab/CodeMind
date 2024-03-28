Here's the equivalent Java code for the given Python code:

```java
import java.util.Arrays;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;

public class AbcStringGenerator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] parts = scanner.nextLine().split(" ");
        int a = Integer.parseInt(parts[0]);
        int b = Integer.parseInt(parts[1]);
        int c = Integer.parseInt(parts[2]);
        scanner.close();
        
        ArrayList<ArrayList<Integer>> L = new ArrayList<>();
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
            ArrayList<Integer> last = L.remove(L.size() - 1);
            L.get(0).addAll(last);
            Collections.sort(L, (list1, list2) -> list1.size() - list2.size());
        }
        
        StringBuilder sb = new StringBuilder();
        for (int i : L.get(0)) {
            sb.append((char) ('a' + i));
        }
        
        System.out.println(sb.toString());
    }
}
```
To execute this code, you would run the Java class `AbcStringGenerator` and input your test case as specified (e.g., "2 2 0" without the quotes). This will yield the expected output "abab" as with the Python code. The Java code creates lists with single integers representing 'a', 'b', or 'c' (0, 1, 2 respectively), then continually merges and sorts lists until only one list remains, after which it builds a string based on the numbers in the final list.
