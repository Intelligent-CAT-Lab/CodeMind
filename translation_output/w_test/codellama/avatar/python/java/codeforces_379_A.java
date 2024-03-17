<s> [INST] <<SYS>>
You are an expert java programmer and assistant
<</SYS>>

Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
80 970

Expected output:
80


```
a , b = map ( int , input ( ) . split ( ) )
x = a
h = 0
s = 0
while x > 0 :
    x -= 1
    h += 1
    s += 1
while s // b != 0 :
    h += 1
    s = s - b + 1
print ( h )


```
[/INST]
```java
import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int x = a;
        int h = 0;
        int s = 0;
        while (x > 0) {
            x--;
            h++;
            s++;
        }
        while (s / b != 0) {
            h++;
            s = s - b + 1;
        }
        System.out.println(h);
    }
}
```
This code uses the `Scanner` class to read input from the user, and the `nextInt()` method to read the two integers `a` and `b`. It then uses a `while` loop to calculate the value of `x`, `h`, and `s`. Finally, it uses another `while` loop to calculate the final value of `h`. The `println()` method is used to print the final value of `h` to the console.</s>
