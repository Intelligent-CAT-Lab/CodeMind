
```python
s = input()
c = s[0]
print(chr(ord(c)+1))
```

## 2.

Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
1 2 3

Expected output:
6

```
import java.util.*;

public class atcoder_ABC151_B {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int m = sc.nextInt();
        int sum = 0;
        for (int i = 0; i < n - 1; i++) {
            sum += sc.nextInt();
        }
        int ans = m * n - sum;
        if (ans > k) {
            System.out.println(-1);
        } else if (ans < 0) {
            System.out.println(0);
        } else {
            System.out.println(ans);
        }
    }
}
```

python code:
```python
n, k, m = map(int, input().split())
sum = 0
for i in range(n-1):
    sum += int(input())
ans = m*n - sum
if ans > k:
    print(-1)
elif ans < 0:
    print(0)
else:
    print(ans)
```

## 3.

Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
1 2 3

Expected output:
6

```
import java.util.*;

public class atcoder_ABC151_C {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] ac = new int[n][2];
        for (int i = 0; i < m; i++) {
            int p = sc.nextInt() - 1;
            String s = sc.next();
            if (ac[p][0] == 0) {
                if (s.equals("AC")) {
                    ac[p][0] = 1;
                    ac[p][1] += ac[p][1];
                } else {
                    ac[p][1]++;
                }
            }
        }
        int ac_cnt = 0;
        int wa_cnt = 0;
        for (int i = 0; i < n; i++) {
            if (ac[i][0] == 1) {
                ac_cnt++;
                wa_cnt += ac[i][1];
            }
        }
        System.out.println(ac_cnt + " " + wa_cnt);
    }
}
```

python code:
```python
n, m = map(int, input().split())
ac = [[0, 0] for i in range(n)]
for i in range(m):
    p, s = input().split()
    p = int(p) - 1
    if ac[p][0] == 0:
        if s == "AC":
            ac[p][0] = 1
            ac[p][1] += ac[p][1]
        else:
            ac[p][1] += 1
ac_cnt = 0
wa_cnt = 0
for i in range(n):
    if ac[i][0] == 1:
        ac_cnt += 1
        wa_cnt += ac[i][1]
print(ac_cnt, wa_cnt)
```


## 3.

Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
1 2 3

Expected output:
6

```
import java.util.*;

public class atcoder_ABC151_C {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] ac = new int[n][2];
        for (int i = 0; i < m; i++) {
            int p = sc.nextInt() - 1;
            String s = sc.next();
            if (ac[p][0] == 0) {
                if (s.equals("AC")) {
                    ac[p][0] = 1;
                    ac[p][1] += ac[p][1];
                } else {
                    ac[p][1]++;
                }
            }
        }
        int ac_cnt = 0;
        int wa_cnt = 0;
        for (int i = 0; i < n; i++) {
            if (ac[i][0] == 1) {
                ac_cnt++;
                wa_cnt += ac[i][1];
            }
        }
        System.out.println(ac_cnt + " " + wa_cnt);
    }
}
```

python code:
```python
n, m = map(int, input().split())
ac = [[0, 0] for i in range(n)]
for i in range(m):
    p, s = input().split()
    p = int(p) - 1
    if ac[p][0] == 0:
        if s == "AC":
            ac[p][0] = 1
            ac[p][1] += ac[p][1]
        else:
            ac[p][1] += 1
ac_cnt = 0
wa_cnt = 0
for i in range(n):
    if ac[i][0] == 1:
        ac_cnt += 1
        wa_cnt += ac[i][1]
print(ac_cnt, wa_cnt)
```

## 4.

Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
1 2 3

Expected output:
6

```
import java.util.*;

public class atcoder_ABC151_C {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] ac = new int[n][2];
        for (int i = 0; i < m; i++) {
            int p = sc.nextInt() - 1;
            String s = sc.next();
            if (ac[p][0] == 0) {
                if (s.equals("AC")) {
                    ac[p][0] = 1;
                    ac[p][1] += ac[p][1];
                } else {
                    ac[p][1]++;
                }
            }
        }
        int ac_cnt = 0;
        int wa_cnt = 0;
        for (int i = 0; i < n; i++) {
            if (ac[i][0] == 1) {
                ac_cnt++;
                wa_cnt += ac[i][1];
            }
        }
        System.out.println(ac_cnt + " " + wa_cnt);
    }
}
```

python code:
```python
n, m = map(int, input().split())
ac = [[0, 0] for i in range(n)]
for i in range(m):
    p, s = input().split()
    p = int(p) - 1
    if ac[p][0] == 0:
        if s == "AC":
            ac[p][0] = 1
            ac[p][1] += ac[p][1]
        else:
            ac[p][1] += 1
ac_cnt = 0
wa_cnt = 0
for i in range(n):
    if ac[i][0] == 1:
        ac_cnt += 1
        wa_cnt += ac[i][1]
print(ac_cnt, wa_cnt)
```

## 5.

Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
1 2 3

Expected output:
6

```
import
