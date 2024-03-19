<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
1 100

Expected output:
uOnsafe

```
import sys
def main ( ) :
    S , W = map ( int , input ( ) . split ( ) )
    print ( " unsafe " ) if ( S <= W ) else print ( " safe " )
if __name__ == ' _ _ main _ _ ' :
    main ( )


```

@@ Response
Here is the Java version of the provided Python code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int S = scanner.nextInt();
        int W = scanner.nextInt();
        if (S <= W) {
            System.out.println("unsafe");
        } else {
            System.out.println("safe");
        }
    }
}
```

You can test this code with the following test input:

```
1 100
```

And it will output:

```
unsafe
```<｜end▁of▁sentence｜>
