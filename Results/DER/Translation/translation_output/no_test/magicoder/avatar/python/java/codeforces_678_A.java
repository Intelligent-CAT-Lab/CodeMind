<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
Translate the following python code to java and enclose your solution inside ```java```:
```
vamshi , z = map ( int , input ( ) . split ( ) )
print ( ( vamshi // z + 1 ) * z )


```

@@ Response
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

This Java code does the same thing as the Python code. It reads two integers from the user, divides the first one by the second one, adds 1 to the result, and then multiplies the result by the second integer. The result is then printed to the console.<｜end▁of▁sentence｜>
