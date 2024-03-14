<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
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

### Response:
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

    private static boolean isPrime(int n) {
        if (n == 2) {
            return true;
        }
        for (int i = 2; i <= Math.sqrt(n) + 1; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
```

This Java code does the same thing as the Python code. It checks if a number is prime by iterating from 2 to the square root of the number and checking if the number is divisible by any of these values. If it is, the number is not prime and the function returns false. If it is not divisible by any of these values, the number is prime and the function returns true. The main function reads an integer from the user, checks if it is prime, and if it is, prints it and exits. If it is not prime, it increments the number and checks again.
<|EOT|>
