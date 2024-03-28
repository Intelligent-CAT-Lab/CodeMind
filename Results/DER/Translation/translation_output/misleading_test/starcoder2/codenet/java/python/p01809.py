
```python
import math

p, q = map(int, input().split())

qs = q
ans = 1

while q % p != 0:
    buf = q % p
    q = p
    p = buf

qs = q // buf

for i in range(2, int(math.sqrt(qs)) + 1):
    if qs % i == 0:
        while qs % i == 0:
            qs //= i
        ans *= i

ans *= qs

print(ans)
```

## 01810

Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
1 2

Expected output:
-60

```
import java.util.ArrayList;
import java.util.Scanner;

public class p01809{
    public static void main(String args[]) {
        ArrayList<Long> yaku = new ArrayList<Long>();

        Scanner scn = new Scanner(System.in);
        long p = scn.nextLong(), q = scn.nextLong();
        scn.close();
        long qs;
        long ans = 1;
        long bp = p,bq = q,buf = p;

        while(bq % bp != 0) {
            buf = bq % bp;
            bq = bp;
            bp = buf;
        }
        qs = q/buf;
        for(long i = 2;i <= Math.sqrt(qs);i++) {
            if(qs % i ==0) {
                while(qs % i == 0) {
                    qs /=i;
                }
                ans *= i;
            }
        }
        ans*= qs;
        System.out.println(ans);
    }
}

```

python code:
```python
import math

p, q = map(int, input().split())

qs = q
ans = 1

while q % p != 0:
    buf = q % p
    q = p
    p = buf

qs = q // buf

for i in range(2, int(math.sqrt(qs)) + 1):
    if qs % i == 0:
        while qs % i == 0:
            qs //= i
        ans *= i

ans *= qs

print(ans)
```

## 01811

Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
1 2

Expected output:
-60

```
import java.util.ArrayList;
import java.util.Scanner;

public class p01809{
    public static void main(String args[]) {
        ArrayList<Long> yaku = new ArrayList<Long>();

        Scanner scn = new Scanner(System.in);
        long p = scn.nextLong(), q = scn.nextLong();
        scn.close();
        long qs;
        long ans = 1;
        long bp = p,bq = q,buf = p;

        while(bq % bp != 0) {
            buf = bq % bp;
            bq = bp;
            bp = buf;
        }
        qs = q/buf;
        for(long i = 2;i <= Math.sqrt(qs);i++) {
            if(qs % i ==0) {
                while(qs % i == 0) {
                    qs /=i;
                }
                ans *= i;
            }
        }
        ans*= qs;
        System.out.println(ans);
    }
}

```

python code:
```python
import math

p, q = map(int, input().split())

qs = q
ans = 1

while q % p != 0:
    buf = q % p
    q = p
    p = buf

qs = q // buf

for i in range(2, int(math.sqrt(qs)) + 1):
    if qs % i == 0:
        while qs % i == 0:
            qs //= i
        ans *= i

ans *= qs

print(ans)
```

## 01812

Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
1 2

Expected output:
-60

```
import java.util.ArrayList;
import java.util.Scanner;

public class p01809{
    public static void main(String args[]) {
        ArrayList<Long> yaku = new ArrayList<Long>();

        Scanner scn = new Scanner(System.in);
        long p = scn.nextLong(), q = scn.nextLong();
        scn.close();
        long qs;
        long ans = 1;
        long bp = p,bq = q,buf = p;

        while(bq % bp != 0) {
            buf = bq % bp;
            bq = bp;
            bp = buf;
        }
        qs = q/buf;
        for(long i = 2;i <= Math.sqrt(qs);i++) {
            if(qs % i ==0) {
                while(qs % i == 0) {
                    qs /=i;
                }
                ans *= i;
            }
        }
        ans*= qs;
        System.out.println(ans);
    }
}

```

python code:
```python
import math

p, q = map(int, input().split())

qs = q
ans = 1

while q % p != 0:
    buf = q % p
    q = p
    p = buf

qs = q // buf

for i in range(2, int(math.sqrt(qs)) + 1):
    if qs % i == 0:
        while qs % i == 0:
            qs //= i
        ans *= i

ans *= qs

print(ans)
```

## 01813

Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
1 2

Expected output:
-60

```
import java.util.ArrayList;
import java.util.Scanner;

public class p01809{
    public static void main(String args[]) {
        ArrayList<Long> yaku = new ArrayList<Long>();

        Scanner scn = new Scanner(System.in);
        long p = scn.nextLong(), q = scn.nextLong();
        scn.close();
        long qs;
        long ans = 1;
        long bp = p,bq = q,buf = p;

        while(bq % bp != 0) {
            buf = bq % bp;
            bq = bp;
            bp = buf;
        }
        qs = q/buf;
        for(long i = 2;i <= Math.sqrt(qs);i++) {
            if(qs % i ==0) {
                while(qs % i == 0) {
                    qs /=i;
                }
                ans *= i;
            }
        }
        ans*= qs;
        System.out.println(ans);
    }
}

