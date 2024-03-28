<s> [INST] <<SYS>>
You are an expert java programmer and assistant
<</SYS>>

Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
2 1 2

Expected output:
-60
72
31
-42
109
-30
184
336
492
1117

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
This code first prompts the user to enter three integers, `r`, `D`, and `x`, separated by spaces. It then uses a `for` loop to iterate 10 times, and on each iteration, it calculates the new value of `x` using the formula `r * x - D`, and prints the result.

The `map` function in Python is not necessary in Java, as the `Scanner` class provides a way to read input from the user and convert it to the desired data type. The `range` function in Python is also not necessary in Java, as the `for` loop can be used to iterate over a range of values.</s>
