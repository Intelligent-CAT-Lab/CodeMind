<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
111

Expected output:
111


```
N=int(input())
X=P=0
for i in range(10) :
  P=i*111
  if X < N and N <= P :
    print(P)
  X=P
    
```

@@ Response
Here is the Java version of the given Python code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int X = 0;
        int P = 0;
        for (int i = 0; i < 10; i++) {
            P = i * 111;
            if (X < N && N <= P) {
                System.out.println(P);
            }
            X = P;
        }
    }
}
```

This Java code does the same thing as the Python code. It reads an integer from the standard input, then iterates over the numbers 0 to 9, multiplying each by 111. If the current number is greater than or equal to the input number and less than the next number, it prints the current number. The current number is then assigned to `X`.<｜end▁of▁sentence｜>
