<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
Translate the following python code to java and enclose your solution inside ```java```:
```
A , B , T = map ( int , input ( ) . split ( ) )
ans = ( T // A ) * B
print ( ans )


```

@@ Response
Here is the Java equivalent of the given Python code:

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

This Java code does the same thing as the Python code. It reads three integers from the user, calculates the result, and then prints it. The `split(" ")` method is used to split the input string into an array of strings, where each string is a number. The `Integer.parseInt()` method is used to convert each string into an integer. The `//` operator is used for integer division in Java.<｜end▁of▁sentence｜>
