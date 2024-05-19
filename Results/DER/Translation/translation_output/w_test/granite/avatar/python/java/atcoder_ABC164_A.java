System:
You are an expert java programmer and assistant

Question:
Translate the following code from python to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
1 100

Expected output:
unsafe


```
import sys
def main ( ) :
    S, W = map ( int, input ( ). split ( ) )
    print ( " unsafe " ) if ( S <= W ) else print ( " safe " )
if __name__ =='_ _ main _ _':
    main ( )


```


Answer:
```java
import java.util.*;

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

Test input:
1 100

Expected output:
unsafe<|endoftext|>
