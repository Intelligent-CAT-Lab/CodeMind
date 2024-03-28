<s> [INST] <<SYS>>
You are an expert java programmer and assistant
<</SYS>>

Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
1 100

Expected output:
uOnsafe

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
        Scanner sc = new Scanner(System.in);
        int S = sc.nextInt();
        int W = sc.nextInt();
        if (S <= W) {
            System.out.println("unsafe");
        } else {
            System.out.println("safe");
        }
    }
}
```
Note: The `map` function in Python is not available in Java, so we need to use the `Scanner` class to read the input and convert it to integers.</s>
