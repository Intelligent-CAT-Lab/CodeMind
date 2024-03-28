<s> [INST] Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
-1000000000 -1

Expected output:
Positie

```
a , b = map ( int , input ( ) . split ( ) )
if a <= 0 and 0 <= b :
    print ( " Zero " )
elif a < 0 and min ( b - a , - a ) % 2 == 0 :
    print ( " Negative " )
else :
    print ( " Positive " )


```
[/INST]
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        if (a <= 0 && 0 <= b) {
            System.out.println("Zero");
        } else if (a < 0 && (b - a) % 2 == 0) {
            System.out.println("Negative");
        } else {
            System.out.println("Positive");
        }
    }
}
```</s>
