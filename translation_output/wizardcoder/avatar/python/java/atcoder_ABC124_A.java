Below is an instruction that describes a task. Write a response that appropriately completes the request.

### Instruction:
Translate the following python code to java and enclose your solution inside ```java```:
```
a, b = map ( int, input ( ). split ( ) )
c = 0
for i in range ( 2 ) :
    c += max ( a, b )
    if a >= b :
        a -= 1
    else :
        b -= 1
print ( c )


```

### Response:
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a, b, c = 0;
        a = sc.nextInt();
        b = sc.nextInt();
        for (int i = 2; i > 0; i--) {
            c += Math.max(a, b);
            if (a >= b) {
                a--;
            } else {
                b--;
            }
        }
        System.out.println(c);
    }
}
```<|endoftext|>
