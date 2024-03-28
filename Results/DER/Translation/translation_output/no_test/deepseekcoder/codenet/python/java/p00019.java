<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following python code to java and enclose your solution inside ```java```:
```
n = int(input())
k = 1
for j in range(1,n+1):
    k *= j
print(k)

```

### Response:
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = 1;
        for (int j = 1; j <= n; j++) {
            k *= j;
        }
        System.out.println(k);
    }
}
```
<|EOT|>
