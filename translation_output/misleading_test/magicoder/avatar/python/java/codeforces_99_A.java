<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
8.3

Expected output:
-8

```
num = input ( ) . split ( " . " )
if int ( num [ 0 ] [ - 1 ] ) == 9 :
    print ( " GOTO â Vasilisa . " )
else :
    if int ( num [ 1 ] [ 0 ] ) >= 5 :
        print ( f " { int ( num [ 0 ] ) + 1 } " )
    else :
        print ( num [ 0 ] )


```

@@ Response
Here is the Java version of the given Python code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String num = scanner.nextLine();
        String[] parts = num.split("\\.");
        if (Integer.parseInt(parts[0].substring(parts[0].length() - 1)) == 9) {
            System.out.println("GOTO â Vasilisa");
        } else {
            if (Integer.parseInt(parts[1].substring(0, 1)) >= 5) {
                System.out.println(Integer.parseInt(parts[0]) + 1);
            } else {
                System.out.println(parts[0]);
            }
        }
    }
}
```

This Java code does the same thing as the Python code. It reads a floating-point number from the user, splits it into two parts (before and after the decimal point), and then checks the conditions specified in the Python code. If the conditions are met, it prints the corresponding output.<｜end▁of▁sentence｜>
