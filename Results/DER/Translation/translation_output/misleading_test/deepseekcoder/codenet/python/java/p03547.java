<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
A B

Expected output:


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
Here is the Java version of the Python code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Define the constants
        final int A = 10;
        final int B = 11;
        final int C = 12;
        final int D = 13;
        final int E = 14;
        final int F = 15;

        // Read input
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split(" ");
        String N = input[0];
        String M = input[1];

        // Compare and print result
        if (N.compareTo(M) > 0) {
            System.out.println(">");
        } else if (N.compareTo(M) == 0) {
            System.out.println("=");
        } else {
            System.out.println("<");
        }
    }
}
```

This Java code does the same thing as the Python code. It reads two strings N and M from the input, compares them, and prints ">" if N is greater, "=" if they are equal, and "<" if N is less. The comparison is done using the `compareTo` method of the String class, which returns a negative integer, zero, or a positive integer as the first string is less than, equal to, or greater than the second.
<|EOT|>
