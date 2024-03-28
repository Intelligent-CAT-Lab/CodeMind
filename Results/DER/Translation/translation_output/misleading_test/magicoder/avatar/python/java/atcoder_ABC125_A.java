<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
20 20 19

Expected output:
67

```
A , B , T = map ( int , input ( ) . split ( ) )
ans = ( T // A ) * B
print ( ans )


```

@@ Response
Here is the Java version of the given Python code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split(" ");
        int A = Integer.parseInt(input[0]);
        int B = Integer.parseInt(input[1]);
        int T = Integer.parseInt(input[2]);
        int ans = (T / A) * B;
        System.out.println(ans);
    }
}
```

This Java code does the same thing as the Python code. It reads three integers from the user, calculates the result as `(T // A) * B`, and then prints the result. The `//` operator in Python is equivalent to `/` in Java, but it performs integer division, which rounds down to the nearest whole number.<｜end▁of▁sentence｜>
