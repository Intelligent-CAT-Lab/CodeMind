<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
Translate the following python code to java and enclose your solution inside ```java```:
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

@@ Response
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
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
        for (int x = 2; x <= Math.sqrt(n) + 1; x++) {
            if (n % x == 0) {
                return false;
            }
        }
        return true;
    }
}
```

This Java code does the same thing as the Python code. It reads an integer from the user, then checks if it's a prime number. If it is, it prints the number and exits. If it's not, it increments the number and checks again. This continues until a prime number is found.<｜end▁of▁sentence｜>
