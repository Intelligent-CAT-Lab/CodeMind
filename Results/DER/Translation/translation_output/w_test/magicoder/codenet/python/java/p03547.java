<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
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

@@ Response
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
        } else if (N.compareTo(M) == 0) {
            System.out.println("=");
        } else {
            System.out.println("<");
        }
    }
}
```

In the Java code, we first declare the variables A, B, C, D, E, and F with the same values as in the Python code. Then we use the `Scanner` class to read the input from the user. The input is split into two parts using the `split` method, and the comparison is made using the `compareTo` method of the `String` class. The result is printed to the console.<｜end▁of▁sentence｜>
