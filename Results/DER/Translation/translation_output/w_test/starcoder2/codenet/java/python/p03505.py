

```python
import sys

def help(K, A, B):
    if A <= B:
        return 1 if A >= K else -1
    if A >= K:
        return 1
    dif = A - B
    t = (K - A) // dif + ((K - A) % dif == 0 and 0 or 1)
    return 2 * t + 1


if __name__ == '__main__':
    K, A, B = map(int, sys.stdin.readline().strip().split())
    print(help(K, A, B))
```

## 03506

Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
1000000000000000000 1000000000000000000

Expected output:
1000000000000000000


```
import java.util.*;
import java.io.*;

import static java.lang.System.in;

public class p03506 {
    public static void main(String[] args)throws IOException{
        Scanner sc = new Scanner(System.in);
        long A = sc.nextLong(), B=sc.nextLong();
        long ans = help(A,B);
        System.out.println(ans);
    }
    static long help(long A, long B){
        long ans = 0;
        while(A>0){
            ans += A%10;
            A/=10;
        }
        while(B>0){
            ans += B%10;
            B/=10;
        }
        return ans;
    }
}

```

python code:

```python
import sys

def help(A, B):
    ans = 0
    while A > 0:
        ans += A % 10
        A //= 10
    while B > 0:
        ans += B % 10
        B //= 10
    return ans


if __name__ == '__main__':
    A, B = map(int, sys.stdin.readline().strip().split())
    print(help(A, B))
```

## 03507

Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
1000000000000000000 1000000000000000000

Expected output:
1000000000000000000


```
import java.util.*;
import java.io.*;

import static java.lang.System.in;

public class p03507 {
    public static void main(String[] args)throws IOException{
        Scanner sc = new Scanner(System.in);
        long A = sc.nextLong(), B=sc.nextLong();
        long ans = help(A,B);
        System.out.println(ans);
    }
    static long help(long A, long B){
        long ans = 0;
        while(A>0){
            ans += A%10;
            A/=10;
        }
        while(B>0){
            ans += B%10;
            B/=10;
        }
        return ans;
    }
}

```

python code:

```python
import sys

def help(A, B):
    ans = 0
    while A > 0:
        ans += A % 10
        A //= 10
    while B > 0:
        ans += B % 10
        B //= 10
    return ans


if __name__ == '__main__':
    A, B = map(int, sys.stdin.readline().strip().split())
    print(help(A, B))
```

## 03508

Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
1000000000000000000 1000000000000000000

Expected output:
1000000000000000000


```
import java.util.*;
import java.io.*;

import static java.lang.System.in;

public class p03508 {
    public static void main(String[] args)throws IOException{
        Scanner sc = new Scanner(System.in);
        long A = sc.nextLong(), B=sc.nextLong();
        long ans = help(A,B);
        System.out.println(ans);
    }
    static long help(long A, long B){
        long ans = 0;
        while(A>0){
            ans += A%10;
            A/=10;
        }
        while(B>0){
            ans += B%10;
            B/=10;
        }
        return ans;
    }
}

```

python code:

```python
import sys

def help(A, B):
    ans = 0
    while A > 0:
        ans += A % 10
        A //= 10
    while B > 0:
        ans += B % 10
        B //= 10
    return ans


if __name__ == '__main__':
    A, B = map(int, sys.stdin.readline().strip().split())
    print(help(A, B))
```

## 03509

Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
1000000000000000000 1000000000000000000

Expected output:
1000000000000000000


```
import java.util.*;
import java.io.*;

import static java.lang.System.in;

public class p03509 {
    public static void main(String[] args)throws IOException{
        Scanner sc = new Scanner(System.in);
        long A = sc.nextLong(), B=sc.nextLong();
        long ans = help(A,B);
        System.out.println(ans);
    }
    static long help(long A, long B){
        long ans = 0;
        while(A>0){
            ans += A%10;
            A/=10;
        }
        while(B>0){
            ans += B%10;
            B/=10;
        }
        return ans;
    }
}

```

python code:

```python
import sys

def help(A, B):
    ans = 0
    while A > 0:
        ans += A % 10
        A //= 10
    while B > 0:
        ans += B % 10
        B //= 10
    return ans


if __name__ == '__main__':
    A, B = map(int, sys.stdin.readline().strip().split())
    print(help(A, B))
```

## 03510

Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
1000000000000000000 1000000000000000000
