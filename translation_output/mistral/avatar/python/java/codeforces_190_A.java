<s> [INST] Translate the following python code to java and enclose your solution inside ```java```:
```
n , m = map ( int , input ( ) . split ( ) )
if n < 1 :
    if m < 1 :
        print ( n , m )
        quit ( )
    print ( " Impossible " )
    quit ( )
if m > n :
    min = m
    max = n + m - 1
    print ( min , max )
if m <= n :
    min = n
    max = n + m - 1
    if m == 0 :
        max = n
    print ( min , max )


```
[/INST]
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n, m;
        n = scanner.nextInt();
        m = scanner.nextInt();
        if (n < 1) {
            if (m < 1) {
                System.out.println(n, m);
                System.exit(0);
            }
            System.out.println("Impossible");
            System.exit(0);
        }
        if (m > n) {
            int min = m;
            int max = n + m - 1;
            System.out.println(min, max);
        } else {
            int min = n;
            int max = n + m - 1;
            if (m == 0) {
                max = n;
            }
            System.out.println(min, max);
        }
    }
}
```</s>
