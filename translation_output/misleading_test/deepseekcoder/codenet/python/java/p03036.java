<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
2 10 20

Expected output:
73
109
41
121
283
626
1346
2589
5137
10261

```
r,d,x = (int(i) for i in input().split())

for i in range(1,11):
    x = r*x-d
    print(x)
```

### Response:
Here is the Java version of the Python code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int r = scanner.nextInt();
        int d = scanner.nextInt();
        int x = scanner.nextInt();

        for (int i = 0; i < 10; i++) {
            x = r * x - d;
            System.out.println(x);
        }
    }
}
```

This Java code does the same thing as the Python code. It reads three integers from the input, then uses a loop to calculate and print the next 10 values of `x` according to the formula `x = r*x - d`.
<|EOT|>
