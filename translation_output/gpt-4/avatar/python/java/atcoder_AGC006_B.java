Here's how you can translate the provided Python code into Java:

```java
import java.util.Scanner;
import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int x = scanner.nextInt();

        if (x == 1 || x == 2 * N - 1) {
            System.out.println("No");
        } else {
            System.out.println("Yes");
            ArrayList<Integer> list = new ArrayList<>();
            for (int i = 1; i < 2 * N; i++) {
                list.add(i);
            }

            list.remove(Integer.valueOf(x - 1));
            list.remove(Integer.valueOf(x));
            list.remove(Integer.valueOf(x + 1));

            for (int i = 0; i < N - 2; i++) {
                System.out.println(list.get(i));
            }

            System.out.println(x - 1);
            System.out.println(x);
            System.out.println(x + 1);

            for (int i = 0; i < N - 2; i++) {
                System.out.println(list.get(N - 2 + i));
            }
        }

        scanner.close();
    }
}
```

Please note that in Java, we need to use the `ArrayList` class to remove elements by their value, so we're using `Integer.valueOf()` to properly remove the integers. Also, we make use of the `Scanner` class to read input from the standard input stream.
