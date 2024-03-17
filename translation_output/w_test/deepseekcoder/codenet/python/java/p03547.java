<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
A B

Expected output:
<


```
A=int(10)
B=int(11)
C=int(12)
D=int(13)
E=int(14)
F=int(15)

N,M=input().split()
if N>M:
  print(">") 
elif N==M:
  print("=")
else:
  print("<")

```

### Response:
Here is the Java version of the provided Python code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int A = 10;
        int B = 11;
        int C = 12;
        int D = 13;
        int E = 14;
        int F = 15;

        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split(" ");
        String N = input[0];
        String M = input[1];

        if (N.compareTo(M) > 0) {
            System.out.println(">");
        } else if (N.equals(M)) {
            System.out.println("=");
        } else {
            System.out.println("<");
        }
    }
}
```

This Java code does the same thing as the Python code. It reads two strings N and M from the input, compares them, and prints ">" if N is greater, "=" if they are equal, and "<" if N is less. The `compareTo` method is used to compare strings in Java, which returns a positive number if the first string is greater, zero if they are equal, and a negative number if the first string is less.
<|EOT|>
