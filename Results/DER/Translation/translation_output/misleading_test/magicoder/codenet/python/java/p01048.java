<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
1

Expected output:
51

```
N = int(input())
target = 1
while True:
    count = 0
    for i in range(1, target+1):
        if target % i == 0:
            count += 1
    if count == N:
        print(target)
        break
    target += 1


```

@@ Response
Here is the Java version of the Python code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int target = 1;
        while (true) {
            int count = 0;
            for (int i = 1; i <= target; i++) {
                if (target % i == 0) {
                    count++;
                }
            }
            if (count == N) {
                System.out.println(target);
                break;
            }
            target++;
        }
    }
}
```

This Java code does the same thing as the Python code. It reads an integer `N` from the standard input, then it starts a loop that increments `target` until it finds a number that has `N` divisors. When it finds such a number, it prints it and breaks the loop.<｜end▁of▁sentence｜>
