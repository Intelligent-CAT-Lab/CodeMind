<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
5 8

Expected output:
40


```
a=raw_input().split()
print(int(a[0])*int(a[1]))


```

### Response:
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split(" ");
        int result = Integer.parseInt(input[0]) * Integer.parseInt(input[1]);
        System.out.println(result);
    }
}
```

This Java code does the same thing as the Python code. It reads a line of input, splits it into an array of strings, converts the first and second elements of the array to integers, multiplies them together, and then prints the result.
<|EOT|>
