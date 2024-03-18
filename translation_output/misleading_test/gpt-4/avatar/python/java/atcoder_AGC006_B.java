The provided Python code can be translated into Java as follows:

```java
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int x = scanner.nextInt();

        if (x == 1 || x == 2 * N - 1) {
            System.out.println("No");
        } else {
            System.out.println("Yes");

            List<Integer> l = new ArrayList<>();
            for (int i = 1; i < 2 * N; i++) {
                l.add(i);
            }
            l.remove(Integer.valueOf(x - 1));
            l.remove(Integer.valueOf(x));
            l.remove(Integer.valueOf(x + 1));

            for (int i = 0; i < N - 2; i++) {
                System.out.println(l.get(i));
            }

            System.out.println(x - 1);
            System.out.println(x);
            System.out.println(x + 1);

            for (int i = 0; i < N - 2; i++) {
                System.out.println(l.get(N - 2 + i));
            }
        }

        scanner.close();
    }
}
```

This Java code takes two integers `N` and `x` as input, and performs the same logic as the Python code to decide whether to print "No" or "Yes", and then the sequence if the initial conditions are satisfied. It makes use of the `ArrayList` collection to hold the range of integers and employs the `remove()` method to remove elements from the list by their value. Note that `Integer.valueOf()` is used to ensure that the correct `remove()` method overload is called, which removes the first occurrence of the specified value from the list.
