Here's the translated Java code:
```java
import java.util.ArrayList;
import java.util.Scanner;
import java.util.AbstractMap.SimpleEntry;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        ArrayList<SimpleEntry<Integer, Integer>> ans = new ArrayList<>();

        for (int i = 0; i < n - 1; i++) {
            if (i % 2 != 0) {
                ans.add(new SimpleEntry<>(i, 0));
            }
        }
        for (int i = 0; i < n - 1; i++) {
            if (i % 6 == 1) {
                for (int j = 2; j < n; j++) {
                    if (j % 2 == 0) {
                        ans.add(new SimpleEntry<>(i, j));
                    }
                }
            }
            if (i % 6 == 4) {
                for (int j = 0; j < n; j++) {
                    if (j % 2 != 0) {
                        ans.add(new SimpleEntry<>(i, j));
                    }
                }
            }
        }
        for (int j = 0; j < n; j++) {
            if ((n - 1 + j) % 2 != 0) {
                ans.add(new SimpleEntry<>(n - 1, j));
            }
        }
        
        System.out.println(ans.size());
        for (SimpleEntry<Integer, Integer> pair : ans) {
            System.out.println(pair.getKey() + " " + pair.getValue());
        }
        scanner.close();
    }
}
```

This Java code uses `ArrayList<SimpleEntry<Integer, Integer>>` to store pairs of integers to match the list of tuples in Python. The rest of the logic remains pretty similar, iterating over the range and adding pairs based on the conditions from the Python code. We're using `System.out.println` for printing out the results. Java code also includes necessary imports for `Scanner` and `ArrayList`.
