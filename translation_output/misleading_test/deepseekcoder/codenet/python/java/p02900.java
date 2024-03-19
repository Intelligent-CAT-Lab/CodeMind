<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
12 18

Expected output:
35

```
def prime_factorize(n):
    a = []
    while n % 2 == 0:
        a.append(2)
        n //= 2
    f = 3
    while f * f <= n:
        if n % f == 0:
            a.append(f)
            n //= f
        else:
            f += 2
    if n != 1:
        a.append(n)
    return a

def solve():
    import fractions
    A,B = map(int, input().split())
    gcd = fractions.gcd(A,B)
    prime_factor = list(set(prime_factorize(gcd)))
    
    ans = int(len(prime_factor))
    for i in range(int(2**len(prime_factor))):
        i_temp = i
        j = 0
        composite = 1
        count = 0
        while i_temp != 0:
            if i_temp%2 == 0:
                pass
            elif i_temp%2 == 1:
                composite *= prime_factor[j]
                count += 1
            j += 1
            i_temp /= 2
        
        for j in prime_factor:
            if j == composite and count >= 2:
                ans -= 1

    print(ans + 1) 

solve()
```

### Response:
```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int A = scanner.nextInt();
        int B = scanner.nextInt();
        scanner.close();

        int gcd = gcd(A, B);
        List<Integer> primeFactors = primeFactorize(gcd);
        HashSet<Integer> uniquePrimeFactors = new HashSet<>(primeFactors);
        primeFactors = new ArrayList<>(uniquePrimeFactors);

        int ans = primeFactors.size();
        for (int i = 0; i < Math.pow(2, primeFactors.size()); i++) {
            int composite = 1;
            int count = 0;
            for (int j = 0; j < primeFactors.size(); j++) {
                if (((i >> j) & 1) == 1) {
                    composite *= primeFactors.get(j);
                    count += 1;
                }
            }
            for (int j = 0; j < primeFactors.size(); j++) {
                if (primeFactors.get(j).equals(composite) && count >= 2) {
                    ans -= 1;
                    break;
                }
            }
        }
        System.out.println(ans + 1);
    }

    private static int gcd(int a, int b) {
        if (b == 0) {
            return a;
        } else {
            return gcd(b, a % b);
        }
    }

    private static List<Integer> primeFactorize(int n) {
        List<Integer> factors = new ArrayList<>();
        while (n % 2 == 0) {
            factors.add(2);
            n /= 2;
        }
        int f = 3;
        while (f * f <= n) {
            if (n % f == 0) {
                factors.add(f);
                n /= f;
            } else {
                f += 2;
            }
        }
        if (n != 1) {
            factors.add(n);
        }
        return factors;
    }
}
```

This Java code does the same thing as the Python code. It first calculates the greatest common divisor of the two input numbers, then it factorizes this GCD into its prime factors. It then counts the number of unique prime factors and uses this count as the initial answer. It then iterates over all possible combinations of these prime factors, calculating the product of each combination. If the product of a combination is a prime factor of the GCD and the number of factors in the combination is at least 2, it subtracts 1 from the answer. Finally, it prints the answer plus 1.
<|EOT|>
