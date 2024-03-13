<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
Translate the following python code to java and enclose your solution inside ```java```:
```
import math
h , a = map ( int , input ( ) . split ( ) )
print ( math . ceil ( h / a ) )


```

@@ Response
```java
import java.util.Scanner;
import java.lang.Math;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split(" ");
        int h = Integer.parseInt(input[0]);
        int a = Integer.parseInt(input[1]);
        System.out.println((int) Math.ceil((double) h / a));
    }
}
```<｜end▁of▁sentence｜>
