Here is the Java equivalent of your Python code:

```java
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        String input = "1 2 3 4 5 1 2 3 4 5"; // replace with actual input
        String[] numbers = input.split(" ");
        Set<Integer> set = new HashSet<>();
        for (String number : numbers) {
            set.add(Integer.parseInt(number));
        }
        System.out.println(set.size());
    }
}
```

This Java code does the following:

1. It reads a string of space-separated numbers from the user.
2. It splits the string into an array of strings using the `split` method.
3. It creates a `HashSet` to store the unique numbers.
4. It iterates over the array of strings, converting each string to an integer and adding it to the `HashSet`.
5. It prints the size of the `HashSet`, which is the number of unique numbers.
