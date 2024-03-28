Below is an instruction that describes a task. Write a response that appropriately completes the request.

### Instruction:
Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
1000 1000000000 1000

Expected output:
0

```
k, n, w = map ( int, input ( ). strip ( ). split ( ) )
sum = 0
for i in range ( 1, w + 1 ) :
    sum += k * i
if sum <= n :
    print ( 0 )
else :
    print ( sum - n )


```

### Response:
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        int n = sc.nextInt();
        int w = sc.nextInt();
        int sum = 0;
        for (int i = 1; i <= w; i++) {
            sum += k * i;
        }
        if (sum <= n) {
            System.out.println(0);
        } else {
            System.out.println(sum - n);
        }
    }
}
```<|endoftext|>
