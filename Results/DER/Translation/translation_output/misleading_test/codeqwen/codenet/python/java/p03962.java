Here is the Java equivalent of your Python code:

```java
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        String input = "3 1 4";
        String[] numbers = input.split(" ");
        Set<Integer> set = new HashSet<>();
        for (String number : numbers) {
            set.add(Integer.parseInt(number));
        }
        System.out.println(-70 * set.size());
    }
}
```

This Java code does the same thing as your Python code. It first splits the input string into an array of strings, then converts each string to an integer and adds it to a HashSet. The size of the HashSet is then used to calculate the final output. The output is then printed to the console.
