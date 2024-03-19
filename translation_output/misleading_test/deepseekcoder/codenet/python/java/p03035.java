<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
30 100

Expected output:
35

```
A,B=map(int,input().split())
if A>=13:
  print(B)
elif 6<=A<=12:
  print(B//2)
else:
  print(0)
```

### Response:
Here is the Java version of the provided Python code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int A = scanner.nextInt();
        int B = scanner.nextInt();

        if (A >= 13) {
            System.out.println(B);
        } else if (A >= 6 && A <= 12) {
            System.out.println(B / 2);
        } else {
            System.out.println(0);
        }
    }
}
```

This Java code reads two integers from the standard input, and then prints the appropriate output based on the conditions in the Python code.
<|EOT|>
