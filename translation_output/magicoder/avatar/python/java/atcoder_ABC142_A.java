<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
Translate the following python code to java and enclose your solution inside ```java```:
```
N = int ( input ( ) )
if N % 2 == 0 :
    print ( 0.5 )
else :
    print ( ( N + 1 ) / N / 2 )


```

@@ Response
Here is the Java version of the given Python code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        if (N % 2 == 0) {
            System.out.println(0.5);
        } else {
            System.out.println((N + 1) / (double) N / 2);
        }
    }
}
```

This Java code does the same thing as the Python code. It reads an integer from the user, checks if it's even, and then prints either 0.5 or the result of the calculation `(N + 1) / N / 2`. The `(double) N` is used to ensure that the division operation results in a double, not an integer.<｜end▁of▁sentence｜>
