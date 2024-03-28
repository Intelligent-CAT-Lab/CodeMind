<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following python code to java and enclose your solution inside ```java```:
```
a,b,c = map(int, input().split())
print('win' if a+b+c<22 else 'bust')
```

### Response:
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        if (a + b + c < 22) {
            System.out.println("win");
        } else {
            System.out.println("bust");
        }
    }
}
```
<|EOT|>
