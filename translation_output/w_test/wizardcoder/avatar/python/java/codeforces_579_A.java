Below is an instruction that describes a task. Write a response that appropriately completes the request.

### Instruction:
Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
9

Expected output:
2


```
import math
n = int ( input ( ) )
x = 1
while math. log2 ( n ) % 1 :
    x += 1
    n -= 2 ** ( int ( math. log2 ( n ) ) )
print ( x )


```

### Response:
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int x = 1;
        while (Math.log(n) / Math.log(2) % 1!= 0) {
            x++;
            n -= (int) Math.pow(2, Math.floor(Math.log(n) / Math.log(2)));
        }
        System.out.println(x);
    }
}
```<|endoftext|>
