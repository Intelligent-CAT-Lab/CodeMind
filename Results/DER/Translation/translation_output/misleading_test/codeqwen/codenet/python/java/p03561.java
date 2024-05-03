Here is the Java version of the provided Python code:

```java
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int K = scanner.nextInt();
        int N = scanner.nextInt();
        if (K % 2 == 0) {
            List<Integer> list = new ArrayList<>(Arrays.asList(K / 2));
            for (int i = 0; i < N - 1; i++) {
                list.add(K);
            }
            System.out.println(list.toString().replace("[", "").replace("]", "").replace(" ", ""));
        } else {
            List<Integer> list = new ArrayList<>(Arrays.asList((K + 1) / 2));
            for (int i = 0; i < N / 2; i++) {
                if (list.get(list.size() - 1) == 1) {
                    list.remove(list.size() - 1);
                } else {
                    list.set(list.size() - 1, list.get(list.size() - 1) - 1);
                    list.addAll(Arrays.asList(K).subList(0, N - list.size()));
                }
            }
            System.out.println(list.toString().replace("[", "").replace("]", "").replace(" ", ""));
        }
    }
}
```

This Java code does the same thing as the Python code. It reads two integers from the standard input, calculates the result based on the conditions, and prints the result. The `ArrayList` class is used to store the integers. The `toString()` method is used to convert the list to a string, and the `replace()` method is used to remove the brackets and spaces.
