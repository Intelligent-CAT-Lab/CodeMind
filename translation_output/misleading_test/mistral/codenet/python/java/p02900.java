<s> [INST] Translate the following python code to java and enclose your solution inside ```java```.
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
[/INST]
```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int gcd = gcd(A, B);
        List<Integer> primeFactor = primeFactorize(gcd);
        
        int ans = primeFactor.size();
        for (int i = 0; i < (int) Math.pow(2, primeFactor.size()); i++) {
            int i_temp = i;
            int j = 0;
            int composite = 1;
            int count = 0;
            while (i_temp != 0) {
                if (i_temp % 2 == 0) {
                    continue;
                } else {
                    composite *= primeFactor.get(j);
                    count++;
                }
                j++;
                i_temp /= 2;
            }
            for (int j : primeFactor) {
                if (j == composite && count >= 2) {
                    ans--;
                }
            }
        }
        System.out.println(ans + 1);
    }
    
    public static int gcd(int a, int b) {
        if (b == 0) {
            return a;
        }
        return gcd(b, a % b);
    }
    
    public static List<Integer> primeFactorize(int n) {
        List<Integer> a = new ArrayList<>();
        while (n % 2 == 0) {
            a.add(2);
            n /= 2;
        }
        int f = 3;
        while (f * f <= n) {
            if (n % f == 0) {
                a.add(f);
                n /= f;
            } else {
                f += 2;
            }
        }
        if (n != 1) {
            a.add(n);
        }
        return a;
    }
}
```</s>
