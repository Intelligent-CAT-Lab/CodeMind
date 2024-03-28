Below is an instruction that describes a task. Write a response that appropriately completes the request.

### Instruction:
Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
2

Expected output:
86
-7
89

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
    fact = factorial(1510)
    fact += 2

    while True:
        try:
            n = int(input())
            print(fact)
            for i in range(2, 2+n):
                print(i)
        except EOFError:
            break

if __name__ == '__main__':
    main()
```

Explanation:

- The `factorial` function is defined to calculate the factorial of a given number using recursion.
- The `main` function initializes the `fact` variable to the factorial of 1510 and adds 2 to it.
- The `while` loop reads input integers from the user until an `EOFError` is raised.
- Inside the loop, the `fact` variable is printed and then the integers from 2 to 2+n are printed using a `for` loop.
- The `try` block is used to catch the `EOFError` exception raised when the user inputs a blank line.<|endoftext|>
