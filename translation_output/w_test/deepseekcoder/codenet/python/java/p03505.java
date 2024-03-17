<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
4000 2000 500

Expected output:
5


```
K, A, B = map(int, input().split())
if A <= B and K > A:
    print(-1)
elif A >= K:
    print(1)
else:
    print(1 - int(- (K-A) // (A-B))*2)
```

### Response:
Here is the Java version of the Python code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int K = scanner.nextInt();
        int A = scanner.nextInt();
        int B = scanner.nextInt();

        if (A <= B && K > A) {
            System.out.println(-1);
        } else if (A >= K) {
            System.out.println(1);
        } else {
            System.out.println(1 - (int) (- (K-A) / (A-B))*2);
        }
    }
}
```

This Java code reads three integers from the standard input, and then prints the result of the Python code. The `Scanner` class is used to read the input, and the `System.out.println` method is used to print the output. The Python `//` operator is replaced with the `/` operator in Java, and the `-` operator is used to perform subtraction and division. The `(int)` cast is used to convert the result to an integer.
<|EOT|>
