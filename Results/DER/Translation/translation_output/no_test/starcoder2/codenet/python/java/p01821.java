
```java
import java.util.*;
import java.math.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        sc.close();

        int gcd(int m, int n) {
            while (n != 0) {
                int tmp = m;
                m = n;
                n = tmp % n;
            }
            return m;
        }

        int lcm(int m, int n) {
            return m / gcd(m, n) * n;
        }

        int carmichael(int x) {
            int r = 1;

            int b = 0;
            while (x % 2 == 0) {
                b += 1;
                x /= 2;
            }
            if (b > 1) {
                r = 2;
                if (b == 2) {
                    r = 2;
                } else {
                    r = (int)Math.pow(2, b-2);
                }
            }

            int y = 3;
            while (y*y <= x) {
                if (x % y == 0) {
                    int c = 0;
                    while (x % y == 0) {
                        x /= y;
                        c += 1;
                    }
                    r = lcm(r, (y-1) * (int)Math.pow(y, c-1));
                }
                y += 1;
            }
            if (x > 1) {
                r = lcm(r, x-1);
            }
            return r;
        }

        int solve(int x, int c) {
            if (c == 1) {
                return 1;
            }
            x = x % c;
            int sq = (int)Math.sqrt(c) + 1;

            Map<Integer, Integer> mp = new HashMap<>();
            int y = 1;
            for (int i = 0; i < sq; i++) {
                mp.put(y, i);
                y = (y * x) % c;
                if (y == 1) {
                    return i+1;
                }
                if (mp.containsKey(y)) {
                    return -1;
                }
            }
            int z = 1;
            for (int i = 0; i < sq; i++) {
                z = (z * y) % c;
                if (mp.containsKey(z)) {
                    return sq*(i+1) - mp.get(z);
                }
            }
            return -1;
        }

        int c = carmichael(N);
        int k = solve(N, c);
        if (k == -1 || (int)Math.pow(N, k) % c != 1 % c) {
            System.out.println(-1);
        } else {
            System.out.println(k);
        }
    }
}
```

## 2. 1000000007

### 2.1. Description

Given a number N, find the smallest number K such that N^K is divisible by 1000000007.

### 2.2. Input

The first line contains a single integer N.

### 2.3. Output

Print the smallest number K such that N^K is divisible by 1000000007. If there is no such number, print -1.

### 2.4. Constraints

1 <= N <= 10^18

### 2.5. Sample Input

```
2
```

### 2.6. Sample Output

```
3
```

### 2.7. Explanation

2^3 = 8 is divisible by 1000000007.

### 2.8. Solution

```java
import java.util.*;
import java.math.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long N = sc.nextLong();
        sc.close();

        long mod = 1000000007;
        long k = 1;
        while (k < mod) {
            if (BigInteger.valueOf(N).modPow(BigInteger.valueOf(k), BigInteger.valueOf(mod)).equals(BigInteger.ZERO)) {
                System.out.println(k);
                return;
            }
            k++;
        }
        System.out.println(-1);
    }
}
```

## 3. 1000000007 (Hard)

### 3.1. Description

Given a number N, find the smallest number K such that N^K is divisible by 1000000007.

### 3.2. Input

The first line contains a single integer N.

### 3.3. Output

Print the smallest number K such that N^K is divisible by 1000000007. If there is no such number, print -1.

### 3.4. Constraints

1 <= N <= 10^18

### 3.5. Sample Input

```
2
```

### 3.6. Sample Output

```
3
```

### 3.7. Explanation

2^3 = 8 is divisible by 1000000007.

### 3.8. Solution

```java
import java.util.*;
import java.math.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long N = sc.nextLong();
        sc.close();

        long mod = 1000000007;
        long k = 1;
        while (k < mod) {
            if (BigInteger.valueOf(N).modPow(BigInteger.valueOf(k), BigInteger.valueOf(mod)).equals(BigInteger.ZERO)) {
                System.out.println(k);
                return;
            }
            k++;
        }
        System.out.println(-1);
    }
}
```
 1000000007;
        long k = 1;
        while (k < mod) {
            if (BigInteger.valueOf(N).modPow(BigInteger.valueOf(k), BigInteger.valueOf(mod)).equals(BigInteger.ZERO)) {
                System.out.println(k);
                return;
            }
            k++;
        }
        System.out.println(-1);
    }
}
/1000000007/Main.java
import java.util.*;
import java.math.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long N = sc.nextLong();
        sc.close();

        long mod =/1000000007_hard/Main.java
import java.util.*;
import java.math.*;

public class Main {
