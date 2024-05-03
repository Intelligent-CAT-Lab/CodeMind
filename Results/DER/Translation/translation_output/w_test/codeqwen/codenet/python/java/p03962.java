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
        System.out.println(set.size());
    }
}
```

This Java code does the same thing as your Python code. It reads a string of space-separated numbers, converts each number to an integer, and adds it to a HashSet. Since a HashSet only allows unique elements, it will automatically remove any duplicates. Finally, it prints the size of the HashSet, which is the number of unique numbers in the input.
