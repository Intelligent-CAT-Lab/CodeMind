<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
Translate the following python code to java and enclose your solution inside ```java```:
```
a , b = input ( ) . split ( ) ; b = int ( b [ : : - 1 ] ) ; print ( int ( a ) + b )


```

@@ Response
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split(" ");
        String reversedB = new StringBuilder(input[1]).reverse().toString();
        int b = Integer.parseInt(reversedB);
        int sum = Integer.parseInt(input[0]) + b;
        System.out.println(sum);
    }
}
```

This Java code does the same thing as the Python code you provided. It reads two space-separated values from the user, reverses the second value, converts it to an integer, and then adds the first value to the reversed second value. The result is then printed to the console.<｜end▁of▁sentence｜>
