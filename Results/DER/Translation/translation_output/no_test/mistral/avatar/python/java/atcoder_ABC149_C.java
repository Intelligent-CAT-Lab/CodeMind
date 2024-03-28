<s> [INST] Translate the following python code to java and enclose your solution inside ```java```:
```
import math
N = int ( input ( ) )
def hoge ( n ) :
    if n == 2 :
        return True
    for x in range ( 2 , int ( math . sqrt ( n ) + 2 ) ) :
        if n % x == 0 :
            return False
    return True
while True :
    if hoge ( N ) :
        print ( N )
        exit ( )
    N += 1


```
[/INST]
```java
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        while (true) {
            if (isPrime(N)) {
                System.out.println(N);
                break;
            }
            N++;
        }
    }
    public static boolean isPrime(int n) {
        if (n == 2) {
            return true;
        }
        for (int x = 2; x <= Math.sqrt(n); x++) {
            if (n % x == 0) {
                return false;
            }
        }
        return true;
    }
}
```</s>
