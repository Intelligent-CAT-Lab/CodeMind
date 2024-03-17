<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
5 8

Expected output:
-3


```
s = input().split()
print(int(s[0]) - int(s[1]))

```

### Response:
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        String[] numbers = s.split(" ");
        int result = Integer.parseInt(numbers[0]) - Integer.parseInt(numbers[1]);
        System.out.println(result);
    }
}
```

This Java code reads a line of input from the user, splits it into two strings, converts those strings to integers, subtracts the second integer from the first, and then prints the result.
<|EOT|>
