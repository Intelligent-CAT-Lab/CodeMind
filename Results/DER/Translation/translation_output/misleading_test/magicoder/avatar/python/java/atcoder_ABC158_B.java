<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
501719768609305159 370614275896614890 131105492712690269

Expected output:
370614275896614935

```
N , A , B = map ( int , input ( ) . split ( ) )
ans = N // ( A + B ) * A
rem = N % ( A + B )
ans += min ( rem , A )
print ( ans )


```

@@ Response
Here is the Java version of the given Python code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long N = scanner.nextLong();
        long A = scanner.nextLong();
        long B = scanner.nextLong();
        scanner.close();

        long ans = N / (A + B) * A;
        long rem = N % (A + B);
        ans += Math.min(rem, A);

        System.out.println(ans);
    }
}
```

This Java code reads three long integers from the standard input, calculates the result as per the given Python code, and then prints the result. The `Scanner` class is used to read the input from the standard input. The `Math.min` function is used to find the minimum of two numbers.<｜end▁of▁sentence｜>
