<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following python code to java and enclose your solution inside ```java```:
```
r,b,w,g = map(int,input().split())
print(r+b+w+g)

```

### Response:
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int r = scanner.nextInt();
        int b = scanner.nextInt();
        int w = scanner.nextInt();
        int g = scanner.nextInt();
        System.out.println(r + b + w + g);
    }
}
```
<|EOT|>
