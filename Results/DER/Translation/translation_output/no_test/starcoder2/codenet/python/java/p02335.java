
```java
import java.util.*;
import java.math.*;

public class Main {
    static final long MOD = (long)Math.pow(10,9)+7;
    static long P(long n, long r) {
        return factorial(n).divide(factorial(n-r)).longValue();
    }
    static long C(long n, long r) {
        return P(n,r).divide(factorial(r)).longValue();
    }
    static long H(long n, long r) {
        return C(n+r-1,r);
    }
    static BigInteger factorial(long n) {
        BigInteger res = BigInteger.ONE;
        for (long i = 2; i <= n; i++) {
            res = res.multiply(BigInteger.valueOf(i));
        }
        return res;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        long k = sc.nextLong();
        System.out.println(C(k,n)%MOD);
    }
}
```

## 6.

Translate the following python code to java and enclose your solution inside ```java```:
```
# ball and box 6
MOD = pow(10,9)+7
from math import factorial
def P(n,r):
    return factorial(n)//factorial(n-r)
def C(n,r):
    return P(n,r)//factorial(r)
def H(n,r):
    return C(n+r-1,r)
n, k = map(int, input().split())

print(C(k,n)%MOD if n < k else 0 if n > k else 1)

```

java code:
```java
import java.util.*;
import java.math.*;

public class Main {
    static final long MOD = (long)Math.pow(10,9)+7;
    static long P(long n, long r) {
        return factorial(n).divide(factorial(n-r)).longValue();
    }
    static long C(long n, long r) {
        return P(n,r).divide(factorial(r)).longValue();
    }
    static long H(long n, long r) {
        return C(n+r-1,r);
    }
    static BigInteger factorial(long n) {
        BigInteger res = BigInteger.ONE;
        for (long i = 2; i <= n; i++) {
            res = res.multiply(BigInteger.valueOf(i));
        }
        return res;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        long k = sc.nextLong();
        System.out.println(C(k,n)%MOD);
    }
}
```

## 7.

Translate the following python code to java and enclose your solution inside ```java```:
```
# ball and box 7
MOD = pow(10,9)+7
from math import factorial
def P(n,r):
    return factorial(n)//factorial(n-r)
def C(n,r):
    return P(n,r)//factorial(r)
def H(n,r):
    return C(n+r-1,r)
n, k = map(int, input().split())

print(C(k,n)%MOD if n < k else 0 if n > k else 1)

```

java code:
```java
import java.util.*;
import java.math.*;

public class Main {
    static final long MOD = (long)Math.pow(10,9)+7;
    static long P(long n, long r) {
        return factorial(n).divide(factorial(n-r)).longValue();
    }
    static long C(long n, long r) {
        return P(n,r).divide(factorial(r)).longValue();
    }
    static long H(long n, long r) {
        return C(n+r-1,r);
    }
    static BigInteger factorial(long n) {
        BigInteger res = BigInteger.ONE;
        for (long i = 2; i <= n; i++) {
            res = res.multiply(BigInteger.valueOf(i));
        }
        return res;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        long k = sc.nextLong();
        System.out.println(C(k,n)%MOD);
    }
}
```

## 8.

Translate the following python code to java and enclose your solution inside ```java```:
```
# ball and box 8
MOD = pow(10,9)+7
from math import factorial
def P(n,r):
    return factorial(n)//factorial(n-r)
def C(n,r):
    return P(n,r)//factorial(r)
def H(n,r):
    return C(n+r-1,r)
n, k = map(int, input().split())

print(C(k,n)%MOD if n < k else 0 if n > k else 1)

```

java code:
```java
import java.util.*;
import java.math.*;

public class Main {
    static final long MOD = (long)Math.pow(10,9)+7;
    static long P(long n, long r) {
        return factorial(n).divide(factorial(n-r)).longValue();
    }
    static long C(long n, long r) {
        return P(n,r).divide(factorial(r)).longValue();
    }
    static long H(long n, long r) {
        return C(n+r-1,r);
    }
    static BigInteger factorial(long n) {
        BigInteger res = BigInteger.ONE;
        for (long i = 2; i <= n; i++) {
            res = res.multiply(BigInteger.valueOf(i));
        }
        return res;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        long k = sc.nextLong();
        System.out.println(C(k,n)%MOD);
    }
}
```

## 9.

Translate the following python code to java and enclose your solution inside ```java```:
```
# ball and box 9
MOD = pow(10,9)+7
from math import factorial
def P(n,r):
    return factorial(n)//factorial(n-r)
def C(n,r):
    return P(n,r)//factorial(r)
def H(n,r):
    return C(n+r-1,r)
n, k = map(int, input().split())

print(C(k,n)%MOD if n < k else 0 if n > k else 1)

```

java code:
```java
import java.util.*;
import java.math.*;

public class Main {
    static final long MOD = (long)Math.pow(10,9)+7;
    static long P(long n, long r) {
        return factorial(n).divide(factorial(n-r)).longValue();
    }
    static long C(long n, long r) {
        return P(n,r).divide(factorial(r)).longValue();
    }
    static long H(long n, long r) {
        return C(n+r-1,r);
    }
    static BigInteger factorial(long n) {
        BigInteger res = BigInteger.ONE;
        for (long i = 2; i <= n; i++) {
            res = res.multiply(BigInteger.valueOf(i));
        }
        return res;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        long k = sc.nextLong();
        System.out.println(C(k,n)%MOD);
    }
}
```

## 10.

Translate the following python code to java and en
