<s> [INST] <<SYS>>
You are an expert java programmer and assistant
<</SYS>>

Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
1 20

Expected output:
Ciel


```
x , y = map ( int , input ( ) . split ( ) )
CielWon = False
while ( y > 1 and x * 10 + y > 21 ) :
    t = min ( x , 2 )
    x -= t
    y -= ( 2 - t ) * 10 + 2
    if ( y < 2 or 10 * x + y < 22 ) :
        CielWon = True
        break
    y -= 2
    t = min ( 2 , y // 10 )
    y -= 10 * t
    x -= 2 - t
print ( ' Ciel ' if CielWon else ' Hanako ' )


```
[/INST]
```java
import java.util.Scanner;

public class CielHanako {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int y = scanner.nextInt();
        boolean CielWon = false;

        while (y > 1 && x * 10 + y > 21) {
            int t = Math.min(x, 2);
            x -= t;
            y -= (2 - t) * 10 + 2;
            if (y < 2 || 10 * x + y < 22) {
                CielWon = true;
                break;
            }
            y -= 2;
            t = Math.min(2, y / 10);
            y -= 10 * t;
            x -= 2 - t;
        }

        System.out.println(CielWon ? "Ciel" : "Hanako");
    }
}
```
Note: The code uses the `Scanner` class to read input from the user, and the `Math.min` method to find the minimum of two numbers. The `Math.min` method is used to find the minimum of `x` and `2`, and the minimum of `2` and `y / 10`.</s>
