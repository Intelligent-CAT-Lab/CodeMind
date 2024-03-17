<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
11

Expected output:
Yes


```
N = int(input())
for i in range(25):
  for j in range(20):
    if 4*i + 7*j == N:
      print('Yes')
      exit()
print('No')
```

@@ Response
Here is the Java version of the given Python code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        scanner.close();

        for (int i = 0; i <= 25; i++) {
            for (int j = 0; j <= 20; j++) {
                if (4 * i + 7 * j == N) {
                    System.out.println("Yes");
                    return;
                }
            }
        }
        System.out.println("No");
    }
}
```

This Java code does the same thing as the Python code. It reads an integer from the standard input, then checks all possible combinations of `i` and `j` in the range of 0 to 25 and 0 to 20. If it finds a combination that satisfies the equation `4*i + 7*j == N`, it prints "Yes" and exits. If it doesn't find any such combination, it prints "No".<｜end▁of▁sentence｜>
