Below is an instruction that describes a task. Write a response that appropriately completes the request.

### Instruction:
Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
3 2

Expected output:
-34 81 -80.90022307618028

```
a, b = map(int, raw_input().split())
 
print "%d %d %f" % (a / b, a % b, float(a)/ b)
```

### Response:
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        sc.close();
        
        double result = (double)a / b;
        int quotient = (int)result;
        double remainder = result - quotient;
        
        System.out.printf("%d %d %f", quotient, a % b, remainder);
    }
}
```<|endoftext|>
