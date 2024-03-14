<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following python code to java and enclose your solution inside ```java```:
```
l=input().split()
A=int(l[0])
B=int(l[1])
kimawasi=B//A
if B%A>0:
    kimawasi=kimawasi+1
print(kimawasi)

```

### Response:
Here is the Java equivalent of the Python code you provided:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] l = scanner.nextLine().split(" ");
        int A = Integer.parseInt(l[0]);
        int B = Integer.parseInt(l[1]);
        int kimawasi = B / A;
        if (B % A > 0) {
            kimawasi = kimawasi + 1;
        }
        System.out.println(kimawasi);
    }
}
```

This Java code does the same thing as your Python code. It reads two integers from the input, calculates the integer division of B by A and prints the result. If there is a remainder from the division, it adds 1 to the result.
<|EOT|>
