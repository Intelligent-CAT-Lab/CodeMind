<s> [INST] Translate the following java code to python and enclose your solution inside ```python```:
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
    return math.factorial(n)

def main():
    fact = 1
    for i in range(1, 1511):
        fact *= i
    fact += 2

    while True:
        n = int(input())
        print(fact)
        for i in range(2, 2 + n):
            print(i)

if __name__ == "__main__":
    main()
```</s>
