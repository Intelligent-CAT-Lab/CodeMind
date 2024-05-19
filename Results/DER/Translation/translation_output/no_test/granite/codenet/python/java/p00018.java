System:
You are an expert java programmer and assistant

Question:
Translate the following code from python to java and enclose your solution inside ```java```:
```
for a in reversed(sorted(map(int,raw_input().split()))):print a,
```


Answer:
Here's the Java code equivalent to the given Python code:
```java
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        scanner.close();

        String[] split = input.split(" ");
        List<Integer> integers = Arrays.asList(split).stream()
               .map(Integer::parseInt)
               .sorted(Collections.reverseOrder())
               .toList();

        for (Integer integer : integers) {
            System.out.print(integer + " ");
        }
    }
}
```

This Java code first reads the input from the user using a Scanner. It then splits the input string into an array of strings using the `split()` method. The `map()` method is used to convert each string element to an integer using the `Integer::parseInt` method reference. The resulting list of integers is then sorted in descending order using the `sorted()` method and the `Collections.reverseOrder()` comparator. Finally, the sorted list is printed to the console using a for-each loop.<|endoftext|>
