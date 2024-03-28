<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following python code to java and enclose your solution inside ```java```:
```
x_list = list(map(int, input().split()))
for i in range(5):
    if x_list[i] == 0:
        print(i+1)
```

### Response:
```java
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> x_list = Arrays.asList(scanner.nextLine().split(" ")).stream().map(Integer::parseInt).collect(Collectors.toList());
        IntStream.range(0, 5).filter(i -> x_list.get(i) == 0).forEach(i -> System.out.println(i + 1));
    }
}
```

This Java code does the same thing as the Python code. It reads a line of space-separated integers from the standard input, converts them to a list, and then prints the index of each element in the list that is 0. The index is 1-based (i.e., it starts from 1 instead of 0).
<|EOT|>
