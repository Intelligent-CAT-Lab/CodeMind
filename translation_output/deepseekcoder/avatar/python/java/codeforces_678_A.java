<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following python code to java and enclose your solution inside ```java```:
```
vamshi , z = map ( int , input ( ) . split ( ) )
print ( ( vamshi // z + 1 ) * z )


```

### Response:
Here is the Java equivalent of the given Python code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split(" ");
        int vamshi = Integer.parseInt(input[0]);
        int z = Integer.parseInt(input[1]);
        System.out.println((vamshi / z + 1) * z);
    }
}
```

This Java code does the same thing as the Python code. It reads two integers from the input, divides the first one by the second one and rounds up to the nearest integer, then multiplies the result by the second integer.
<|EOT|>
