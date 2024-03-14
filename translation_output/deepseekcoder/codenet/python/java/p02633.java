<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following python code to java and enclose your solution inside ```java```:
```
x = int(input())

for i in range(1, 10**5):
    if 360 * i % x == 0:
        print(360 * i // x)
        break
```

### Response:
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();

        for (int i = 1; i < Math.pow(10, 5); i++) {
            if (360 * i % x == 0) {
                System.out.println(360 * i / x);
                break;
            }
        }
    }
}
```
<|EOT|>
