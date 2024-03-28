<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
1 2 3 1

Expected output:
-90

```
def main():
    A, B, C, K = map(int, input().split())
    if K&1 == 0:# å¶æ°
        print(A-B)
    else:
        print(B-A)

if __name__ == "__main__":
    main()
```

@@ Response
Here is the Java version of the provided Python code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int A = scanner.nextInt();
        int B = scanner.nextInt();
        int C = scanner.nextInt();
        int K = scanner.nextInt();
        scanner.close();

        if ((K & 1) == 0) {
            System.out.println(A - B);
        } else {
            System.out.println(B - A);
        }
    }
}
```

This Java code does the same thing as the Python code. It reads four integers from the standard input, and then checks if the last integer is even. If it is, it prints the difference between the first two integers. If it's not, it prints the difference between the second and first integers.<｜end▁of▁sentence｜>
