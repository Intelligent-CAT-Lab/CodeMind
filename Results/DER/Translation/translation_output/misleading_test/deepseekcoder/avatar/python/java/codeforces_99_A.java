<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
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

### Response:
Here is the Java version of the provided Python code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String num = scanner.nextLine();
        String[] splitNum = num.split("\\.");
        if (Integer.parseInt(String.valueOf(splitNum[0].charAt(splitNum[0].length() - 1))) == 9) {
            System.out.println("GOTO â Vasilisa");
        } else {
            if (Integer.parseInt(String.valueOf(splitNum[1].charAt(0))) >= 5) {
                System.out.println(Integer.parseInt(splitNum[0]) + 1);
            } else {
                System.out.println(splitNum[0]);
            }
        }
    }
}
```

This Java code reads a floating-point number as a string, splits it into two parts by the decimal point, and then checks the last digit of the integer part and the first digit of the fractional part. If the last digit of the integer part is 9, it prints "GOTO â Vasilisa". Otherwise, it prints the integer part plus 1 if the first digit of the fractional part is 5 or more, and the integer part otherwise.
<|EOT|>
