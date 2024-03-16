<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following python code to java and enclose your solution inside ```java```:
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

### Response:
Here is the Java version of your Python code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split(" ");
        int x = Integer.parseInt(input[0]);
        int y = Integer.parseInt(input[1]);
        boolean cielWon = false;
        while (y > 1 && x * 10 + y > 21) {
            int t = Math.min(x, 2);
            x -= t;
            y -= (2 - t) * 10 + 2;
            if (y < 2 || 10 * x + y < 22) {
                cielWon = true;
                break;
            }
            y -= 2;
            t = Math.min(2, y / 10);
            y -= 10 * t;
            x -= 2 - t;
        }
        System.out.println(cielWon ? "Ciel" : "Hanako");
    }
}
```

This Java code does the same thing as your Python code. It reads two integers from the input, then simulates the game until one of the players wins. The game is won by reducing the number of stones to 0 or less. The player who wins the game is printed to the console.
<|EOT|>
