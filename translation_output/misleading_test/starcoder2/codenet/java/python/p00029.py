
```python
import sys

s = sys.stdin.read().split()

r = [0] * len(s)
flag = [True] * len(s)

for i in range(len(s)):
    for j in range(i + 1, len(s)):
        if s[i] == s[j] and flag[j]:
            r[i] += 1
            flag[j] = False

max_index = 0
max_value = 0
for i in range(len(s)):
    if max_value < r[i]:
        max_value = r[i]
        max_index = i

print(s[max_index], end=' ')

max_index = 0
max_value = 0
for i in range(len(s)):
    if max_value < len(s[i]):
        max_value = len(s[i])
        max_index = i

print(s[max_index])
```

## p00030

Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
1 2 3 4 5 6 7 8 9 10

Expected output:
1 2 3 4 5 6 7 8 9 10

```
import java.util.Scanner;

public class p00030
{
    public static void main(String atg[])
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n];
        for(int i=0; i<n; i++)
        {
            a[i] = sc.nextInt();
        }
        int b[] = new int[n];
        for(int i=0; i<n; i++)
        {
            b[i] = a[i];
        }
        for(int i=0; i<n; i++)
        {
            System.out.print(b[i]+" ");
        }
    }
}
```

python code:
```python
import sys

n = int(sys.stdin.readline())
a = list(map(int, sys.stdin.readline().split()))
b = a[:]
print(' '.join(map(str, b)))
```

## p00031

Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
1 2 3 4 5 6 7 8 9 10

Expected output:
10 9 8 7 6 5 4 3 2 1

```
import java.util.Scanner;

public class p00031
{
    public static void main(String atg[])
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n];
        for(int i=0; i<n; i++)
        {
            a[i] = sc.nextInt();
        }
        int b[] = new int[n];
        for(int i=0; i<n; i++)
        {
            b[i] = a[n-i-1];
        }
        for(int i=0; i<n; i++)
        {
            System.out.print(b[i]+" ");
        }
    }
}
```

python code:
```python
import sys

n = int(sys.stdin.readline())
a = list(map(int, sys.stdin.readline().split()))
b = a[::-1]
print(' '.join(map(str, b)))
```

## p00032

Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
1 2 3 4 5 6 7 8 9 10

Expected output:
1 3 5 7 9 10 8 6 4 2

```
import java.util.Scanner;

public class p00032
{
    public static void main(String atg[])
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n];
        for(int i=0; i<n; i++)
        {
            a[i] = sc.nextInt();
        }
        int b[] = new int[n];
        for(int i=0; i<n; i++)
        {
            if(i%2==0)
            {
                b[i] = a[n-i/2-1];
            }
            else
            {
                b[i] = a[n-i/2];
            }
        }
        for(int i=0; i<n; i++)
        {
            System.out.print(b[i]+" ");
        }
    }
}
```

python code:
```python
import sys

n = int(sys.stdin.readline())
a = list(map(int, sys.stdin.readline().split()))
b = [0] * n
for i in range(n):
    if i % 2 == 0:
        b[i] = a[n - i // 2 - 1]
    else:
        b[i] = a[n - i // 2]
print(' '.join(map(str, b)))
```

## p00033

Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
1 2 3 4 5 6 7 8 9 10

Expected output:
1 2 3 4 5 6 7 8 9 10

```
import java.util.Scanner;

public class p00033
{
    public static void main(String atg[])
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n];
        for(int i=0; i<n; i++)
        {
            a[i] = sc.nextInt();
        }
        int b[] = new int[n];
        for(int i=0; i<n; i++)
        {
            b[i] = a[i];
        }
        for(int i=0; i<n; i++)
        {
            System.out.print(
