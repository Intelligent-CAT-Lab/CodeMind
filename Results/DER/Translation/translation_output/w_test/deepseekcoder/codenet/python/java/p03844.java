<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
1 + 2

Expected output:
3


```
A,s,B = input().split()
A = int(A)
B = int(B)
if s == '+':
    print(A+B)
elif s == '-':
    print(A-B)

```

### Response:
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int A = scanner.nextInt();
        String s = scanner.next();
        int B = scanner.nextInt();

        if (s.equals("+")) {
            System.out.println(A + B);
        } else if (s.equals("-")) {
            System.out.println(A - B);
        }
    }
}
```

This Java code reads three inputs from the user: two integers and a string. It then checks if the string is "+" or "-", and performs the corresponding operation on the two integers. The result is then printed to the console.
<|EOT|>
