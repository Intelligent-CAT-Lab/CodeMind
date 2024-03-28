<s> [INST] Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
8 8

Expected output:
1


```
t , h = map ( int , input ( ) . split ( ) )
print ( ( h - 2 ) // ( t - 1 ) + 1 )


```
[/INST]
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t, h;
        t = scanner.nextInt();
        h = scanner.nextInt();
        System.out.println((h - 2) / (t - 1) + 1);
    }
}
```</s>
