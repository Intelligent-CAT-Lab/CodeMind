<fim_prefix>Translate the following python code to java and enclose your solution inside ```java```:
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
            int i_temp = i;
            int j = 0;
            int composite = 1;
            int count = 0;
            while(i_temp!= 0){
                if(i_temp%2 == 0){
                    i_temp /= 2;
                }else{
                    composite *= prime_factor[j];
                    count += 1;
                    i_temp /= 2;
                }
                j++;
            }
            for(int j_temp = 0; j_temp < prime_factor.length; j_temp++){
                if(prime_factor[j_temp] == composite && count >= 2){
                    ans--;
                }
            }
        }
        System.out.println(ans + 1);
    }
    
    public static int gcd(int a, int b){
        if(b == 0){
            return a;
        }else{
            return gcd(b, a%b);
        }
    }
    
    public static int[] prime_factorize(int n){
        int[] a = new int[1000];
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
            }else{
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
