Here is the equivalent code in Java. Note that Java does not have built-in tuples, so we'll use a custom Pair class for that purpose. Also, Java does not have list comprehensions or generators equivalent to Python, so we'll need to do this manually with loops and conditionals. Finally, be aware that Java's `System.in` requires handling of exceptions that can occur when reading from input.

```java
import java.util.Scanner;
import java.util.function.BiFunction;

public class Main {
    static int n = 1;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int D1 = scanner.nextInt();
        int D2 = scanner.nextInt();
        
        BiFunction<Integer, Integer, Boolean> j1 = judge(D1);
        BiFunction<Integer, Integer, Boolean> j2 = judge(D2);
        
        int cnt = 0;
        for (int x = 0; x < N * 2; x++) {
            for (int y = 0; y < N * 2; y++) {
                if (j1.apply(x, y) && j2.apply(x, y)) {
                    System.out.println(x + " " + y);
                    cnt++;
                    if (cnt >= N * N) {
                        break;
                    }
                }
            }
            if (cnt >= N * N) {
                break;
            }
        }
        
        scanner.close();
    }

    public static BiFunction<Integer, Integer, Boolean> judge(int D) {
        while (D % 4 == 0) {
            n *= 2;
            D /= 4;
        }
        
        BiFunction<Integer, Integer, Boolean> h1 = (x, y) -> (~((x / n + y / n) % 2) != 0);
        BiFunction<Integer, Integer, Boolean> h2 = (x, y) -> (~((x / n) % 2) != 0);
        
        return D % 2 == 1 ? h1 : h2;
    }
}
```

Additional notes for the translation:

- In Java, lambda expressions can be used to define the equivalent of Python's functions `h1` and `h2`. These are then used to create instances of `BiFunction<Integer, Integer, Boolean>`, which takes two integers as input and returns a Boolean.
- Java's bitwise complement operator `~` is used similarly to how it's used in Python.
- The `while` loops and `if` statements are directly translated from Python to Java.
- I used `System.in` with a `Scanner` object to read from the console in Java, which needs to be closed after finishing the input operations to release system resources.
