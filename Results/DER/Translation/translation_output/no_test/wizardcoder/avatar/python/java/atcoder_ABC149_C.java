Below is an instruction that describes a task. Write a response that appropriately completes the request.

### Instruction:
Translate the following python code to java and enclose your solution inside ```java```:
```
import math
N = int ( input ( ) )
def hoge ( n ) :
    if n == 2 :
        return True
    for x in range ( 2, int ( math. sqrt ( n ) + 2 ) ) :
        if n % x == 0 :
            return False
    return True
while True :
    if hoge ( N ) :
        print ( N )
        exit ( )
    N += 1


```

### Response:
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        sc.close();

        while (true) {
            if (isPrime(N)) {
                System.out.println(N);
                System.exit(0);
            }
            N++;
        }
    }

    public static boolean isPrime(int n) {
        if (n == 2) {
            return true;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
```<|endoftext|>
