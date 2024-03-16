
```
import math

def factorization(n):
    list = []
    tmp = n
    for i in range(2, int(math.sqrt(n))+1):
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
for i in range(2, N+1):
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
        for j in range(i+1, len(values)):
            if values[j] >= 4:
                for k in range(len(values)):
                    if i == k or j == k:
                        continue
                    if values[k] >= 2:
                        ans += 1
print(ans)
```

## 03214

Translate the following java code to python and enclose your solution inside ```python```:
```
import java.util.*;

public class p03214 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = Integer.parseInt(sc.next());
        int[] a = new int[N];
        for (int i=0;i<N;i++) {
            a[i] = Integer.parseInt(sc.next());
        }
        int ans = 0;
        for (int i=0;i<N;i++) {
            for (int j=i+1;j<N;j++) {
                for (int k=j+1;k<N;k++) {
                    if (a[i]+a[j]+a[k]>=22) {
                        ans++;
                    }
                }
            }
        }
        System.out.println(ans);
    }
}
```

python code:
```
N = int(input())
a = [int(x) for x in input().split()]
ans = 0
for i in range(N):
    for j in range(i+1, N):
        for k in range(j+1, N):
            if a[i] + a[j] + a[k] >= 22:
                ans += 1
print(ans)
```

## 03215

Translate the following java code to python and enclose your solution inside ```python```:
```
import java.util.*;

public class p03215 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = Integer.parseInt(sc.next());
        int[] a = new int[N];
        for (int i=0;i<N;i++) {
            a[i] = Integer.parseInt(sc.next());
        }
        int ans = 0;
        for (int i=0;i<N;i++) {
            for (int j=i+1;j<N;j++) {
                for (int k=j+1;k<N;k++) {
                    for (int l=k+1;l<N;l++) {
                        if (a[i]+a[j]+a[k]+a[l]>=30) {
                            ans++;
                        }
                    }
                }
            }
        }
        System.out.println(ans);
    }
}
```

python code:
```
N = int(input())
a = [int(x) for x in input().split()]
ans = 0
for i in range(N):
    for j in range(i+1, N):
        for k in range(j+1, N):
            for l in range(k+1, N):
                if a[i] + a[j] + a[k] + a[l] >= 30:
                    ans += 1
print(ans)
```

## 03216

Translate the following java code to python and enclose your solution inside ```python```:
```
import java.util.*;

public class p03216 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = Integer.parseInt(sc.next());
        int[] a = new int[N];
        for (int i=0;i<N;i++) {
            a[i] = Integer.parseInt(sc.next());
        }
        int ans = 0;
        for (int i=0;i<N;i++) {
            for
