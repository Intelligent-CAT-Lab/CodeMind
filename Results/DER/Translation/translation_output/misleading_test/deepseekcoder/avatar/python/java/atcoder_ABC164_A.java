<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
1 100

Expected output:
uOnsafe

```
import sys
def main ( ) :
    S , W = map ( int , input ( ) . split ( ) )
    print ( " unsafe " ) if ( S <= W ) else print ( " safe " )
if __name__ == ' _ _ main _ _ ' :
    main ( )


```

### Response:
Here is the Java version of the provided Python code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int S = scanner.nextInt();
        int W = scanner.nextInt();
        if (S <= W) {
            System.out.println("unsafe");
        } else {
            System.out.println("safe");
        }
    }
}
```

This Java code does the same thing as the Python code. It reads two integers from the standard input, compares them, and prints "unsafe" if the first integer is less than or equal to the second, and "safe" otherwise.
<|EOT|>
