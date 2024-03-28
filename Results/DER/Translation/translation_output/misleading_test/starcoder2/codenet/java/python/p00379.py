
```python
a, n, m = map(int, input().split())
max = int(m ** (1 / n))
ans = 0
for i in range(1, max + 1):
    x = i ** n
    str = str(x)
    y = 0
    for j in range(len(str)):
        y += int(str[j])
    if y + a == i:
        ans += 1
print(ans)
```

## 00380

Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
1000000000000000000

Expected output:
1000000000000000000

```
import java.util.Scanner;

class p00380{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        long n = sc.nextLong();
        
        long ans = 0;
        for(long i = 1; i <= n; i++) {
            ans += i;
        }
        
        System.out.println(ans);
    }
}

```

python code:
```python
n = int(input())
ans = 0
for i in range(1, n + 1):
    ans += i
print(ans)
```

## 00381

Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
1000000000000000000

Expected output:
1000000000000000000

```
import java.util.Scanner;

class p00381{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        long n = sc.nextLong();
        
        long ans = 0;
        for(long i = 1; i <= n; i++) {
            ans += i * i;
        }
        
        System.out.println(ans);
    }
}

```

python code:
```python
n = int(input())
ans = 0
for i in range(1, n + 1):
    ans += i * i
print(ans)
```

## 00382

Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
1000000000000000000

Expected output:
1000000000000000000

```
import java.util.Scanner;

class p00382{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        long n = sc.nextLong();
        
        long ans = 0;
        for(long i = 1; i <= n; i++) {
            ans += i * i * i;
        }
        
        System.out.println(ans);
    }
}

```

python code:
```python
n = int(input())
ans = 0
for i in range(1, n + 1):
    ans += i * i * i
print(ans)
```

## 00383

Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
1000000000000000000

Expected output:
1000000000000000000

```
import java.util.Scanner;

class p00383{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        long n = sc.nextLong();
        
        long ans = 0;
        for(long i = 1; i <= n; i++) {
            ans += i * i * i * i;
        }
        
        System.out.println(ans);
    }
}

```

python code:
```python
n = int(input())
ans = 0
for i in range(1, n + 1):
    ans += i * i * i * i
print(ans)
```

## 00384

Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
1000000000000000000

Expected output:
1000000000000000000

```
import java.util.Scanner;

class p00384{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        long n = sc.nextLong();
        
        long ans = 0;
        for(long i = 1; i <= n; i++) {
            ans += i * i * i * i * i;
        }
        
        System.out.println(ans);
    }
}

```

python code:
```python
n = int(input())
ans = 0
for i in range(1, n + 1):
    ans += i * i * i * i * i
print(ans)
```

## 00385

Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
1000000000000000000

Expected output:
1000000000000000000

```
import java.util.Scanner;

class p00385{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        long n = sc.nextLong();
        
        long ans = 0;
        for(long i = 1; i <= n; i++) {
            ans += i * i * i * i * i * i;
        }
        
        System.out.println(ans);
    }
}

```

python code:
```python
n = int(input())
ans = 0
for i in range(1, n + 1):
    ans += i * i * i * i * i * i
print(ans)
```

## 00386

Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
1000000000000000000

Expected output:
1000000000000000000

```
import java.util.Scanner;

class p00386{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        long n = sc.nextLong();
        
        long ans = 0;
        for(long i = 1; i <= n;
