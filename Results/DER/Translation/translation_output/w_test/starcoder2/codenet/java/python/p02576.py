

```python
n, x, t = map(int, input().split())
ans = 0
tako = 0
while n > tako:
    ans += t
    tako += x
print(ans)
```

## 02577

Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
10 10 10

Expected output:
1000


```
import java.util.Scanner;

public class p02577 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a, b, c;
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();
        int ans = a * b * c;
        int[] cnt = new int[10];
        while (ans > 0) {
            cnt[ans % 10]++;
            ans /= 10;
        }
        for (int i = 0; i < 10; i++) {
            System.out.println(cnt[i]);
        }
        sc.close();
    }
}
```

python code:

```python
a, b, c = map(int, input().split())
ans = a * b * c
cnt = [0] * 10
while ans > 0:
    cnt[ans % 10] += 1
    ans //= 10
for i in range(10):
    print(cnt[i])
```

## 02581

Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
10 10

Expected output:
10
20
30
40
50
60
70
80
90
100
174


```
import java.util.Scanner;

public class p02581 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m, n;
        m = sc.nextInt();
        n = sc.nextInt();
        int sum = 0;
        boolean isPrime = false;
        for (int i = m; i <= n; i++) {
            isPrime = true;
            for (int j = 2; j * j <= i; j++) {
                if (i % j == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                sum += i;
                System.out.println(i);
            }
        }
        if (sum == 0) {
            System.out.println(-1);
        } else {
            System.out.println(sum);
        }
        sc.close();
    }
}
```

python code:

```python
m, n = map(int, input().split())
sum = 0
for i in range(m, n + 1):
    isPrime = True
    for j in range(2, int(i ** 0.5) + 1):
        if i % j == 0:
            isPrime = False
            break
    if isPrime:
        sum += i
        print(i)
if sum == 0:
    print(-1)
else:
    print(sum)
```

## 02588

Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
472
385

Expected output:
2360
3776
1416
181720


```
import java.util.Scanner;

public class p02588 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a, b;
        a = sc.nextInt();
        b = sc.nextInt();
        System.out.println(a * (b % 10));
        System.out.println(a * (b / 10 % 10));
        System.out.println(a * (b / 100));
        System.out.println(a * b);
        sc.close();
    }
}
```

python code:

```python
a, b = map(int, input().split())
print(a * (b % 10))
print(a * (b // 10 % 10))
print(a * (b // 100))
print(a * b)
```

## 02606

Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
7 6
1 2
2 3
1 5
5 2
5 6
4 7

Expected output:
4


```
import java.util.Scanner;

public class p02606 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, m;
        n = sc.nextInt();
        m = sc.nextInt();
        int[][] adj = new int[n + 1][n + 1];
        for (int i = 0; i < m; i++) {
            int a, b;
            a = sc.nextInt();
            b = sc.nextInt();
            adj[a][b] = 1;
            adj[b][a] = 1;
        }
        int[] visited = new int[n + 1];
        int ans = 0;
        for (int i = 1; i <= n; i++) {
            if (visited[i] == 0) {
                dfs(i, adj, visited);
                ans++;
            }
        }
        System.out.println(ans - 1);
        sc.close();
    }

    static void dfs(int cur, int[][] adj, int[] visited) {
        visited[cur] = 1;
        for (int i = 1; i < adj.length; i++) {
            if (adj[cur][i] == 1 && visited[i] == 0) {
                dfs(i, adj, visited);
            }
        }
    }
}
```

python code:

```python
n, m = map(int, input().split())
adj = [[0] * (n + 1) for _ in range(n + 1)]
for _ in range(m):
    a, b = map(int, input().split())
    adj[a][b] = 1
    adj[b][a] = 1
visited = [0] * (n + 1)
ans = 0
for i in range(1, n + 1):
    if visited[i] == 0:
        dfs(i, adj, visited)
        ans += 1
print(ans - 1)

def dfs(cur, adj, visited):
    visited[cur] = 1
    for i in range(1, len(adj)):
        if adj[cur][i] == 1 and visited[i] == 0:
            dfs(i, adj, visited)
```

## 02609

Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
24 18

Expected output:
6
72


```
import java.util.Scanner;

public class p02609 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a, b;
        a = sc.nextInt();
        b = sc.nextInt();
        int gcd = gcd(a, b);
        int lcm = a * b / gcd;
        System.out.println(gcd);
        System.out.println(lcm);
        sc.close();
    }

    static int gcd(int a, int b) {
        if (b == 0) {
            return a;
        }
        return gcd(
