
```python
s = input()
ans = 101
for i in range(26):
    target = chr(i + ord('a'))
    max = 0
    cur = 0
    for j in range(len(s)):
        if s[j] == target:
            cur = 0
        else:
            cur += 1
            max = max if max > cur else cur
    ans = ans if ans < max else max
print(ans)
```

## 3.688

Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
10 10

Expected output:
10

```
import java.util.*;
 
public class p03688{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int ans = 0;
        for(int i=1; i<=n; i++){
            for(int j=1; j<=m; j++){
                if(i%2==1){
                    if(j%2==1) ans++;
                }
                else{
                    if(j%2==0) ans++;
                }
            }
        }
        System.out.println(ans);
        return;
    }
}
```

python code:
```python
n, m = map(int, input().split())
ans = 0
for i in range(1, n + 1):
    for j in range(1, m + 1):
        if i % 2 == 1:
            if j % 2 == 1:
                ans += 1
        else:
            if j % 2 == 0:
                ans += 1
print(ans)
```

## 3.689

Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
10 10

Expected output:
10

```
import java.util.*;
 
public class p03689{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int ans = 0;
        for(int i=1; i<=n; i++){
            for(int j=1; j<=m; j++){
                if(i%2==1){
                    if(j%2==1) ans++;
                }
                else{
                    if(j%2==0) ans++;
                }
            }
        }
        System.out.println(ans);
        return;
    }
}
```

python code:
```python
n, m = map(int, input().split())
ans = 0
for i in range(1, n + 1):
    for j in range(1, m + 1):
        if i % 2 == 1:
            if j % 2 == 1:
                ans += 1
        else:
            if j % 2 == 0:
                ans += 1
print(ans)
```

## 3.690

Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
10 10

Expected output:
10

```
import java.util.*;
 
public class p03690{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int ans = 0;
        for(int i=1; i<=n; i++){
            for(int j=1; j<=m; j++){
                if(i%2==1){
                    if(j%2==1) ans++;
                }
                else{
                    if(j%2==0) ans++;
                }
            }
        }
        System.out.println(ans);
        return;
    }
}
```

python code:
```python
n, m = map(int, input().split())
ans = 0
for i in range(1, n + 1):
    for j in range(1, m + 1):
        if i % 2 == 1:
            if j % 2 == 1:
                ans += 1
        else:
            if j % 2 == 0:
                ans += 1
print(ans)
```

## 3.691

Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
10 10

Expected output:
10

```
import java.util.*;
 
public class p03691{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int ans = 0;
        for(int i=1; i<=n; i++){
            for(int j=1; j<=m; j++){
                if(i%2==1){
                    if(j%2==1) ans++;
                }
                else{
                    if(j%2==0) ans++;
                }
            }
        }
        System.out.println(ans);
        return;
    }
}
```

python code:
```python
n, m = map(int, input().split())
ans = 0
for i in range(1, n + 1):
    for j in range(1, m + 1):
        if i % 2 == 1:
            if j % 2 == 1:
                ans += 1
        else:
            if j % 2 == 0:
                ans += 1
print(ans)
```

## 3.692

Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
10 10

Expected output:
10

```
import java.util.*;
 
public class p03692{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int ans = 0;
        for(int i=1; i<=n; i++){
            for(int j=1; j<=m; j++){
                if(i%2==1){
                    if(j%2==1) ans++;
                }
                else{
                    if(j%2==0) ans++;
                }
            }
        }
        System.out.println(ans);
        return;
    }
}
```

python code:
```python
n, m = map(int, input().split())
ans = 0
for i in range(1, n + 1):
    for j in range(1, m + 1):
        if i % 2 == 1:
            if j % 2 == 1:
                ans += 1
        else:
            if j % 2 == 0:
                ans += 1
print(ans)
```

## 3.693

Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
10 10

Expected output
