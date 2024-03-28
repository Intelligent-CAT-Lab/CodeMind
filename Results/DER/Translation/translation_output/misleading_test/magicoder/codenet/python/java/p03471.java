<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
9 45000

Expected output:
4 0 5 -6

```
n,y=map(int,input().split())
for i in range(n+1):
    for j in range(n-i+1):
        if (y-(i*10000+j*5000))/1000==(n-i-j):
            print(str(i)+' '+str(j)+' '+str(n-i-j))
            exit()
print('-1 -1 -1')
```

@@ Response
Here is the Java version of the given Python code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int y = scanner.nextInt();
        scanner.close();

        for (int i = 0; i <= n; i++) {
            for (int j = 0; j <= n - i; j++) {
                if ((y - (i * 10000 + j * 5000)) / 1000 == (n - i - j)) {
                    System.out.println(i + " " + j + " " + (n - i - j));
                    System.exit(0);
                }
            }
        }
        System.out.println("-1 -1 -1");
    }
}
```

This Java code does the same thing as the Python code. It reads two integers from the standard input, then iterates over all possible combinations of i and j, and checks if the condition in the if statement is satisfied. If it is, it prints the values of i, j, and n-i-j, and then exits the program. If no such combination is found, it prints "-1 -1 -1".<｜end▁of▁sentence｜>
