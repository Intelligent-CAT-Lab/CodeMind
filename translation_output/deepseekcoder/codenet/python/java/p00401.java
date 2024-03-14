<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following python code to java and enclose your solution inside ```java```:
```
N = int(input())
count = 1
while count <= N:
    count *= 2
print(round(count/2))

```

### Response:
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int count = 1;
        while (count <= N) {
            count *= 2;
        }
        System.out.println(count / 2);
    }
}
```

This Java code does the same thing as the Python code. It reads an integer from the standard input, initializes a counter to 1, and then multiplies the counter by 2 in a loop until it is greater than the input number. Finally, it prints the counter divided by 2.
<|EOT|>
