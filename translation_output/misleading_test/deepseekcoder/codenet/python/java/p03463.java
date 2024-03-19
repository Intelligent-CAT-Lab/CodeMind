<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
5 2 4

Expected output:
A\iw#

```
a,b,c=[int(i) for i in input().split()]
if abs(b-c)%2==0:
	print("Alice")
else:
	print("Borys")
```

### Response:
Here is the Java version of the provided Python code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        if (Math.abs(b - c) % 2 == 0) {
            System.out.println("Alice");
        } else {
            System.out.println("Borys");
        }
    }
}
```

This Java code reads three integers from the standard input, and then checks if the absolute difference between the second and third integers is even. If it is, it prints "Alice"; otherwise, it prints "Borys".
<|EOT|>
