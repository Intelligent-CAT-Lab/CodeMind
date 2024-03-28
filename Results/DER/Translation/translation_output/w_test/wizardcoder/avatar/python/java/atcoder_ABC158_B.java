Below is an instruction that describes a task. Write a response that appropriately completes the request.

### Instruction:
Translate the following python code to java and enclose your solution inside ```java```.
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

### Response:
```java
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
```<|endoftext|>
