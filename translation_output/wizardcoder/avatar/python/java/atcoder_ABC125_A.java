Below is an instruction that describes a task. Write a response that appropriately completes the request.

### Instruction:
Translate the following python code to java and enclose your solution inside ```java```:
```
A, B, T = map ( int, input ( ). split ( ) )
ans = ( T // A ) * B
print ( ans )


```

### Response:
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A, B, T, ans;
        A = sc.nextInt();
        B = sc.nextInt();
        T = sc.nextInt();
        ans = (T / A) * B;
        System.out.println(ans);
    }
}
```<|endoftext|>
