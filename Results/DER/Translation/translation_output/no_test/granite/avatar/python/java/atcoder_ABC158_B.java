System:
You are an expert java programmer and assistant

Question:
Translate the following code from python to java and enclose your solution inside ```java```:
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
        int N = sc.nextInt();
        int A = sc.nextInt();
        int B = sc.nextInt();
        sc.close();

        int ans = N / (A + B) * A;
        int rem = N % (A + B);
        ans += Math.min(rem, A);
        System.out.println(ans);
    }
}
```<|endoftext|>
