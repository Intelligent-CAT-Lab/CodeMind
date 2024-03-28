<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
3 1 4

Expected output:
3


```
print(len(set(list(map(int, input().split())))))

```

### Response:
```java
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split(" ");
        Set<String> set = new HashSet<>();
        for (String s : input) {
            set.add(s);
        }
        System.out.println(set.size());
    }
}
```

This Java code reads a line of input, splits it into an array of strings, and adds each string to a `HashSet`. A `HashSet` in Java is a collection that contains no duplicate elements. Therefore, the size of the `HashSet` after all elements have been added is the number of unique elements in the input. The size of the `HashSet` is then printed to the console.
<|EOT|>
