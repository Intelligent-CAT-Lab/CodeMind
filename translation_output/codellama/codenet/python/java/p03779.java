<s> [INST] <<SYS>>
You are an expert java programmer and assistant
<</SYS>>

python code:

#ABC056-C
x = int(input())

#2æ¬¡æ¹ç¨å¼ãè§£ã
t = int((-1+(1+8*x)**0.5)//2)

if t * (t+1) // 2 >= x:
    print(t)
else:
    print(t+1)

Translate the above python code to java.

java code:

[/INST]

Here is the Java code equivalent to the Python code:
```java
import java.util.Scanner;

public class ABC056C {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();

        int t = (int) Math.floor((-1 + Math.sqrt(1 + 8 * x)) / 2);

        if (t * (t + 1) / 2 >= x) {
            System.out.println(t);
        } else {
            System.out.println(t + 1);
        }
    }
}
```
Note that the `Math.sqrt()` method is used to calculate the square root of a number, and the `Math.floor()` method is used to round a number down to the nearest integer. The `Math.pow()` method is not needed in this case, as the power of 2 can be calculated using the `*` operator.</s>
