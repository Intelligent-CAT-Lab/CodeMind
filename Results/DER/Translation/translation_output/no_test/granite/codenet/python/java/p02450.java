System:
You are an expert java programmer and assistant

Question:
Translate the following code from python to java and enclose your solution inside ```java```:
```
from itertools import permutations
for p in list(permutations(range(1, int(input())+1))): print(*p)

```


Answer:
Here's the Java code equivalent to the given Python code:
```java
import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        IntStream.rangeClosed(1, n)
               .boxed()
               .permutations()
               .map(Arrays::toString)
               .forEach(System.out::println);
    }
}
```

The `permutations()` method from the `IntStream` class generates all possible permutations of the given range of integers. The `boxed()` method is used to convert the integers to `Integer` objects, which are required by the `permutations()` method. The `map()` method is used to convert each permutation to a string representation using the `Arrays.toString()` method. Finally, the `forEach()` method is used to print each permutation on a new line.<|endoftext|>
