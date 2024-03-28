<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
11

Expected output:
Yesz

```
N = int(input())
for i in range(25):
  for j in range(20):
    if 4*i + 7*j == N:
      print('Yes')
      exit()
print('No')
```

### Response:
Here is the Java version of the Python code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        for (int i = 0; i <= 25; i++) {
            for (int j = 0; j <= 20; j++) {
                if (4 * i + 7 * j == N) {
                    System.out.println("Yes");
                    System.exit(0);
                }
            }
        }
        System.out.println("No");
    }
}
```

This Java code does the same thing as the Python code. It reads an integer from the input, then checks if there are any `i` and `j` such that `4*i + 7*j` equals `N`. If such `i` and `j` exist, it prints "Yes" and exits. If not, it prints "No".
<|EOT|>
