<s> [INST] <<SYS>>
You are an expert java programmer and assistant
<</SYS>>

python Code:

T , s , q = map ( int , input ( ) . split ( ) )
v = ( q - 1 ) / q
tm = 1
t = s / ( 1 - v )
while ( T - s ) / v - t > 0 :
    if ( T - s ) / v - t < 1e-10 :
        break
    tm += 1
    s += v * t
    t = s / ( 1 - v )
print ( tm )



Translate the above python code to java.

java Code:

[/INST]

Here is the Java code equivalent to the Python code:
```
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt();
        int s = scanner.nextInt();
        int q = scanner.nextInt();
        double v = (q - 1) / (double) q;
        double tm = 1;
        double t = s / (1 - v);
        while ((T - s) / v - t > 0) {
            if ((T - s) / v - t < 1e-10) {
                break;
            }
            tm += 1;
            s += v * t;
            t = s / (1 - v);
        }
        System.out.println(tm);
    }
}
```
Note that in Java, we need to use the `double` data type to represent floating-point numbers, and we need to use the `Scanner` class to read input from the user. Also, we need to use the `nextInt()` method to read an integer value from the user, and the `nextDouble()` method to read a floating-point value from the user.</s>
