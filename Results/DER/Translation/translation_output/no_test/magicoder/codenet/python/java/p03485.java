<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
Translate the following python code to java and enclose your solution inside ```java```:
```
a,b=map(int,input().split())
c = (a+b)/2
d = int(c)
if c-d>0:
  print(d+1)
else:
  print(d)
```

@@ Response
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        double c = (a + b) / 2.0;
        int d = (int) c;
        if (c - d > 0) {
            System.out.println(d + 1);
        } else {
            System.out.println(d);
        }
    }
}
```

In Java, we use the `Scanner` class to get input from the user. The `nextInt()` method is used to read an integer from the user. The `split()` method is not available in Java, so we use `nextInt()` twice to read two integers.

The division operation in Java is performed using the `/` operator, but it returns a double by default. So, we need to cast the result to an integer using `(int)`.

The `if` statement in Java is similar to the one in Python. The `>` operator is used to compare two values. The `println()` method is used to print output to the console.<｜end▁of▁sentence｜>
