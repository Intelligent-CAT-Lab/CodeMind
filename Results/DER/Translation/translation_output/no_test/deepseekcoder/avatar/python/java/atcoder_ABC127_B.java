<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following python code to java and enclose your solution inside ```java```:
```
r , D , x = map ( int , input ( ) . split ( ) )
for i in range ( 10 ) :
    x = r * x - D
    print ( x )


```

### Response:
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] inputs = scanner.nextLine().split(" ");
        int r = Integer.parseInt(inputs[0]);
        int D = Integer.parseInt(inputs[1]);
        int x = Integer.parseInt(inputs[2]);

        for (int i = 0; i < 10; i++) {
            x = r * x - D;
            System.out.println(x);
        }
    }
}
```

This Java code does the same thing as the Python code. It reads three integers from the input, then for each of the next 10 iterations, it calculates `x = r * x - D` and prints the result.
<|EOT|>
