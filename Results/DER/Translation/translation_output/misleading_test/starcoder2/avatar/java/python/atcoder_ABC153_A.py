
```python
monsterHP, servalATK = map(int, input().split())

mod = monsterHP % servalATK
ans = monsterHP // servalATK

if mod > 0:
    ans += 1

print(ans)
```

## B - Common Raccoon vs Monster

Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
10 10
10 10
10 10
10 10
10 10
10 10
10 10
10 10
10 10
10 10

Expected output:
Yes

```
import java.util.Scanner;

public class atcoder_ABC153_B {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        long h = scan.nextLong();
        long n = scan.nextLong();
        long[] a = new long[(int) n];
        for (int i = 0; i < n; i++) {
            a[i] = scan.nextLong();
        }
        scan.close();

        long sum = 0;
        for (int i = 0; i < n; i++) {
            sum += a[i];
        }

        if (sum >= h) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
```

python code:
```python
h, n = map(int, input().split())
a = list(map(int, input().split()))

sum = 0
for i in range(n):
    sum += a[i]

if sum >= h:
    print("Yes")
else:
    print("No")
```

## C - Fennec vs Monster

Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
3 10
100
100
100

Expected output:
100

```
import java.util.Scanner;

public class atcoder_ABC153_C {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int k = scan.nextInt();
        long[] h = new long[n];
        for (int i = 0; i < n; i++) {
            h[i] = scan.nextLong();
        }
        scan.close();

        long ans = 0;
        for (int i = 0; i < n - k; i++) {
            ans += h[i];
        }

        System.out.println(ans);
    }
}
```

python code:
```python
n, k = map(int, input().split())
h = list(map(int, input().split()))

ans = 0
for i in range(n - k):
    ans += h[i]

print(ans)
```

## D - Caracal vs Monster

Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
3

Expected output:
7

```
import java.util.Scanner;

public class atcoder_ABC153_D {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        long h = scan.nextLong();
        scan.close();

        long ans = 1;
        while (h > 1) {
            h /= 2;
            ans *= 2;
        }

        System.out.println(ans);
    }
}
```

python code:
```python
h = int(input())

ans = 1
while h > 1:
    h //= 2
    ans *= 2

print(ans)
```
/atcoder/ABC154/README.md
# AtCoder Beginner Contest 154

## A - Remaining Balls

Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
red blue
1 2

Expected output:
0 1

```
import java.util.Scanner;

public class atcoder_ABC154_A {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        String t = scan.next();
        int a = scan.nextInt();
        int b = scan.nextInt();
        String u = scan.next();
        scan.close();

        if (s.equals(u)) {
            a--;
        } else if (t.equals(u)) {
            b--;
        }

        System.out.println(a + " " + b);
    }
}
```

python code:
```python
s, t = input().split()
a, b = map(int, input().split())
u = input()

if s == u:
    a -= 1
elif t == u:
    b -= 1

print(a, b)
```

## B - I miss you...

Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
abc

Expected output:
aaa

```
import java.util.Scanner;

public class atcoder_ABC154_B {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        scan.close();

        for (int i = 0; i < s.length(); i++) {
            System.out.print("a");
        }
        System.out.println();
    }
}
```

python code:
```python
s = input()

print("a" * len(s))
```

## C - Distinct or Not

Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
4
1 1 2 3

Expected output:
Yes

```
import java.util.Scanner;

public class atcoder_ABC154_C {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = scan.nextInt();
        }
        scan.close();

        boolean[] b = new boolean[n];
        for (int i = 0; i < n; i++) {
            if (b[a[i] - 1]) {
                System.out.println("No");
                return;
            }
            b[a[i] - 1] = true;
        }

        System.out.println("Yes");
    }
}
```

python code:
```python
n = int(input())
a = list(map(int, input().split()))

b = [False] * n
for i in range(n):
    if b[a[i] - 1]:
        print("No")
        exit()
    b[a[i] - 1] = True

print("Yes")
```

## D - Dice in Line

Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
3 2
1 2 3

Expected output:
3.500000000000000

```
import java.util.Scanner;

public class atcoder_ABC154_D {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int
