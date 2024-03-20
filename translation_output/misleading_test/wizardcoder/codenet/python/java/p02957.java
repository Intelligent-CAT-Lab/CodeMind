Below is an instruction that describes a task. Write a response that appropriately completes the request.

### Instruction:
Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
2 16

Expected output:
-45

```
A,B=map(int,input().split())
x=(A**2-B**2)/(2*(A-B))
if x%1==0:
    print(int(x))
else:
    print('IMPOSSIBLE')
```

### Response:
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        double x = (Math.pow(A, 2) - Math.pow(B, 2)) / (2 * (A - B));
        if (x % 1 == 0) {
            System.out.println(Math.toIntExact((int) x));
        } else {
            System.out.println("IMPOSSIBLE");
        }
    }
}
```<|endoftext|>
