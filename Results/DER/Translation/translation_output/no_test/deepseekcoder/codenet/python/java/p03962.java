<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following python code to java and enclose your solution inside ```java```:
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
        String[] numbers = scanner.nextLine().split(" ");
        Set<Integer> set = new HashSet<>();
        for (String number : numbers) {
            set.add(Integer.parseInt(number));
        }
        System.out.println(set.size());
    }
}
```

This Java code does the same thing as the Python code. It reads a line of input, splits it into an array of strings, converts each string to an integer, and adds it to a `HashSet`. The `HashSet` automatically removes duplicates, so the size of the set is the number of unique integers. The size of the set is then printed.
<|EOT|>
