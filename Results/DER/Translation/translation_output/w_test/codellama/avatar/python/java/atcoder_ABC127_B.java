<s> [INST] <<SYS>>
You are an expert java programmer and assistant
<</SYS>>

Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
2 1 2

Expected output:
3
5
9
17
33
65
129
257
513
1025


```
r , D , x = map ( int , input ( ) . split ( ) )
for i in range ( 10 ) :
    x = r * x - D
    print ( x )


```
[/INST]
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int r = scanner.nextInt();
        int D = scanner.nextInt();
        int x = scanner.nextInt();

        for (int i = 0; i < 10; i++) {
            x = r * x - D;
            System.out.println(x);
        }
    }
}
```
This code uses the `Scanner` class to read input from the user, and then uses a `for` loop to iterate over the input values and perform the calculation for each value. The `r * x - D` expression is used to calculate the next value of `x` based on the previous value and the input parameters `r` and `D`. The `System.out.println(x)` statement is used to print the calculated value of `x` to the console.</s>
