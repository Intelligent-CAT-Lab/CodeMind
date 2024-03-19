<fim_prefix>Translate the following python code to java and enclose your solution inside ```java```.
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
    if n!= 1:
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
        while i_temp!= 0:
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

java code:<fim_suffix><fim_middle>
```java
import java.util.*;
import java.lang.*;
import java.io.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int gcd = gcd(A,B);
        int[] prime_factor = prime_factorize(gcd);
        int ans = prime_factor.length;
        for(int i = 0; i < (1<<prime_factor.length); i++){
            int composite = 1;
            int count = 0;
            for(int j = 0; j < prime_factor.length; j++){
                if((i & (1<<j))!= 0){
                    composite *= prime_factor[j];
                    count++;
                }
            }
            if(count >= 2 && composite!= 1){
                ans--;
            }
        }
        System.out.println(ans + 1);
    }
    public static int gcd(int a, int b){
        if(b == 0){
            return a;
        }
        return gcd(b, a%b);
    }
    public static int[] prime_factorize(int n){
        int[] a = new int[100];
        int i = 0;
        while(n % 2 == 0){
            a[i] = 2;
            n /= 2;
            i++;
        }
        int f = 3;
        while(f * f <= n){
            if(n % f == 0){
                a[i] = f;
                n /= f;
                i++;
            }
            else{
                f += 2;
            }
        }
        if(n!= 1){
            a[i] = n;
            i++;
        }
        int[] ans = new int[i];
        for(int j = 0; j < i; j++){
            ans[j] = a[j];
        }
        return ans;
    }
}
```
<|endoftext|>
