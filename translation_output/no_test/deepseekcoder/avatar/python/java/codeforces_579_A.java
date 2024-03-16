<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following python code to java and enclose your solution inside ```java```:
```
import math
n = int ( input ( ) )
x = 1
while math . log2 ( n ) % 1 :
    x += 1
    n -= 2 ** ( int ( math . log2 ( n ) ) )
print ( x )


```

### Response:
Here is the Java version of your Python code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int x = 0;
        while (n != 0) {
            n >>= 1;
            x++;
        }
        System.out.println(x);
    }
}
```

This Java code does the same thing as your Python code. It reads an integer from the input, then counts how many times you can subtract a power of 2 from the number before it becomes zero. The ```>>=``` operator in Java is equivalent to the ```//=``` operator in Python, which performs integer division.
<|EOT|>
