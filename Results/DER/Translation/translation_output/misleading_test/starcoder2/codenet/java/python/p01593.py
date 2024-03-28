

```python
n, m = map(int, input().split())
dp = [0] * (n + 1)
dp[0] = 1
for j in range(1, n + 1):
    for i in range(1, min(m, j) + 1):
        dp[j] += dp[j - i] / j
print(dp[n])
```

## 01594

Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
1000000000000000000

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

public class p01594{
    Scanner sc=new Scanner(System.in);

    int INF=1<<28;
    double EPS=1e-12;

    long n;

    void run(){
        n=sc.nextLong();
        solve();
    }

    void solve(){
        long ans=0;
        for(long i=1; i<=n; i*=10){
            ans+=n/i;
        }
        println(ans);
    }

    void println(String s){
        System.out.println(s);
    }

    public static void main(String[] args){
        new p01594().run();
    }
}
```

python code:

```python
n = int(input())
ans = 0
for i in range(1, n + 1):
    ans += n // i
print(ans)
```

## 01595

Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
1000000000000000000

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

public class p01595{
    Scanner sc=new Scanner(System.in);

    int INF=1<<28;
    double EPS=1e-12;

    long n;

    void run(){
        n=sc.nextLong();
        solve();
    }

    void solve(){
        long ans=0;
        for(long i=1; i<=n; i*=10){
            ans+=n/i;
        }
        println(ans);
    }

    void println(String s){
        System.out.println(s);
    }

    public static void main(String[] args){
        new p01595().run();
    }
}
```

python code:

```python
n = int(input())
ans = 0
for i in range(1, n + 1):
    ans += n // i
print(ans)
```

## 01596

Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
1000000000000000000

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

public class p01596{
    Scanner sc=new Scanner(System.in);

    int INF=1<<28;
    double EPS=1e-12;

    long n;

    void run(){
        n=sc.nextLong();
        solve();
    }

    void solve(){
        long ans=0;
        for(long i=1; i<=n; i*=10){
            ans+=n/i;
        }
        println(ans);
    }

    void println(String s){
        System.out.println(s);
    }

    public static void main(String[] args){
        new p01596().run();
    }
}
```

python code:

```python
n = int(input())
ans = 0
for i in range(1, n + 1):
    ans += n // i
print(ans)
```

## 01597

Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
1000000000000000000

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

public class p01597{
    Scanner sc=new Scanner(System.in);

    int INF=1<<28;
    double EPS=1e-12;

    long n;

    void run(){
        n=sc.nextLong();
        solve();
    }

    void solve(){
        long ans=0;
        for(long i=1; i<=n; i*=10){
            ans+=n/i;
        }
        println(ans);
    }

    void println(String s){
        System.out.println(s);
    }

    public static void main(String[] args){
        new p01597().run();
    }
}
```

python code:

```python
n = int(input())
ans = 0
for i in range(1, n + 1):
    ans += n // i
print(ans)
```

## 01598

Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
1000000000000000000

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

public class p01598{
    Scanner sc=new Scanner(System.in);

    int INF=
