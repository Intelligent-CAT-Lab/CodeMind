<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
Translate the following python code to java and enclose your solution inside ```java```:
```
a , b = input ( ) . split ( )
b = b [ 0 ] + b [ 2 : ]
a = int ( a )
b = int ( b )
print ( a * b // 100 )


```

@@ Response
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split(" ");
        String b = input[0].charAt(0) + input[0].substring(2);
        int a = Integer.parseInt(input[1]);
        int result = (Integer.parseInt(b) * a) / 100;
        System.out.println(result);
    }
}
```

This Java code does the same thing as the Python code you provided. It reads two space-separated integers from the user, manipulates the first one to remove the middle digit, and then calculates the product of the two numbers, divides it by 100, and prints the result.<｜end▁of▁sentence｜>
