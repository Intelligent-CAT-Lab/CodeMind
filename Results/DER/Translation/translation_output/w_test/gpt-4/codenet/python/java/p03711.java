Below is the translated Java code for the provided Python code snippet:

```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] inputs = scanner.nextLine().split(" ");
        int x = Integer.parseInt(inputs[0]);
        int y = Integer.parseInt(inputs[1]);
        
        List<Integer> a = Arrays.asList(1, 3, 5, 7, 8, 10, 12);
        List<Integer> b = Arrays.asList(4, 6, 9, 11);
        
        if (x == 2 || y == 2) {
            System.out.println("No");
        } else if ((a.contains(x) && a.contains(y)) || (b.contains(x) && b.contains(y))) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
        scanner.close();
    }
}
```

Here's how this code works:
- It first imports the `java.util.*` package to use `Scanner` for input and `List` and `Arrays` for list operations.
- Unlike Python's `input()` which can directly take and split the input, in Java we create a `Scanner` to read from standard input and use `split()` on the entire line input.
- We then parse the individual string elements into integers.
- The lists of months `a` and `b` are created using `Arrays.asList()`.
- Conditional checks are performed in a manner similar to the Python code to determine if the input values are both in list `a` or both in list `b`, or if one of them is 2.
- Finally, it prints "Yes" or "No" based on the suitability of the conditions.
- The `scanner.close()` at the end is used to close the `Scanner` instance after we're done with it.
