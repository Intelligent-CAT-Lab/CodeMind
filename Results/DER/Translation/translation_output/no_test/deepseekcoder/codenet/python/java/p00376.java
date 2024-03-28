<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following python code to java and enclose your solution inside ```java```:
```
a,b= map(int, input().split())
if a < b:
    print(b-a)
else:
    print(a-b)

```

### Response:
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        if (a < b) {
            System.out.println(b - a);
        } else {
            System.out.println(a - b);
        }
    }
}
```
<|EOT|>
