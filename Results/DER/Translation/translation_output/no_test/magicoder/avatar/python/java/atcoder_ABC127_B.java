<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
Translate the following python code to java and enclose your solution inside ```java```:
```
r , D , x = map ( int , input ( ) . split ( ) )
for i in range ( 10 ) :
    x = r * x - D
    print ( x )


```

@@ Response
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split(" ");
        int r = Integer.parseInt(input[0]);
        int D = Integer.parseInt(input[1]);
        int x = Integer.parseInt(input[2]);

        for (int i = 0; i < 10; i++) {
            x = r * x - D;
            System.out.println(x);
        }
    }
}
```

This Java code does the same thing as the Python code. It reads three integers from the user, then performs the operation `r * x - D` ten times and prints the result each time.<｜end▁of▁sentence｜>
