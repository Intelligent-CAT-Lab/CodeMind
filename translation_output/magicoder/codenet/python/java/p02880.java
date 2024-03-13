<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
Translate the following python code to java and enclose your solution inside ```java```:
```
N=int(input())
for i in range(1,10):
    for j in range(1,10):
        if(i*j==N):
            print('Yes')
            exit()
print('No')
```

@@ Response
Here is the Java version of the Python code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        scanner.close();
        for (int i = 1; i < 10; i++) {
            for (int j = 1; j < 10; j++) {
                if (i * j == N) {
                    System.out.println("Yes");
                    System.exit(0);
                }
            }
        }
        System.out.println("No");
    }
}
```

This Java code does the same thing as the Python code. It reads an integer from the user, then checks if there exists two numbers in the range 1 to 9 (inclusive) such that their product equals the input number. If such a pair is found, it prints "Yes" and exits. If no such pair is found after checking all possible pairs, it prints "No".<｜end▁of▁sentence｜>
