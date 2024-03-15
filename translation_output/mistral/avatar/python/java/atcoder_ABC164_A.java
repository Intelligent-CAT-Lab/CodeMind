<s> [INST] Translate the following python code to java and enclose your solution inside ```java```:
```
import sys
def main ( ) :
    S , W = map ( int , input ( ) . split ( ) )
    print ( " unsafe " ) if ( S <= W ) else print ( " safe " )
if __name__ == ' _ _ main _ _ ' :
    main ( )


```
[/INST]
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int S = scanner.nextInt();
        int W = scanner.nextInt();
        if (S <= W) {
            System.out.println("unsafe");
        } else {
            System.out.println("safe");
        }
    }
}
```</s>
