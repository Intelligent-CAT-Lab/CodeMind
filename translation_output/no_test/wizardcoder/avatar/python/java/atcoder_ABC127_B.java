Below is an instruction that describes a task. Write a response that appropriately completes the request.

### Instruction:
Translate the following python code to java and enclose your solution inside ```java```:
```
r, D, x = map ( int, input ( ). split ( ) )
for i in range ( 10 ) :
    x = r * x - D
    print ( x )


```

### Response:
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int r, D, x;
        r = sc.nextInt();
        D = sc.nextInt();
        x = sc.nextInt();
        for (int i = 1; i <= 10; i++) {
            x = r * x - D;
            System.out.println(x);
        }
    }
}
```<|endoftext|>
