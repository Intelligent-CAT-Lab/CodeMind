<s> [INST] Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
STOP

Expected output:
N<

```
s = sorted ( input ( ) )
if s [ 0 ] == s [ 1 ] and s [ 2 ] == s [ 3 ] and s [ 0 ] != s [ 2 ] : print ( ' Yes ' )
else : print ( ' No ' )


```
[/INST]
```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String[] arr = s.split(" ");
        if (arr[0].equals(arr[1]) && arr[2].equals(arr[3]) && !arr[0].equals(arr[2])) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
```</s>
