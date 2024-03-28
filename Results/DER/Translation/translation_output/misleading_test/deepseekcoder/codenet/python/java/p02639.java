<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
0 2 3 4 5

Expected output:
-9

```
x_list = list(map(int, input().split()))
for i in range(5):
    if x_list[i] == 0:
        print(i+1)
```

### Response:
```java
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] x_list = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        for (int i = 0; i < 5; i++) {
            if (x_list[i] == 0) {
                System.out.println(i+1);
                break;
            }
        }
    }
}
```

This Java code reads a line of input from the user, splits it into an array of strings, converts each string to an integer, and stores the integers in an array. It then iterates over the array, checking each integer. If it finds a zero, it prints the index of that zero (plus one, because the problem statement seems to be 1-indexed) and then breaks out of the loop.
<|EOT|>
