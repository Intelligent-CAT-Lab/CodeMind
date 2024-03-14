<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following python code to java and enclose your solution inside ```java```:
```
a,b = map(int,input().split())

def round(a, b):
	if a * b < 0:
		return -(-a//b)
	else:
		return a//b

print(round(a, b))

```

### Response:
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        System.out.println(round(a, b));
    }

    public static int round(int a, int b) {
        if (a * b < 0) {
            return -(-a / b);
        } else {
            return a / b;
        }
    }
}
```
<|EOT|>
