<s> [INST] <<SYS>>
You are an expert java programmer and assistant
<</SYS>>

python Code:

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



Translate the above python code to java.

java Code:

[/INST]

Here is the Java code equivalent to the Python code:
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
Note that the Java code uses the `Scanner` class to read input from the user, and the `Math.min` method to find the minimum of two numbers. The `Math.min` method is used instead of the Python `min` function because Java does not have a built-in `min` function.</s>
