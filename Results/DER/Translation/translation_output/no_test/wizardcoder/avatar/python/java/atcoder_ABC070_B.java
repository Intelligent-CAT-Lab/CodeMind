Below is an instruction that describes a task. Write a response that appropriately completes the request.

### Instruction:
Translate the following python code to java and enclose your solution inside ```java```:
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
        sc.close();

        int max1 = Math.max(0, Math.min(b, d) - Math.max(a, c));
        System.out.println(max1);
    }
}
```<|endoftext|>
