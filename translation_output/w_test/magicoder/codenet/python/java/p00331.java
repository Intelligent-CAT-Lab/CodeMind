<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
-3 3

Expected output:
0


```
H,R = map(int,input().split())

if H>=0:
    print(1)
elif  H<0:
    if H+R>0:
        print(1)
    elif H+R==0:
        print(0)
    else:
        print(-1)
        


```

@@ Response
Here is the Java version of the given Python code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int H = scanner.nextInt();
        int R = scanner.nextInt();

        if (H >= 0) {
            System.out.println(1);
        } else if (H < 0) {
            if (H + R > 0) {
                System.out.println(1);
            } else if (H + R == 0) {
                System.out.println(0);
            } else {
                System.out.println(-1);
            }
        }
    }
}
```

This Java code reads two integers from the standard input (System.in), assigns them to the variables H and R respectively, and then checks the conditions as in the Python code. The result is printed to the standard output (System.out).<｜end▁of▁sentence｜>
