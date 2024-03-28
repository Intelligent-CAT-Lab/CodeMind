<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
5 3 2

Expected output:
2 4 1 5 3


```
n, a, b = [int(item) for item in input().split()]
if n < a + (b-1) or n > a + (b-1) * a:
    print(-1)
    exit()
for i in range(a):
    print(n - a + i + 1, end=" ")
n -= a
if n == 0:
    print("")
    exit()
loop = n // (b-1)
option = n % (b-1)
for j in range(b-1):
    if option > 0:
        for i in range(loop+1):
            print(n - loop - 1 + i + 1, end=" ")
        n -= loop + 1
        option -= 1
    else:
        for i in range(loop):
            print(n - loop + i + 1, end=" ")
        n -= loop
print("")
```

### Response:
Here is the Java version of the provided Python code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        if (n < a + (b-1) || n > a + (b-1) * a) {
            System.out.println(-1);
            System.exit(0);
        }
        for (int i = 0; i < a; i++) {
            System.out.print(n - a + i + 1 + " ");
        }
        n -= a;
        if (n == 0) {
            System.out.println();
            System.exit(0);
        }
        int loop = n / (b-1);
        int option = n % (b-1);
        for (int j = 0; j < b-1; j++) {
            if (option > 0) {
                for (int i = 0; i < loop+1; i++) {
                    System.out.print(n - loop - 1 + i + 1 + " ");
                }
                n -= loop + 1;
                option -= 1;
            } else {
                for (int i = 0; i < loop; i++) {
                    System.out.print(n - loop + i + 1 + " ");
                }
                n -= loop;
            }
        }
        System.out.println();
    }
}
```

This Java code does the same thing as the Python code. It reads three integers from the input, checks if they meet certain conditions, and then prints the sequence as per the conditions. If the conditions are not met, it prints -1 and exits.
<|EOT|>
