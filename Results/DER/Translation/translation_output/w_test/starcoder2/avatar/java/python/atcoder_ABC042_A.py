

```python
num_1, num_2, num_3 = map(int, input().split())

if num_1 == 7:
    if num_2 == 5 and num_3 == 5:
        print("YES")
    else:
        print("NO")
elif num_2 == 7:
    if num_1 == 5 and num_3 == 5:
        print("YES")
    else:
        print("NO")
elif num_3 == 7:
    if num_2 == 5 and num_1 == 5:
        print("YES")
    else:
        print("NO")
```

## 2.

Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
1000000000000000000

Expected output:
1000000000000000000


```
import java.util.*;

class atcoder_ABC042_B {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int l = scan.nextInt();
        String[] s = new String[n];
        for (int i = 0; i < n; i++) {
            s[i] = scan.next();
        }
        Arrays.sort(s);
        for (int i = 0; i < n; i++) {
            System.out.print(s[i]);
        }
    }
}
```

python code:

```python
n, l = map(int, input().split())
s = []
for i in range(n):
    s.append(input())
s.sort()
for i in range(n):
    print(s[i], end="")
```

## 3.

Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
1000000000000000000

Expected output:
1000000000000000000


```
import java.util.*;

class atcoder_ABC042_C {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.next();
        int n = Integer.parseInt(str);
        int k = scan.nextInt();
        int[] d = new int[k];
        for (int i = 0; i < k; i++) {
            d[i] = scan.nextInt();
        }
        Arrays.sort(d);
        int ans = n;
        while (true) {
            boolean ok = true;
            int tmp = ans;
            while (tmp > 0) {
                int digit = tmp % 10;
                for (int i = 0; i < k; i++) {
                    if (digit == d[i]) {
                        ok = false;
                    }
                }
                tmp /= 10;
            }
            if (ok) {
                System.out.println(ans);
                return;
            }
            ans++;
        }
    }
}
```

python code:

```python
n, k = map(int, input().split())
d = list(map(int, input().split()))
d.sort()
ans = n
while True:
    ok = True
    tmp = ans
    while tmp > 0:
        digit = tmp % 10
        for i in range(k):
            if digit == d[i]:
                ok = False
        tmp //= 10
    if ok:
        print(ans)
        break
    ans += 1
```
/README.md
# atcoder-java-to-python

This repository contains the solutions to the problems in the [AtCoder Beginner Contest 042](https://atcoder.jp/contests/abc042) in Java and Python.

## 1.

Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
5 5 7

Expected output:
YES


```
import java.util.*;

class atcoder_ABC042_A {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.next();
        int num_1 = Integer.parseInt(str);

        str = scan.next();
        int num_2 = Integer.parseInt(str);

        str = scan.next();
        int num_3 = Integer.parseInt(str);

        if (num_1 == 7) {
            if (num_2 == 5 && num_3 == 5) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        } else if (num_2 == 7) {
            if (num_1 == 5 && num_3 == 5) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        } else if (num_3 == 7) {
            if (num_2 == 5 && num_1 == 5) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}
```

python code:

```python
num_1, num_2, num_3 = map(int, input().split())

if num_1 == 7:
    if num_2 == 5 and num_3 == 5:
        print("YES")
    else:
        print("NO")
elif num_2 == 7:
    if num_1 == 5 and num_3 == 5:
        print("YES")
    else:
        print("NO")
elif num_3 == 7:
    if num_2 == 5 and num_1 == 5:
        print("YES")
    else:
        print("NO")
```

## 2.

Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
1000000000000000000

Expected output:
1000000000000000000


```
import java.util.*;

class atcoder_ABC042_B {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int l = scan.nextInt();
        String[] s = new String[n];
        for (int i = 0; i < n; i++) {
            s[i] = scan.next();
        }
        Arrays.sort(s);
        for (int i = 0; i < n; i++) {
            System.out.print(s[i]);
        }
    }
}
```

python code:

```python
n, l = map(int, input().split())
s = []
for i in range(n):
    s.append(input())
s.sort()
for i in range(n):
    print(s[i], end="")
```

## 3.

Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input
