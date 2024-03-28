<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
512

Expected output:
YES

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

You can test this code with the following test input:

```
512
```

And it should output:

```
YES
```<｜end▁of▁sentence｜>
