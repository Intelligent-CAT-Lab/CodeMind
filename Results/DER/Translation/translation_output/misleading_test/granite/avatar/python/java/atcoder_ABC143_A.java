System:
You are an expert java programmer and assistant

Question:
Translate the following code from python to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
75 25

Expected output:
57

```
A, B = map ( int, input ( ). split ( ) )
ans = A - 2 * B
if ans < 0 :
    ans = 0
print ( ans )


```


Answer:
```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int ans = A - 2 * B;
        if (ans < 0) {
            ans = 0;
        }
        System.out.println(ans);
    }
}
```

Test input:
```
75 25
```

Expected output:
```
57
```<|endoftext|>
