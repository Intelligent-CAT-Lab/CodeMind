Here's the equivalent Java code for the provided Python script:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int X = scanner.nextInt();
        int Y = scanner.nextInt();
        int Z = scanner.nextInt();

        int answer = 0;
        int width = Y + 2 * Z;
        while (width <= X) {
            answer++;
            width += Y + Z;
        }

        System.out.println(answer);
        scanner.close();
    }
}
```

In the Java code above, I used java.util.Scanner for reading the integer inputs. The Java code does the same operation as the Python code: it calculates how many times a certain width can fit within `X`, where the width is initially `Y + 2 * Z` and increases by `Y + Z` each iteration.
