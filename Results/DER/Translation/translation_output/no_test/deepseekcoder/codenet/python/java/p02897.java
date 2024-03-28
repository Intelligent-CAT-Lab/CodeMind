<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following python code to java and enclose your solution inside ```java```:
```
N = int(input())
print(-(-N//2)/N)
```

### Response:
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        System.out.println((double)(-(-N/2))/N);
    }
}
```

This Java code does the same thing as the Python code. It reads an integer from the standard input, calculates the result of the expression ```-(-N//2)/N``` and prints the result. The ```//``` operator in Python is equivalent to the ```/``` operator in Java for integer division.
<|EOT|>
