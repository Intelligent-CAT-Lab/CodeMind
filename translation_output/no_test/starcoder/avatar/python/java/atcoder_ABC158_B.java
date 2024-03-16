<fim_prefix>Translate the following python code to java and enclose your solution inside ```java```:
```
N, A, B = map ( int, input ( ). split ( ) )
ans = N // ( A + B ) * A
rem = N % ( A + B )
ans += min ( rem, A )
print ( ans )


```

java code:<fim_suffix><fim_middle>
```
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int A = sc.nextInt();
        int B = sc.nextInt();
        int ans = N / (A + B) * A;
        int rem = N % (A + B);
        ans += Math.min(rem, A);
        System.out.println(ans);
    }
}
```
<|endoftext|>
