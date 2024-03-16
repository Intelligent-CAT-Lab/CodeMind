<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
Translate the following python code to java and enclose your solution inside ```java```:
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
                    System.exit(0);
                }
            }
        }
        System.out.println("No");
    }
}
```

This Java code does the same thing as the Python code. It reads an integer from the user, then checks if there are any values of `i` and `j` in the range 0 to 25 such that `4*i + 7*j` equals `N`. If such a pair is found, it prints "Yes" and exits. If no such pair is found after checking all possible pairs, it prints "No".<｜end▁of▁sentence｜>
