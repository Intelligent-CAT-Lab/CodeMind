<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following python code to java and enclose your solution inside ```java```:
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

### Response:
Here is the Java equivalent of the given Python code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] num = scanner.nextLine().split("\\.");
        if (Integer.parseInt(String.valueOf(num[0].charAt(num[0].length() - 1))) == 9) {
            System.out.println("GOTO â Vasilisa");
        } else {
            if (Integer.parseInt(String.valueOf(num[1].charAt(0))) >= 5) {
                System.out.println(Integer.parseInt(num[0]) + 1);
            } else {
                System.out.println(num[0]);
            }
        }
    }
}
```

This Java code does the same thing as the Python code. It reads a line of input, splits it into two parts by the '.' character, and then checks the last digit of the first part and the first digit of the second part to determine what to print.
<|EOT|>
