<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
-3 3

Expected output:
-60

```
H,R = map(int,input().split())

if H>=0:
    print(1)
elif  H<0:
    if H+R>0:
        print(1)
    elif H+R==0:
        print(0)
    else:
        print(-1)
        


```

### Response:
Here is the Java version of the provided Python code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int H = scanner.nextInt();
        int R = scanner.nextInt();

        if (H >= 0) {
            System.out.println(1);
        } else if (H < 0) {
            if (H + R > 0) {
                System.out.println(1);
            } else if (H + R == 0) {
                System.out.println(0);
            } else {
                System.out.println(-1);
            }
        }
    }
}
```

This Java code reads two integers from the standard input, `H` and `R`, and then prints `1` if `H` is greater than or equal to `0`. If `H` is less than `0`, it checks if `H + R` is greater than `0`, equal to `0`, or less than `0` and prints the corresponding result.
<|EOT|>
