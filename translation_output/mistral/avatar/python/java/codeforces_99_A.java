<s> [INST] Translate the following python code to java and enclose your solution inside ```java```:
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
        String[] num = input.split(" . ");
        if (Integer.parseInt(num[0][num[0].length() - 1]) == 9) {
            System.out.println("GOTO ~\u203c Vasilisa . ");
        } else {
            if (Integer.parseInt(num[1][0]) >= 5) {
                System.out.println(Integer.parseInt(num[0]) + 1);
            } else {
                System.out.println(num[0]);
            }
        }
    }
}
```</s>
