<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
2 5

Expected output:
10


```
a,b=input().split()
a=int(a)
b=int(b)

if 0<a and a<10 and 0<b and b<10:
    print(a*b)
else:
    print("-1")

```

### Response:
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        if (0 < a && a < 10 && 0 < b && b < 10) {
            System.out.println(a * b);
        } else {
            System.out.println("-1");
        }
    }
}
```

This Java code does the same thing as the Python code. It reads two integers from the input, checks if they are in the range 1-9 (inclusive), and if they are, it prints their product. If not, it prints "-1".
<|EOT|>
