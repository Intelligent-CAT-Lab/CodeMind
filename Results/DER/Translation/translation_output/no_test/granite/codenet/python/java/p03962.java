System:
You are an expert java programmer and assistant

Question:
Translate the following code from python to java and enclose your solution inside ```java```:
```
print(len(set(list(map(int, input().split())))))

```


Answer:
Here's the Java code equivalent to the given Python code:
```java
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        String input = "1 2 3 4 5";
        List<Integer> numbers = Arrays.stream(input.split(" "))
               .map(Integer::parseInt)
               .collect(Collectors.toList());
        Set<Integer> uniqueNumbers = new HashSet<>(numbers);
        System.out.println(uniqueNumbers.size());
    }
}
```

In this Java code, we first split the input string into a list of strings using the `split()` method. Then, we use the `map()` method to convert each string to an integer using the `Integer::parseInt` method reference. We collect the mapped integers into a list using the `collect()` method with `Collectors.toList()`.

Next, we create a `HashSet` called `uniqueNumbers` and add all the integers from the list to it. The `HashSet` automatically removes duplicate elements, so we end up with a set of unique numbers.

Finally, we print the size of the set using the `size()` method.<|endoftext|>
