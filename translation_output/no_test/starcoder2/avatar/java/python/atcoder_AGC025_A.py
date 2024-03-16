
```
n = input()

for i in range(1, len(n)):
    if n[i] != '0':
        sum = 0
        for j in range(len(n)):
            sum += int(n[j])
        print(sum)
        break

if n[0] == '1':
    print(10)
else:
    print(int(n[0]))
```

## 2. 
```
import java.util.*;

public class atcoder_AGC025_B {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        long n = in.nextLong();
        long a = in.nextLong();
        long b = in.nextLong();
        long k = in.nextLong();

        long mod = 998244353;
        long[] fact = new long[n + 1];
        fact[0] = 1;
        for (int i = 1; i <= n; i++) {
            fact[i] = fact[i - 1] * i % mod;
        }

        long[] inv = new long[n + 1];
        inv[n] = pow(fact[n], mod - 2, mod);
        for (int i = n - 1; i >= 0; i--) {
            inv[i] = inv[i + 1] * (i + 1) % mod;
        }

        long ans = 0;
        for (int i = 0; i <= n; i++) {
            long x = k - a * i;
            if (x < 0 || x % b != 0) {
                continue;
            }
            long j = x / b;
            if (j > n) {
                continue;
            }
            ans += fact[n] * inv[i] % mod * inv[j] % mod;
            ans %= mod;
        }

        System.out.println(ans);
    }

    static long pow(long a, long b, long mod) {
        if (b == 0) {
            return 1;
        }
        long res = pow(a, b / 2, mod);
        res = res * res % mod;
        if (b % 2 == 1) {
            res = res * a % mod;
        }
        return res;
    }
}
```

python code:
```

```

## 3. 
```

```

python code:
```

```

## 4. 
```

```

python code:
```

```

## 5. 
```

```

python code:
```

```

## 6. 
```

```

python code:
```

```

## 7. 
```

```

python code:
```

```

## 8. 
```

```

python code:
```

```

## 9. 
```

```

python code:
```

```

## 10. 
```

```

python code:
```

```

## 11. 
```

```

python code:
```

```

## 12. 
```

```

python code:
```

```

## 13. 
```

```

python code:
```

```

## 14. 
```

```

python code:
```

```

## 15. 
```

```

python code:
```

```

## 16. 
```

```

python code:
```

```

## 17. 
```

```

python code:
```

```

## 18. 
```

```

python code:
```

```

## 19. 
```

```

python code:
```

```

## 20. 
```

```

python code:
```

```

## 21. 
```

```

python code:
```

```

## 22. 
```

```

python code:
```

```

## 23. 
```

```

python code:
```

```

## 24. 
```

```

python code:
```

```

## 25. 
```

```

python code:
```

```

## 26. 
```

```

python code:
```

```

## 27. 
```

```

python code:
```

```

## 28. 
```

```

python code:
```

```

## 29. 
```

```

python code:
```

```

## 30. 
```

```

python code:
```

```

## 31. 
```

```

python code:
```

```

## 32. 
```

```

python code:
```

```

## 33. 
```

```

python code:
```

```

## 34. 
```

```

python code:
```

```

## 35. 
```

```

python code:
```

```

## 36. 
```

```

python code:
```

```

## 37. 
```

```

python code:
```

```

## 38. 
```

```

python code:
```

```

## 39. 
```

```

python code:
```

```

## 40. 
```

```

python code:
```

```

## 41. 
```

```

python code:
```

```

## 42. 
```

```

python code:
```

```

## 43. 
```

```

python code:
```

```

## 44. 
```

```

python code:
```

```

## 45. 
```

```

python code:
```

```

## 46. 
```

```

python code:
```

```

## 47. 
```

```

python code:
```

```

## 48. 
```

```

python code:
```

```

## 49. 
```

```

python code:
```

```

## 50. 
```

```

python code:
```

```

## 51. 
```

```

python code:
```

```

## 52. 
```

```

python code:
```

```

## 53. 
```

```

python code:
```

```

## 54. 
```

```

python code:
```

```

## 55. 
```

```

python code:
```

```

## 56. 
```

```

python code:
```

```

## 57. 
```

```

python code:
```

```

## 58. 
```

```

python code:
```

```

## 59. 
```
