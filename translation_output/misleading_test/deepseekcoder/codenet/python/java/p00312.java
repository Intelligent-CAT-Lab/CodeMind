<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
10 5

Expected output:
-21

```
D, L = map(int,input().split())
ans = int(D/L) + (D-L*int(D/L))
print(ans)

```

### Response:
Here is the Java version of the provided Python code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int D = scanner.nextInt();
        int L = scanner.nextInt();
        int ans = D/L + (D-L*(D/L));
        System.out.println(ans);
    }
}
```

This Java code reads two integers from the standard input, divides `D` by `L` and adds the result to the remainder of `D` divided by `L`. The result is then printed to the standard output.
<|EOT|>
