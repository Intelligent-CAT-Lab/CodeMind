System:
You are an expert java programmer and assistant

Question:
Translate the following code from python to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
501719768609305159 370614275896614890 131105492712690269

Expected output:
370614275896614890


```
N, A, B = map ( int, input ( ). split ( ) )
ans = N // ( A + B ) * A
rem = N % ( A + B )
ans += min ( rem, A )
print ( ans )


```


Answer:
```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long N = sc.nextLong();
        long A = sc.nextLong();
        long B = sc.nextLong();
        long ans = N / (A + B) * A;
        long rem = N % (A + B);
        ans += Math.min(rem, A);
        System.out.println(ans);
    }
}
```

Test input:
501719768609305159 370614275896614890 131105492712690269

Expected output:
370614275896614890<|endoftext|>
