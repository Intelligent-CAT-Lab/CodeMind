<s> [INST] <<SYS>>
You are an expert java programmer and assistant
<</SYS>>

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
[/INST]
```java
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String[] num = input.split("\\.");
        if (Integer.parseInt(num[0].charAt(num[0].length() - 1)) == 9) {
            System.out.println("GOTO Vasilisa");
        } else {
            if (Integer.parseInt(num[1].charAt(0)) >= 5) {
                System.out.println(Integer.parseInt(num[0]) + 1);
            } else {
                System.out.println(num[0]);
            }
        }
    }
}
```
This code first splits the input string into two parts using the `split()` method, with the delimiter being a dot (`.`). It then checks the last character of the first part of the split string, which is the first number in the input. If the last character is `9`, it prints `GOTO Vasilisa`. Otherwise, it checks the first character of the second part of the split string, which is the second number in the input. If the first character is greater than or equal to `5`, it prints the sum of the first number and `1`. Otherwise, it prints the first number.</s>
