<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following python code to java and enclose your solution inside ```java```:
```
import math
x = int(input())

y = 100
ans = 0
while y < x:
    ans += 1
    y = math.floor(y*1.01)

print(ans)
```

### Response:
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();

        int y = 100;
        int ans = 0;
        while (y < x) {
            ans += 1;
            y = (int)Math.floor(y*1.01);
        }

        System.out.println(ans);
    }
}
```
<|EOT|>
