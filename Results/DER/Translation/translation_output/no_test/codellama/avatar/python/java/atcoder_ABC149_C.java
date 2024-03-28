<s> [INST] <<SYS>>
You are an expert java programmer and assistant
<</SYS>>

python Code:

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



Translate the above python code to java.

java Code:

[/INST]

Here is the Java code equivalent to the Python code:
```java
import java.util.Scanner;
import java.lang.Math;

public class Hoge {
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
Note that the `isPrime` method is a static method, which means it can be called without creating an instance of the class. This is because it is a utility method that can be used by any other class in the program.

Also, the `Scanner` class is used to read input from the user, and the `Math` class is used to perform mathematical operations.</s>
