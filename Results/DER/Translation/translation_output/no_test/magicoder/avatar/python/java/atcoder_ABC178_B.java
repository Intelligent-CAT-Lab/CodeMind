<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
Translate the following python code to java and enclose your solution inside ```java```:
```
a , b , c , d = map ( int , input ( ) . split ( ) )
ans = max ( a * c , a * d , b * c , b * d )
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
        int a = Integer.parseInt(input[0]);
        int b = Integer.parseInt(input[1]);
        int c = Integer.parseInt(input[2]);
        int d = Integer.parseInt(input[3]);
        int ans = Math.max(Math.max(a * c, a * d), Math.max(b * c, b * d));
        System.out.println(ans);
    }
}
```

This Java code does the same thing as the Python code. It reads four integers from the user, calculates the maximum of the products of two pairs of these integers, and then prints the result.<｜end▁of▁sentence｜>
