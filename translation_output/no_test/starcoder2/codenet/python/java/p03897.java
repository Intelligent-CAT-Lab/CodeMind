
```java
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int ans[][] = new int[n*n][2];
        int k = 0;
        for(int i = 0; i < n-1; i++){
            if(i%2 == 1){
                ans[k][0] = i;
                ans[k][1] = 0;
                k++;
            }
        }
        for(int i = 0; i < n-1; i++){
            if(i%6 == 1){
                for(int j = 2; j < n; j++){
                    if(j%2 == 0){
                        ans[k][0] = i;
                        ans[k][1] = j;
                        k++;
                    }
                }
            }
            if(i%6 == 4){
                for(int j = 0; j < n; j++){
                    if(j%2 == 1){
                        ans[k][0] = i;
                        ans[k][1] = j;
                        k++;
                    }
                }
            }
        }
        for(int j = 0; j < n; j++){
            if((n-1+j)%2 == 1){
                ans[k][0] = n-1;
                ans[k][1] = j;
                k++;
            }
        }
        System.out.println(k);
        for(int i = 0; i < k; i++){
            System.out.println(ans[i][0] + " " + ans[i][1]);
        }
    }
}
```


```java
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int a[] = new int[n];
        for(int i = 0; i < n; i++){
            a[i] = sc.nextInt();
        }
        int b[] = new int[m];
        for(int i = 0; i < m; i++){
            b[i] = sc.nextInt();
        }
        int ans = 0;
        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                if(a[i] == b[j]){
                    ans++;
                }
            }
        }
        System.out.println(ans);
    }
}
```
/2020-09-28/README.md
# 2020-09-28

## Problem 1

Given two arrays of integers, find the number of common elements between them.

### Input

The first line contains two integers n and m (1 ≤ n, m ≤ 1000) — the number of elements in the first and second arrays, respectively.

The second line contains n integers a1, a2, ..., an (1 ≤ ai ≤ 1000) — the elements of the first array.

The third line contains m integers b1, b2, ..., bm (1 ≤ bi ≤ 1000) — the elements of the second array.

### Output

Print the number of common elements between the arrays.

### Examples

input:
```
5 3
1 2 3 4 5
3 4 5
```
output:
```
3
```

input:
```
3 3
1 2 3
3 2 1
```
output:
```
2
```

### Solution

```python
n, m = map(int, input().split())
a = list(map(int, input().split()))
b = list(map(int, input().split()))
ans = 0
for i in range(n):
    for j in range(m):
        if a[i] == b[j]:
            ans += 1
print(ans)
```

## Problem 2

Given two arrays of integers, find the number of common elements between them.

### Input

The first line contains two integers n and m (1 ≤ n, m ≤ 1000) — the number of elements in the first and second arrays, respectively.

The second line contains n integers a1, a2, ..., an (1 ≤ ai ≤ 1000) — the elements of the first array.

The third line contains m integers b1, b2, ..., bm (1 ≤ bi ≤ 1000) — the elements of the second array.

### Output

Print the number of common elements between the arrays.

### Examples

input:
```
5 3
1 2 3 4 5
3 4 5
```
output:
```
3
```

input:
```
3 3
1 2 3
3 2 1
```
output:
```
2
```

### Solution

```python
n, m = map(int, input().split())
a = list(map(int, input().split()))
b = list(map(int, input().split()))
ans = 0
for i in range(n):
    for j in range(m):
        if a[i] == b[j]:
            ans += 1
print(ans)
```

## Problem 3

Given two arrays of integers, find the number of common elements between them.

### Input

The first line contains two integers n and m (1 ≤ n, m ≤ 1000) — the number of elements in the first and second arrays, respectively.

The second line contains n integers a1, a2, ..., an (1 ≤ ai ≤ 1000) — the elements of the first array.

The third line contains m integers b1, b2, ..., bm (1 ≤ bi ≤ 1000) — the elements of the second array.

### Output

Print the number of common elements between the arrays.

### Examples

input:
```
5 3
1 2 3 4 5
3 4 5
```
output:
```
3
```

input:
```
3 3
1 2 3
3 2 1
```
output:
```
2
```

### Solution

```python
n, m = map(int, input().split())
a = list(map(int, input().split()))
b = list(map(int, input().split()))
ans = 0
for i in range(n):
    for j in range(m):
        if a[i] == b[j]:
            ans += 1
print(ans)
```

## Problem 4

Given two arrays of integers, find the number of common elements between them.

### Input

The first line contains two integers n and m (1 ≤ n, m ≤ 1000) — the number of elements in the first and second arrays, respectively.

The second line contains n integers a1, a2, ..., an (1 ≤ ai ≤ 1000) — the elements of the first array.

The third line contains m integers b1, b2, ..., bm (1 ≤ bi ≤ 1000) — the elements of the second array.

### Output

Print the number of common elements between the arrays.

### Examples

input:
```
5 3
1 2 3 4 5
3 4 5
```
output:
```
3
```

input:
```
3 3
1 2 3
3 2 1
```
output:
```
2
```

### Solution

```python
n, m = map(int, input().split())
a = list(map(int, input().split()))
b = list(map(int,
