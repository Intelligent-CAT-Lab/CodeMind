<s> [INST] Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
45 99

Expected output:
45 27


```
x = list ( input ( ) . split ( ) )
for i in range ( len ( x ) ) :
    x [ i ] = int ( x [ i ] )
a = x [ 0 ]
b = x [ 1 ]
print ( min ( x ) , end = " â " )
if abs ( a - b ) >= 2 :
    print ( abs ( a - b ) // 2 )
else :
    print ( 0 )


```
[/INST]
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String[] x = input.split(" ");
        int a = Integer.parseInt(x[0]);
        int b = Integer.parseInt(x[1]);
        int min = Integer.MIN_VALUE;
        for (int i = 2; i < x.length; i++) {
            int temp = Integer.parseInt(x[i]);
            if (temp < min) {
                min = temp;
            }
        }
        if (Math.abs(a - b) >= 2) {
            System.out.println(Math.abs(a - b) / 2);
        } else {
            System.out.println(0);
        }
    }
}
```</s>
