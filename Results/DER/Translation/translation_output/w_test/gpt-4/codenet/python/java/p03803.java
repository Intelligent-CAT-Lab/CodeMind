Here is the Python code translated to Java:

```java
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CardGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        scanner.close();

        Map<Integer, Integer> rank = new HashMap<>();
        int[] j = {2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 1};
        
        for (int i = 0; i < j.length; i++) {
            rank.put(j[i], i);
        }
        
        if (rank.get(a) > rank.get(b)) {
            System.out.println("Alice");
        } else if (rank.get(a) < rank.get(b)) {
            System.out.println("Bob");
        } else {
            System.out.println("Draw");
        }
    }
}
```

This Java program functions similarly to the provided Python code. When you run the program, you should input the two integers separated by a space, corresponding to the Python test input `"8 6"`. The Java program will then output `"Alice"` according to the expected result for the given test case.
