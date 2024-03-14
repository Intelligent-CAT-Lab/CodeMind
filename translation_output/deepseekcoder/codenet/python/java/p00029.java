<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following python code to java and enclose your solution inside ```java```:
```
a = list(input().split())
print(max(a, key=a.count), max(a, key=len))

```

### Response:
```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] a = scanner.nextLine().split(" ");
        System.out.println(Collections.max(Arrays.asList(a), Comparator.comparing(String::length)) + " " +
                Collections.max(Arrays.asList(a), Comparator.comparing(x -> Collections.frequency(Arrays.asList(a), x))));
    }
}
```

This Java code does the same thing as the Python code. It reads a line of input, splits it into an array of strings, and then prints the string with the maximum length and the string with the maximum count.

The `Collections.max` method is used to find the maximum element in a list, and the `Comparator.comparing` method is used to specify the criteria for comparing elements. The `String::length` and `x -> Collections.frequency(Arrays.asList(a), x)` lambda expressions are used to specify the length and count criteria, respectively.
<|EOT|>
