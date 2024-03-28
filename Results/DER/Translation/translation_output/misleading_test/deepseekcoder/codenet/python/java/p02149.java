<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
1000 900 850

Expected output:
Ad

```
S = list(map(int,input().split()))
if S.index(max(S)) == 0:
    print("A")
elif S.index(max(S)) == 1:
    print("B")
elif S.index(max(S)) == 2:
    print("C")

```

### Response:
Here is the Java version of the provided Python code:

```java
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> S = Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());
        if (S.indexOf(Collections.max(S)) == 0) {
            System.out.println("A");
        } else if (S.indexOf(Collections.max(S)) == 1) {
            System.out.println("B");
        } else if (S.indexOf(Collections.max(S)) == 2) {
            System.out.println("C");
        }
    }
}
```

This Java code does the same thing as the Python code. It reads a line of input, splits it into a list of integers, and then checks the index of the maximum value in the list. If the index is 0, it prints "A". If the index is 1, it prints "B". If the index is 2, it prints "C".
<|EOT|>
