<s> [INST] Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
6 6

Expected output:
12


```
a , b = map ( int , input ( ) . split ( ) )
c = 0
for i in range ( 2 ) :
    c += max ( a , b )
    if a >= b :
        a -= 1
    else :
        b -= 1
print ( c )


```
[/INST]
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a, b;
        a = Integer.parseInt(scanner.nextLine().split(" ")[0]);
        b = Integer.parseInt(scanner.nextLine().split(" ")[0]);
        int c = 0;
        for (int i = 0; i < 2; i++) {
            c += Math.max(a, b);
            if (a >= b) {
                a--;
            } else {
                b--;
            }
        }
        System.out.println(c);
    }
}
```</s>
