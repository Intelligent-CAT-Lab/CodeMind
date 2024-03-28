<s> [INST] Translate the following python code to java and enclose your solution inside ```java```.
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

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String[] nums = input.split("\\s+");
        int num = Integer.parseInt(nums[0]);
        if (num == 9) {
            System.out.println("GOTO  Vasilisa . ");
        } else {
            int secondNum = Integer.parseInt(nums[1]);
            if (secondNum >= 5) {
                System.out.println(num + 1);
            } else {
                System.out.println(num);
            }
        }
    }
}
```</s>
