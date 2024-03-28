<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
0 2 3 4 5

Expected output:
1


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
import java.util.stream.Collectors;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> xList = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());
        for (int i = 0; i < xList.size(); i++) {
            if (xList.get(i) == 0) {
                System.out.println(i + 1);
                break;
            }
        }
    }
}
```

This Java code does the same thing as the Python code. It reads a line of input, splits it into a list of integers, and then iterates over the list to find the first zero. When it finds a zero, it prints the index of that zero (plus one, because the problem statement seems to be 1-indexed) and then stops.
<|EOT|>
