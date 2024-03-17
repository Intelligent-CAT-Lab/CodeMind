Below is an instruction that describes a task. Write a response that appropriately completes the request.

### Instruction:
Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
4 0 0 4

Expected output:
4 4 0 0


```
anti, b, c, d = map ( int, input ( ). split ( ) )
l = abs ( anti - c ) ; m = abs ( b - d )
if anti == c : print ( anti + m, b, c + m, d )
elif b == d : print ( anti, b + l, c, d + l )
elif l!= m : print ( - 1 )
else : print ( anti, d, c, b )


```

### Response:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int anti = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();
        int l = Math.abs(anti - c);
        int m = Math.abs(b - d);
        if (anti == c) {
            System.out.println(anti + m + " " + b + " " + (c + m) + " " + d);
        } else if (b == d) {
            System.out.println(anti + " " + (b + l) + " " + c + " " + (d + l));
        } else if (l!= m) {
            System.out.println("-1");
        } else {
            System.out.println(anti + " " + d + " " + c + " " + b);
        }
    }
}
```<|endoftext|>
