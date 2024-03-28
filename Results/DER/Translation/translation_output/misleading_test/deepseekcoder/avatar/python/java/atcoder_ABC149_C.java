<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
9552

Expected output:
9591

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

### Response:
Here is the Java version of the provided Python code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        while (true) {
            if (isPrime(N)) {
                System.out.println(N);
                break;
            }
            N++;
        }
    }

    private static boolean isPrime(int n) {
        if (n == 2) {
            return true;
        }
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
```

This Java code does the same thing as the Python code. It reads an integer from the standard input, checks if it's a prime number, and if it's not, it increments the number by 1 and checks again. This continues until it finds a prime number.

The `isPrime` method checks if a number is prime by iterating from 2 to the square root of the number. If the number is divisible by any of these numbers, it's not prime and the method returns `false`. If the number is not divisible by any of these numbers, it's prime and the method returns `true`.
<|EOT|>
