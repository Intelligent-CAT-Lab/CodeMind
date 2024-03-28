<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
20 20 19

Expected output:
0


```
A , B , T = map ( int , input ( ) . split ( ) )
ans = ( T // A ) * B
print ( ans )


```

### Response:
Here is the Java version of the Python code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int A = scanner.nextInt();
        int B = scanner.nextInt();
        int T = scanner.nextInt();
        int ans = (T / A) * B;
        System.out.println(ans);
    }
}
```

This Java code does the same thing as the Python code. It reads three integers from the input, calculates `(T // A) * B`, and prints the result. The `//` operator in Python is equivalent to the `/` operator in Java for integer division.
<|EOT|>
