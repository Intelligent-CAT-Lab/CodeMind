
```python

```
/atcoder/atcoder_ABC081_B.md
# atcoder ABC081 B - Shift only

## Problem

https://atcoder.jp/contests/abc081/tasks/abc081_b

## Solution

Translate the following java code to python and enclose your solution inside ```python```:
```
import java.util.Scanner;

public class atcoder_ABC081_B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        int result = 0;
        boolean flag = true;
        
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        
        while (flag) {
            flag = false;
            for (int i = 0; i < n; i++) {
                if (a[i] % 2 == 0) {
                    a[i] /= 2;
                    flag = true;
                }
            }
            if (flag) {
                result++;
            }
        }
        
        System.out.println(result);
    }
}
```

python code:
```python
n = int(input())
a = list(map(int, input().split()))

result = 0
flag = True

while flag:
    flag = False
    for i in range(n):
        if a[i] % 2 == 0:
            a[i] /= 2
            flag = True
    if flag:
        result += 1

print(result)
```

## Solution 2

Tt(input())
a = list(map(int, input().split()))

result = 0

while all(i % 2 == 0 for i in a):
    a = [i / 2 for i in a]
    result += 1

print(result)
```
ranslate the following python code to java and enclose your solution inside ```java```:
```python
n = in/atcoder/atcoder_ABC086_A.md
# atcoder ABC086 A - Product

## Problem

https://atcoder.jp/contests/abc086/tasks/abc086_a

## Solution

Translate the following python code to java and enclose your solution inside ```java```:
```python
a, b = map(int, input().split())

if a * b % 2 == 0:
    print('Even')
else:
    print('Odd')
```

java code:
```java
import java.util.Scanner;

public class atcoder_ABC086_A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        
        if (a * b % 2 == 0) {
            System.out.println("Even");
        } else {
            System.out.println("Odd");
        }
    }
}
```
/atcoder/atcoder_ABC081_A.md
# atcoder ABC081 A - Placing Marbles

## Problem

https://atcoder.jp/contests/abc081/tasks/abc081_a

## Solution

Translate the following python code to java and enclose your solution inside ```java```:
```python
s = input()

print(s.count('1'))
```

java code:
```java
import java.util.ntln(s.chars().filter(i -> i == '1').count());
    }
}
```
Scanner;

public class atcoder_ABC081_A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        
        // Java 8 Stream API
        System.out.pri/atcoder/atcoder_ABC087_B.md
# atcoder ABC087 B - Coins

## Problem

https://atcoder.jp/contests/abc087/tasks/abc087_b

## Solution

Translate the following python code to java and enclose your solution inside ```java```:
```python
a = int(input())
b = int(input())
c = int(input())
x = int(input())

result = 0

for i in range(a + 1):
    for j in range(b + 1):
        for k in range(c + 1):
            if 500 * i + 100 * j + 50 * k == x:
                result += 1

print(result)
```

java code:
```java
import java.util.Scanner;

public class atcoder_ABC087_B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int x = sc.nextInt();
        int result = 0;
        
        for (int i = 0; i <= a; i++) {
            for (int j = 0; j <= b; j++) {
                for (int k = 0; k <= c; k++) {
                    if (500 * i + 100 * j + 50 * k == x) {
                        result++;
                    }
                }
            }
        }
        
        System.out.println(result);
    }
}
```
/atcoder/atcoder_ABC088_B.md
# atcoder ABC088 B - Card Game for Two

## Problem

https://atcoder.jp/contests/abc088/tasks/abc088_b

## Solution

Translate the following python code to java and enclose your solution inside ```java```:
```python
n = int(input())
a = list(map(int, input().split()))

a.sort(reverse=True)

alice = 0
bob = 0

for i in range(n):
    if i % 2 == 0:
        alice += a[i]
    else:
        bob += a[i]

print(alice - bob)
```

java code:
```java
import java.util.Scanner;
import java.util.Arrays;

public class atcoder_ABC088_B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        int alice = 0;
        int bob = 0;
        
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        
        Arrays.sort(a);
        
        for (int i = 0; i < n; i++) {
            if (i % 2 == 0) {
                alice += a[i];
            } else {
                bob += a[i];
            }
        }
        
        System.out.println(alice - bob);
    }
}
```
  }
}
```
/atcoder/atcoder_ABC085_B.md
# atcoder ABC085 B - Kagami Mochi

## Problem

https://atcoder.jp/contests/abc085/tasks/abc085_b

## Solution

Translate the following python code to java and enclose your solution inside ```java```:
```python
n = int(input())
d = [int(input()) for _ in range(n)]

print(len(set(d)))
```

java code:
```java
import java.util.Scanner;
import java.util.HashSet;

public class atcoder_ABC085_B {
    public static void main(
