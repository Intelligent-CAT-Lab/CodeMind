<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
4 2

Expected output:
3


```
n,i=map(int,input().split())
print(n+1-i)
```

### Response:
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int i = scanner.nextInt();
        System.out.println(n + 1 - i);
    }
}
```

This Java code reads two integers from the standard input, adds 1 to the first one, and then subtracts the second one from the result. The result is then printed to the standard output.
<|EOT|>
