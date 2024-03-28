<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
0011

Expected output:
4


```
A = list(input())
N = len(A)

C0 = A.count("0")
C1 = A.count("1")

print(2 * min(C0, C1))

```

@@ Response
Here is the Java version of the given Python code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String A = scanner.nextLine();
        int N = A.length();

        int C0 = 0;
        int C1 = 0;

        for (int i = 0; i < N; i++) {
            if (A.charAt(i) == '0') {
                C0++;
            } else if (A.charAt(i) == '1') {
                C1++;
            }
        }

        System.out.println(2 * Math.min(C0, C1));
    }
}
```

This Java code does the same thing as the Python code. It reads a string from the user, counts the number of '0's and '1's, and then prints the minimum of these two counts multiplied by 2.<｜end▁of▁sentence｜>
