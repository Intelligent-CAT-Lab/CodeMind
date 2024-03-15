Here's the translation of the given Python code into Java:

```java
import java.util.Scanner;
import java.util.Set;
import java.util.HashSet;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt() % 10;
        scanner.close();
        
        if (n == 3) {
            System.out.println("bon");
        } else if (new HashSet<>(Arrays.asList(2, 4, 5, 7, 9)).contains(n)) {
            System.out.println("hon");
        } else {
            System.out.println("pon");
        }
    }
}
```

This Java code replicates the functionality of the provided Python code. The user's input is read using a `Scanner` object, then the last digit is extracted using the modulo operator (`% 10`). We use an `if-else` construct to check the last digit and print the corresponding word according to the rules defined in the Python code. 

Notice that in the case of checking if `n` is in the list `[2, 4, 5, 7, 9]`, I created a `HashSet` from an `ArrayList` because Java does not have a direct equivalent of Python's `in` operator for lists. A `Set` is used here because it provides a fast `contains` method which effectively checks if an element is in the set.

Remember to import the necessary classes from the Java standard library to make sure the code compiles and runs correctly.
