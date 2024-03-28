<s> [INST] Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
1 1 1 1000000000

Expected output:
1000000018

```
def GCD ( a , b ) :
    while a % b != 0 :
        a , b = b , a % b
    return b
def LCM ( a , b ) :
    return a * b // GCD ( a , b )
l = input ( ) . split ( ' â ' )
x , y , a , b = int ( l [ 0 ] ) , int ( l [ 1 ] ) , int ( l [ 2 ] ) , int ( l [ 3 ] )
lcm = LCM ( x , y )
print ( b // lcm - ( a - 1 ) // lcm )


```
[/INST]
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String[] split = input.split(" ");
        int x = Integer.parseInt(split[0]);
        int y = Integer.parseInt(split[1]);
        int a = Integer.parseInt(split[2]);
        int b = Integer.parseInt(split[3]);
        int lcm = findLCM(x, y);
        int result = (b - a + 1) / lcm;
        System.out.println(result);
    }

    public static int findLCM(int x, int y) {
        while (x % y != 0) {
            int temp = x;
            x = y;
            y = temp % y;
        }
        return y;
    }
}
```</s>
