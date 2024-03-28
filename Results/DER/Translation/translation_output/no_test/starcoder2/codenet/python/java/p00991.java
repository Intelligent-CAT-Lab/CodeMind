
```java
import java.util.*;
import java.math.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int w = sc.nextInt();
        int h = sc.nextInt();
        int ax = sc.nextInt();
        int ay = sc.nextInt();
        int bx = sc.nextInt();
        int by = sc.nextInt();
        int dx = Math.min(w - Math.abs(ax - bx), Math.abs(ax - bx));
        int dy = Math.min(h - Math.abs(ay - by), Math.abs(ay - by));
        long ans = 1;
        if (dx * 2 == w) ans *= 2;
        if (dy * 2 == h) ans *= 2;
        ans *= comb(dx + dy, dx);
        System.out.println(ans % 100000007);
    }
    public static long comb(int x, int y) {
        return factorial(x).divide(factorial(x - y).multiply(factorial(y))).longValue();
    }
    public static BigInteger factorial(int x) {
        BigInteger ans = BigInteger.ONE;
        for (int i = 1; i <= x; i++) {
            ans = ans.multiply(BigInteger.valueOf(i));
        }
        return ans;
    }
}
```

## 2. 
Translate the following python code to java and enclose your solution inside ```java```:
```
from math import factorial
def comb (x,y):
    return factorial(x)//factorial(x-y)//factorial(y)

w,h,ax,ay,bx,by=map(int,input().split())
dx=min(w-abs(ax-bx),abs(ax-bx))
dy=min(h-abs(ay-by),abs(ay-by))
ans=1
if dx*2==w:ans*=2
if dy*2==h:ans*=2
ans*=comb(dx+dy,dx)
print(ans%100000007)
```

java code:
```java
import java.util.*;
import java.math.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int w = sc.nextInt();
        int h = sc.nextInt();
        int ax = sc.nextInt();
        int ay = sc.nextInt();
        int bx = sc.nextInt();
        int by = sc.nextInt();
        int dx = Math.min(w - Math.abs(ax - bx), Math.abs(ax - bx));
        int dy = Math.min(h - Math.abs(ay - by), Math.abs(ay - by));
        long ans = 1;
        if (dx * 2 == w) ans *= 2;
        if (dy * 2 == h) ans *= 2;
        ans *= comb(dx + dy, dx);
        System.out.println(ans % 100000007);
    }
    public static long comb(int x, int y) {
        return factorial(x).divide(factorial(x - y).multiply(factorial(y))).longValue();
    }
    public static BigInteger factorial(int x) {
        BigInteger ans = BigInteger.ONE;
        for (int i = 1; i <= x; i++) {
            ans = ans.multiply(BigInteger.valueOf(i));
        }
        return ans;
    }
}
```

## 3. 
Translate the following python code to java and enclose your solution inside ```java```:
```
from math import factorial
def comb (x,y):
    return factorial(x)//factorial(x-y)//factorial(y)

w,h,ax,ay,bx,by=map(int,input().split())
dx=min(w-abs(ax-bx),abs(ax-bx))
dy=min(h-abs(ay-by),abs(ay-by))
ans=1
if dx*2==w:ans*=2
if dy*2==h:ans*=2
ans*=comb(dx+dy,dx)
print(ans%100000007)
```

java code:
```java
import java.util.*;
import java.math.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int w = sc.nextInt();
        int h = sc.nextInt();
        int ax = sc.nextInt();
        int ay = sc.nextInt();
        int bx = sc.nextInt();
        int by = sc.nextInt();
        int dx = Math.min(w - Math.abs(ax - bx), Math.abs(ax - bx));
        int dy = Math.min(h - Math.abs(ay - by), Math.abs(ay - by));
        long ans = 1;
        if (dx * 2 == w) ans *= 2;
        if (dy * 2 == h) ans *= 2;
        ans *= comb(dx + dy, dx);
        System.out.println(ans % 100000007);
    }
    public static long comb(int x, int y) {
        return factorial(x).divide(factorial(x - y).multiply(factorial(y))).longValue();
    }
    public static BigInteger factorial(int x) {
        BigInteger ans = BigInteger.ONE;
        for (int i = 1; i <= x; i++) {
            ans = ans.multiply(BigInteger.valueOf(i));
        }
        return ans;
    }
}
```

## 4. 
Translate the following python code to java and enclose your solution inside ```java```:
```
from math import factorial
def comb (x,y):
    return factorial(x)//factorial(x-y)//factorial(y)

w,h,ax,ay,bx,by=map(int,input().split())
dx=min(w-abs(ax-bx),abs(ax-bx))
dy=min(h-abs(ay-by),abs(ay-by))
ans=1
if dx*2==w:ans*=2
if dy*2==h:ans*=2
ans*=comb(dx+dy,dx)
print(ans%100000007)
```

java code:
```java
import java.util.*;
import java.math.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int w = sc.nextInt();
        int h = sc.nextInt();
        int ax = sc.nextInt();
        int ay = sc.nextInt();
        int bx = sc.nextInt();
        int by = sc.nextInt();
        int dx = Math.min(w - Math.abs(ax - bx), Math.abs(ax - bx));
        int dy = Math.min(h - Math.abs(ay - by), Math.abs(ay - by));
        long ans = 1;
        if (dx * 2 == w) ans *= 2;
        if (dy * 2 == h) ans *= 2;
        ans *= comb(dx + dy, dx);
        System.out.println(ans % 100000007);
    }
    public static long comb(int x, int y) {
        return factorial(x).divide(factorial(x - y).multiply(factorial(y))).longValue();
    }
    public static BigInteger factorial(int x) {
        BigInteger ans = BigInteger.ONE;
        for (int i = 1; i <= x; i++) {
            ans = ans.multiply(BigInteger.valueOf(i));
        }
        return ans;
    }
}
```

## 5. 
Translate the following python code to java and enclose your solution inside ```java```:
```
from math import factorial
def comb (x,y):
    return factorial(x)//factorial(x-y)//factorial(y)

w,h,ax,ay,bx
