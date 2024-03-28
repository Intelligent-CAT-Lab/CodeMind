
```
import math

def factorization(n):
    list = []
    tmp = n
    for i in range(2, int(math.sqrt(n)) + 1):
        if tmp % i == 0:
            cnt = 0
            while tmp % i == 0:
                cnt += 1
                tmp //= i
            list.append([i, cnt])
    if tmp != 1:
        list.append([tmp, 1])
    if len(list) == 0:
        list.append([n, 1])
    return list

def add_map(x, y):
    if x in map:
        map[x] += y
    else:
        map[x] = y

N = int(input())
map = {}
for i in range(2, N + 1):
    list = factorization(i)
    for array in list:
        add_map(array[0], array[1])

values = list(map.values())
values.sort(reverse=True)
ans = 0
for i in range(len(values)):
    if values[i] >= 74:
        ans += 1
for i in range(len(values)):
    if values[i] >= 24:
        for j in range(len(values)):
            if i == j:
                continue
            if values[j] >= 2:
                ans += 1
for i in range(len(values)):
    if values[i] >= 14:
        for j in range(len(values)):
            if i == j:
                continue
            if values[j] >= 4:
                ans += 1
for i in range(len(values)):
    if values[i] >= 4:
        for j in range(i + 1, len(values)):
            if values[j] >= 4:
                for k in range(len(values)):
                    if i == k or j == k:
                        continue
                    if values[k] >= 2:
                        ans += 1
print(ans)
```

## p03214

Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
10

Expected output:
1

```
import java.util.*;

public class p03214 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = Integer.parseInt(sc.next());
        int ans = 0;
        for (int i=1;i<=N;i++) {
            int tmp = i;
            while (tmp%2==0) {
                tmp/=2;
            }
            while (tmp%3==0) {
                tmp/=3;
            }
            while (tmp%5==0) {
                tmp/=5;
            }
            if (tmp==1) {
                ans++;
            }
        }
        System.out.println(ans);
    }
}
```

python code:
```
N = int(input())
ans = 0
for i in range(1, N + 1):
    tmp = i
    while tmp % 2 == 0:
        tmp //= 2
    while tmp % 3 == 0:
        tmp //= 3
    while tmp % 5 == 0:
        tmp //= 5
    if tmp == 1:
        ans += 1
print(ans)
```

## p03215

Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
10

Expected output:
1

```
import java.util.*;

public class p03215 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = Integer.parseInt(sc.next());
        int ans = 0;
        for (int i=1;i<=N;i++) {
            int tmp = i;
            while (tmp%2==0) {
                tmp/=2;
            }
            while (tmp%3==0) {
                tmp/=3;
            }
            while (tmp%5==0) {
                tmp/=5;
            }
            while (tmp%7==0) {
                tmp/=7;
            }
            if (tmp==1) {
                ans++;
            }
        }
        System.out.println(ans);
    }
}
```

python code:
```
N = int(input())
ans = 0
for i in range(1, N + 1):
    tmp = i
    while tmp % 2 == 0:
        tmp //= 2
    while tmp % 3 == 0:
        tmp //= 3
    while tmp % 5 == 0:
        tmp //= 5
    while tmp % 7 == 0:
        tmp //= 7
    if tmp == 1:
        ans += 1
print(ans)
```

## p03216

Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
10

Expected output:
1

```
import java.util.*;

public class p03216 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = Integer.parseInt(sc.next());
        int ans = 0;
        for (int i=1;i<=N;i++) {
            int tmp = i;
           
