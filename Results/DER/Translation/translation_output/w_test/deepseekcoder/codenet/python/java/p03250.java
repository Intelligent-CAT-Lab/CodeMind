<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
1 5 2

Expected output:
53


```
abc = list(map(int, input().split()))
abc.sort()
print(int(str(abc[2]) + str(abc[1])) + abc[0])
```

### Response:
```java
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] abc = new int[3];
        for (int i = 0; i < 3; i++) {
            abc[i] = scanner.nextInt();
        }
        Arrays.sort(abc);
        System.out.println(Integer.parseInt(String.valueOf(abc[2]) + String.valueOf(abc[1])) + abc[0]);
    }
}
```

This Java code does the same thing as the Python code. It reads three integers from the input, sorts them in ascending order, and then prints the sum of the last two numbers (which are the largest) and the smallest number.
<|EOT|>
