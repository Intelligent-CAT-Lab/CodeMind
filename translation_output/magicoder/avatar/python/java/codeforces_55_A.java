<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
Translate the following python code to java and enclose your solution inside ```java```:
```
n = int ( input ( ) )
while n % 2 == 0 :
    n /= 2
if n == 1 :
    print ( ' YES ' )
else :
    print ( ' NO ' )


```

@@ Response
Here is the Java version of the given Python code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        while (n % 2 == 0) {
            n /= 2;
        }
        if (n == 1) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
```

This Java code does the same thing as the Python code. It reads an integer from the user, then repeatedly divides it by 2 as long as it's even. If the final value of `n` is 1, it prints "YES". Otherwise, it prints "NO".<｜end▁of▁sentence｜>
