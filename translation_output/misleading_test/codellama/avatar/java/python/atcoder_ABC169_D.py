<s> [INST] <<SYS>>
You are an expert python programmer and assistant
<</SYS>>

Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
366735600000

Expected output:
9

```
import java.util.*;

public class atcoder_ABC169_D {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long N = sc.nextLong();
        List<Integer> factors = primeFactor(N);
        int count = 0;
        for (int i = 0; i < factors.size(); i++) {
            int pow = factors.get(i);
            int increase = 1;
            while (pow - increase >= 0) {
                pow -= increase;
                increase++;
                count++;
            }
        }
        System.out.println(count);
    }

    static List<Integer> primeFactor(long N) {
        List<Integer> res = new ArrayList<>();
        for (long i = 2; i * i <= N; i++) {
            int count = 0;
            while (N % i == 0) {
                N /= i;
                count++;
            }
            if (count != 0)
                res.add(count);
        }
        if (N != 1) {
            res.add(1);
        }
        return res;
    }
}
```
[/INST]
```python
import math

def prime_factor(n):
    factors = []
    for i in range(2, int(math.sqrt(n)) + 1):
        count = 0
        while n % i == 0:
            n //= i
            count += 1
        if count != 0:
            factors.append(count)
    if n != 1:
        factors.append(1)
    return factors

def main():
    n = int(input())
    factors = prime_factor(n)
    count = 0
    for i in range(len(factors)):
        pow = factors[i]
        increase = 1
        while pow - increase >= 0:
            pow -= increase
            increase += 1
            count += 1
    print(count)

if __name__ == "__main__":
    main()
```
This is the Python code for the given Java code. The `prime_factor` function is similar to the `primeFactor` function in the Java code, it returns a list of the prime factors of a given number. The `main` function is also similar, it takes an input from the user, calls the `prime_factor` function to get the prime factors, and then calculates the number of prime factors that are greater than or equal to the number of times they appear in the factorization. Finally, it prints the result.

Note that the `math.sqrt` function is used to calculate the square root of a number, and the `//` operator is used for integer division.</s>
