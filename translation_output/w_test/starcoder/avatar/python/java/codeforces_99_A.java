<fim_prefix>Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
8.3

Expected output:
8

```
num = input ( ). split ( ". " )
if int ( num [ 0 ] [ - 1 ] ) == 9 :
    print ( " GOTO â Vasilisa. " )
else :
    if int ( num [ 1 ] [ 0 ] ) >= 5 :
        print ( f " { int ( num [ 0 ] ) + 1 } " )
    else :
        print ( num [ 0 ] )


```

java code:<fim_suffix><fim_middle>
```java
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] num = sc.next().split(".");
        if (Integer.parseInt(num[0].substring(num[0].length() - 1)) == 9) {
            System.out.println("GOTO Vasilisa.");
        } else {
            if (Integer.parseInt(num[1].substring(0, 1)) >= 5) {
                System.out.println(Integer.parseInt(num[0]) + 1);
            } else {
                System.out.println(num[0]);
            }
        }
    }
}
```

'''
<|endoftext|>
