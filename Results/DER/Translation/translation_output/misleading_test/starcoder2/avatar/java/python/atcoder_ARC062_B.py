
```python
input = input()
p = 0
g = 1
result = 0
for i in range(1, len(input)):
    if input[i] == 'g':
        if p + 1 <= g:
            result += 1
            p += 1
        else:
            g += 1
    else:
        if p + 1 <= g:
            p += 1
        else:
            g += 1
            result -= 1
print(result)
```


```

python code:
```python
n = int(input())
a = list(map(int, input().split()))
b = list(map(int, input().split()))

a.sort()
b.sort()

result = 0
for i in range(n):
    result += a[i] * b[i]
print(result)
```
/atcoder/atcoder_ABC088_B.md
# atcoder ABC088 B

## Problem

https://atcoder.jp/contests/abc088/tasks/abc088_b

## Solution

```
import java.util.Scanner;
import java.util.Arrays;

public class atcoder_ABC088_B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        int[] b = new int[n];
        for (int i = 0; i < n; i++) {
            b[i] = sc.nextInt();
        }
        
        Arrays.sort(a);
        Arrays.sort(b);
        
        int result = 0;
        for (int i = 0; i < n; i++) {
            result += a[i] * b[i];
        }
        
        System.out.println(result);
    }
}
```

python code:
```python
n = int(input())
a = list(map(int, input().split()))
b = list(map(int, input().split()))

a.sort()
b.sort()

result = 0
for i in range(n):
    result += a[i] * b[i]
print(result)
```

## Problem

https://atcoder.jp/contests/abc088/tasks/abc088_b

## Solution

```
import java.util.Scanner;
import java.util.Arrays;

public class atcoder_ABC088_B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        int[] b = new int[n];
        for (int i = 0; i < n; i++) {
            b[i] = sc.nextInt();
        }
        
        Arrays.sort(a);
        Arrays.sort(b);
        
        int result = 0;
        for (int i = 0; i < n; i++) {
            result += a[i] * b[i];
        }
        
        System.out.println(result);
    }
}
```

python code:
```python
n = int(input())
a = list(map(int, input().split()))
b = list(map(int, input().split()))

a.sort()
b.sort()

result = 0
for i in range(n):
    result += a[i] * b[i]
print(result)
```

## Problem

https://atcoder.jp/contests/abc088/tasks/abc088_b

## Solution

```
import java.util.Scanner;
import java.util.Arrays;

public class atcoder_ABC088_B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        int[] b = new int[n];
        for (int i = 0; i < n; i++) {
            b[i] = sc.nextInt();
        }
        
        Arrays.sort(a);
        Arrays.sort(b);
        
        int result = 0;
        for (int i = 0; i < n; i++) {
            result += a[i] * b[i];
        }
        
        System.out.println(result);
    }
}
```

python code:
```python
n = int(input())
a = list(map(int, input().split()))
b = list(map(int, input().split()))

a.sort()
b.sort()

result = 0
for i in range(n):
    result += a[i] * b[i]
print(result)
```

## Problem

https://atcoder.jp/contests/abc088/tasks/abc088_b

## Solution

```
import java.util.Scanner;
import java.util.Arrays;

public class atcoder_ABC088_B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        int[] b = new int[n];
        for (int i = 0; i < n; i++) {
            b[i] = sc.nextInt();
        }
        
        Arrays.sort(a);
        Arrays.sort(b);
        
        int result = 0;
        for (int i = 0; i < n; i++) {
            result += a[i] * b[i];
        }
        
        System.out.println(result);
    }
}
```

python code:
```python
n = int(input())
a = list(map(int, input().split()))
b = list(map(int, input().split()))

a.sort()
b.sort()

result = 0
for i in range(n):
    result += a[i] * b[i]
print(result)
```

## Problem

https://atcoder.jp/contests/abc088/tasks/abc088_b

## Solution

```
import java.util.Scanner;
import java.util.Arrays;

public class atcoder_ABC088_B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        int[] b = new int[n];
        for (int i = 0; i < n; i++) {
            b[i] = sc.nextInt();
        }
        
        Arrays.sort(a);
        Arrays.sort(b);
        
        int result = 0;
        for (int i = 0; i < n; i++) {
            result += a[i] * b[i];
        }
        
        System.out.println(result);
    }
}
```

python code:
```python
n = int(input())
a = list(map(int, input().split()))
b = list(map(int, input().split()))

a.sort()
b.sort()

result =
