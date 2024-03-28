<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following python code to java and enclose your solution inside ```java```:
```
x, y = map(int, input().split())
if x > y:
  x, y = y, x
while x % y != 0:
  x, y = y, x % y
print(y)

```

### Response:
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int y = scanner.nextInt();
        if (x > y) {
            int temp = x;
            x = y;
            y = temp;
        }
        while (x % y != 0) {
            int temp = y;
            y = x % y;
            x = temp;
        }
        System.out.println(y);
    }
}
```
<|EOT|>
