<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
501719768609305159 370614275896614890 131105492712690269

Expected output:
370614275896614890


```
N , A , B = map ( int , input ( ) . split ( ) )
ans = N // ( A + B ) * A
rem = N % ( A + B )
ans += min ( rem , A )
print ( ans )


```

### Response:
Here is the Java version of the Python code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long N = scanner.nextLong();
        long A = scanner.nextLong();
        long B = scanner.nextLong();
        long ans = N / (A + B) * A;
        long rem = N % (A + B);
        ans += Math.min(rem, A);
        System.out.println(ans);
    }
}
```

This Java code does the same thing as the Python code. It reads three long integers from the input, calculates the answer and prints it. The ```//``` operator in Python is equivalent to the ```/``` operator in Java for integer division, and the ```%``` operator is equivalent to the ```%``` operator in Java for modulus. The ```Math.min()``` function in Java is equivalent to the ```min()``` function in Python.
<|EOT|>
