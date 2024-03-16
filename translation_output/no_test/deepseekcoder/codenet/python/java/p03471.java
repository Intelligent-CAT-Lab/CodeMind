<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following python code to java and enclose your solution inside ```java```:
```
n,y=map(int,input().split())
for i in range(n+1):
    for j in range(n-i+1):
        if (y-(i*10000+j*5000))/1000==(n-i-j):
            print(str(i)+' '+str(j)+' '+str(n-i-j))
            exit()
print('-1 -1 -1')
```

### Response:
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int y = scanner.nextInt();
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

This Java code does the same thing as the Python code. It reads two integers from the input, then iterates over possible values of `i` and `j`, checking if the condition `(y - (i * 10000 + j * 5000)) / 1000 == (n - i - j)` is met. If it is, it prints the values of `i`, `j`, and `n - i - j` and exits. If no such values are found, it prints `-1 -1 -1`.
<|EOT|>
