<s> [INST] Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
1000000000000 1000000000000 1000000000000

Expected output:
-28 999999999909

```
number = input ( )
a , b , k = [ int ( ele ) for ele in number . split ( ' â ' ) ]
res = a - k
if res < 0 :
    a = 0
    b = b + res
    b = 0 if b < 0 else b
else :
    a = res
print ( a , b )


```
[/INST]
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String[] split = input.split(" ");
        int a = Integer.parseInt(split[0]);
        int b = Integer.parseInt(split[1]);
        int k = Integer.parseInt(split[2]);
        int res = a - k;
        if (res < 0) {
            a = 0;
            b = b + res;
            b = 0 if (b < 0) else b;
        } else {
            a = res;
        }
        System.out.println(a + " " + b);
    }
}
```</s>
