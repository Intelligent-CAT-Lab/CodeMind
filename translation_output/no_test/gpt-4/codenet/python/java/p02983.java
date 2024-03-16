The Python code you provided calculates the minimum product modulo 2019 of a pair of distinct integers in the range from `L` to `R`, inclusive. It uses a brute force approach and handles a special case where the range exceeds 2019 by directly returning 0.

Here's the equivalent Java code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int L = scanner.nextInt();
        int R = scanner.nextInt();
        scanner.close();

        if (R - L > 2019) {
            System.out.println(0);
        } else {
            int minModulo = 2019; // Starting high because we're looking for the minimum.
            for (int i = L; i <= R; i++) {
                for (int j = i + 1; j <= R; j++) {
                    minModulo = Math.min(minModulo, (i * j) % 2019);
                }
            }
            System.out.println(minModulo);
        }
    }
}
```

When converting the code, I took the following into account:

- Java uses `Scanner` for reading input from the console.
- Java doesn't support tuple assignments as in Python, so each variable is declared and assigned individually.
- The nested `for` loops and the modulo calculation are directly translatable.
- Instead of using a list to contain all the modulo results and then finding the minimum, I used a single integer (`minModulo`) to keep track of the minimum as we iterate through the loops. This makes the Java code more efficient in terms of space complexity.
- I called the class `Main` since it is a common name for a single-file Java application. You may need to change this to match your environment, especially if you're working within an existing project with its own naming conventions.
