<s> [INST] <<SYS>>
You are an expert java programmer and assistant
<</SYS>>

Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
9552

Expected output:
9587


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
import java.lang.Math;

public class Hoge {
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
        for (int x = 2; x <= Math.sqrt(n) + 2; x++) {
            if (n % x == 0) {
                return false;
            }
        }
        return true;
    }
}
```
Note: The code is written in Java 8, and it uses the `Scanner` class to read the input from the user, and the `Math` class to calculate the square root of the input number. The `isPrime` method is used to check if the input number is prime or not. The `while` loop is used to iterate over the input number until a prime number is found.</s>
