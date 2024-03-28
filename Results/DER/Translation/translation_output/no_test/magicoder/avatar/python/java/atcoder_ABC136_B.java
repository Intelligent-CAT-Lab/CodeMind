<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
Translate the following python code to java and enclose your solution inside ```java```:
```
n = int ( input ( ) )
cnt = 0
for i in range ( 1 , n + 1 ) :
    s = str ( i )
    if len ( s ) % 2 == 1 :
        cnt += 1
print ( cnt )


```

@@ Response
Here is the Java version of the given Python code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int cnt = 0;
        for (int i = 1; i <= n; i++) {
            String s = String.valueOf(i);
            if (s.length() % 2 == 1) {
                cnt++;
            }
        }
        System.out.println(cnt);
    }
}
```

This Java code does the same thing as the Python code. It reads an integer from the user, then counts the number of integers from 1 to n (inclusive) that have an odd number of digits. The count is then printed out.<｜end▁of▁sentence｜>
