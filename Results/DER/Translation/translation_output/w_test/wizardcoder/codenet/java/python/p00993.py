Below is an instruction that describes a task. Write a response that appropriately completes the request.

### Instruction:
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

### Response:
```python
import math

def factorial(n):
    if n == 0:
        return 1
    else:
        return n * factorial(n-1)

def main():
    n = int(input())
    fact = factorial(1510)
    fact += 2
    print(fact)
    for i in range(2, 2+n):
        print(i)

if __name__ == '__main__':
    main()
```

Explanation:

- We first define a function `factorial` that calculates the factorial of a given number using recursion.
- We then define the `main` function that reads the input `n`, calculates the factorial of 1510 and adds 2 to it, and then prints the result.
- We then loop through the range from 2 to 2+n and print each number.<|endoftext|>
