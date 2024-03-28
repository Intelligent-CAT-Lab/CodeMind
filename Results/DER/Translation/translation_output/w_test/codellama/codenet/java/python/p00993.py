<s> [INST] <<SYS>>
You are an expert python programmer and assistant
<</SYS>>

Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
2

Expected output:
8
2
3


```
//[2, 1510] ã®ç´æ°å¨ã¦ããã¤æ´æ°factãæ¢ã
//[fact + 2, fact + 1510] ã¯å¨ã¦ç´æ°ãæã¤ãã¨ãããã
//ã©ããªå¤ãå¥åããããã¨, fact + 2ãåºåãã¦ããã°ãã

import java.util.*;
import java.math.BigInteger;

public class p00993{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        BigInteger fact = BigInteger.ONE;
        BigInteger mul = BigInteger.ONE;

        for(int i = 1; i <= 1510; i++){
            fact = fact.multiply(mul);
            mul = mul.add(BigInteger.ONE);
        }
        fact = fact.add(new BigInteger("2"));

        while(sc.hasNextInt()){
            int n = sc.nextInt();
            System.out.println(fact);

            for(int i = 2; i < 2 + n; i++){
                System.out.println(i);
            }
        }
    }
}
```
[/INST]
```python
import math

def factorial(n):
    result = 1
    for i in range(2, n+1):
        result *= i
    return result

def main():
    n = int(input("Enter a number: "))
    fact = factorial(n)
    print(fact)
    for i in range(2, n+2):
        print(i)

if __name__ == "__main__":
    main()
```
This is a Python implementation of the Java code provided. The `factorial` function calculates the factorial of a given number using a loop, and the `main` function takes a number from the user, calculates its factorial using the `factorial` function, and then prints the factorial and the first `n` numbers.

Note that the `BigInteger` class in Java is not needed in Python, as Python has built-in support for large integers.</s>
