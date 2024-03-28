Below is an instruction that describes a task. Write a response that appropriately completes the request.

### Instruction:
Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
0 50 50 100

Expected output:
0


```
a, b, c, d = map ( int, input ( ). split ( ) )
print ( max ( 0, min ( b, d ) - max ( a, c ) ) )


```

### Response:
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();
        int max_ab = Math.max(a, b);
        int min_cd = Math.min(c, d);
        int result = Math.max(0, min_cd - max_ab);
        System.out.println(result);
    }
}
```<|endoftext|>
