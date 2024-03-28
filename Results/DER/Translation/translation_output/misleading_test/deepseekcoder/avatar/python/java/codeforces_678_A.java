<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
999999999 1

Expected output:
1000000003

```
vamshi , z = map ( int , input ( ) . split ( ) )
print ( ( vamshi // z + 1 ) * z )


```

### Response:
Here is the Java version of the provided Python code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long vamshi = scanner.nextLong();
        long z = scanner.nextLong();
        System.out.println((vamshi / z + 1) * z);
    }
}
```

This Java code reads two long integers from the input, calculates the result as per the provided Python code, and prints the result.
<|EOT|>
