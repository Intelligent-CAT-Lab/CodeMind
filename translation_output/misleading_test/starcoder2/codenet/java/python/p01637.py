

```python
M, rD, rR, cD, cR = map(int, input().split())

max = -1
D0 = (100 * cD + rD - 1) // rD
C0 = (100 * cR + rR - 1) // rR

for i in range(100):
    for j in range(100):
        changeD = D0 + i
        changeR = C0 + j
        jpn = M - changeD - changeR
        if jpn < 0:
            continue
        remD = changeD * rD // 100 - cD
        remR = changeR * rR // 100 - cR
        jpn += remD * 100 // rD + remR * 100 // rR
        max = max(max, jpn)

print(max)
```

## 01638

Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
1000000000000000000 1000000000000000000

Expected output:
1000000000000000000

```
import java.util.*;
import java.lang.*;
import java.math.*;
import java.io.*;
import static java.lang.Math.*;
import static java.util.Arrays.*;
import static java.util.Collections.*;

// Change
public class p01638{
    Scanner sc=new Scanner(System.in);

    long A, B;

    void run(){
        A=sc.nextLong();
        B=sc.nextLong();
        solve();
    }

    void solve(){
        long ans=0;
        for(long i=1; i<=A; i++){
            ans+=A/i;
        }
        for(long i=1; i<=B; i++){
            ans-=B/i;
        }
        println(ans+"");
    }

    void println(String s){
        System.out.println(s);
    }

    public static void main(String[] args){
        new p01638().run();
    }
}
```

python code:

```python
A, B = map(int, input().split())

ans = 0
for i in range(1, A + 1):
    ans += A // i
for i in range(1, B + 1):
    ans -= B // i

print(ans)
```

## 01639

Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
1000000000000000000 1000000000000000000

Expected output:
1000000000000000000

```
import java.util.*;
import java.lang.*;
import java.math.*;
import java.io.*;
import static java.lang.Math.*;
import static java.util.Arrays.*;
import static java.util.Collections.*;

// Change
public class p01639{
    Scanner sc=new Scanner(System.in);

    long A, B;

    void run(){
        A=sc.nextLong();
        B=sc.nextLong();
        solve();
    }

    void solve(){
        long ans=0;
        for(long i=1; i<=A; i++){
            ans+=A/i;
        }
        for(long i=1; i<=B; i++){
            ans-=B/i;
        }
        println(ans+"");
    }

    void println(String s){
        System.out.println(s);
    }

    public static void main(String[] args){
        new p01639().run();
    }
}
```

python code:

```python
A, B = map(int, input().split())

ans = 0
for i in range(1, A + 1):
    ans += A // i
for i in range(1, B + 1):
    ans -= B // i

print(ans)
```

## 01640

Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
1000000000000000000 1000000000000000000

Expected output:
1000000000000000000

```
import java.util.*;
import java.lang.*;
import java.math.*;
import java.io.*;
import static java.lang.Math.*;
import static java.util.Arrays.*;
import static java.util.Collections.*;

// Change
public class p01640{
    Scanner sc=new Scanner(System.in);

    long A, B;

    void run(){
        A=sc.nextLong();
        B=sc.nextLong();
        solve();
    }

    void solve(){
        long ans=0;
        for(long i=1; i<=A; i++){
            ans+=A/i;
        }
        for(long i=1; i<=B; i++){
            ans-=B/i;
        }
        println(ans+"");
    }

    void println(String s){
        System.out.println(s);
    }

    public static void main(String[] args){
        new p01640().run();
    }
}
```

python code:

```python
A, B = map(int, input().split())

ans = 0
for i in range(1, A + 1):
    ans += A // i
for i in range(1, B + 1):
    ans -= B // i

print(ans)
```

## 01641

Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
1000000000000000000 10000000000000000
