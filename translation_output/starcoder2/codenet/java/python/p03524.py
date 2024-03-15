
```
S = input()
a = 0
b = 0
c = 0
for i in range(len(S)):
    x = S[i]
    if x == 'a':
        a += 1
    if x == 'b':
        b += 1
    if x == 'c':
        c += 1
if max(max(a,b),c)-min(min(a,b),c) <= 1:
    print("YES")
else:
    print("NO")
```

## 3525. 
Translate the following java code to python and enclose your solution inside ```python```:
```
import java.util.*;

public class p03525 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int[] a = new int[n];
    for (int i = 0; i < n; i++) {
      a[i] = sc.nextInt();
    }
    int ans = 0;
    for (int i = 0; i < n; i++) {
      for (int j = i+1; j < n; j++) {
        if (a[i] == a[j]) {
          ans++;
        }
      }
    }
    System.out.println(ans);
  }
}

```

python code:
```
n = int(input())
a = []
for i in range(n):
    a.append(int(input()))
ans = 0
for i in range(n):
    for j in range(i+1,n):
        if a[i] == a[j]:
            ans += 1
print(ans)
```

## 3526. 
Translate the following java code to python and enclose your solution inside ```python```:
```
import java.util.*;

public class p03526 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int[] a = new int[n];
    for (int i = 0; i < n; i++) {
      a[i] = sc.nextInt();
    }
    int ans = 0;
    for (int i = 0; i < n; i++) {
      for (int j = i+1; j < n; j++) {
        for (int k = j+1; k < n; k++) {
          if (a[i] == a[j] && a[j] == a[k]) {
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
n = int(input())
a = []
for i in range(n):
    a.append(int(input()))
ans = 0
for i in range(n):
    for j in range(i+1,n):
        for k in range(j+1,n):
            if a[i] == a[j] and a[j] == a[k]:
                ans += 1
print(ans)
```

## 3527. 
Translate the following java code to python and enclose your solution inside ```python```:
```
import java.util.*;

public class p03527 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int[] a = new int[n];
    for (int i = 0; i < n; i++) {
      a[i] = sc.nextInt();
    }
    int ans = 0;
    for (int i = 0; i < n; i++) {
      for (int j = i+1; j < n; j++) {
        for (int k = j+1; k < n; k++) {
          for (int l = k+1; l < n; l++) {
            if (a[i] == a[j] && a[j] == a[k] && a[k] == a[l]) {
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
n = int(input())
a = []
for i in range(n):
    a.append(int(input()))
ans = 0
for i in range(n):
    for j in range(i+1,n):
        for k in range(j+1,n):
            for l in range(k+1,n):
                if a[i] == a[j] and a[j] == a[k] and a[k] == a[l]:
                    ans += 1
print(ans)
```

## 3528. 
Translate the following java code to python and enclose your solution inside ```python```:
```
import java.util.*;

public class p03528 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int[] a = new int[n];
    for (int i = 0; i < n; i++) {
      a[i] = sc.nextInt();
    }
    int ans = 0;
    for (int i = 0; i < n; i++) {
      for (int j = i+1; j < n; j++) {
        for (int k = j+1; k < n; k++) {
          for (int l = k+1; l < n; l++) {
            for (int m = l+1; m < n; m++) {
              if (a[i] == a[j] && a[j] == a[k] && a[k] == a[l] && a[l] == a[m]) {
                ans++;
              }
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
n = int(input())
a = []
for i in range(n):
    a.append(int(input()))
ans = 0
for i in range(n):
    for j in range(i+1,n):
        for k in range(j+1,n):
            for l in range(k+1,n):
                for m in range(l+1,n):
                    if a[i] == a[j] and a[j] == a[k] and a[k] == a[l] and a[l] == a[m]:
                        ans += 1
print(ans)
```

## 3529. 
Translate the following java code to python and enclose your solution inside ```python```:
```
import java.util.*;

public class p03529 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int[] a = new int[n];
    for (int i = 0; i < n; i++) {
      a[i] = sc.nextInt();
    }
    int ans = 0;
    for (int i = 0; i < n; i++) {
      for (int j = i+1; j < n; j++) {
        for (int k = j+1; k < n; k++) {
          for (int l = k+1; l < n; l++) {
            for (int m = l+1; m < n; m++) {
              for (int o = m+1; o < n; o++) {
                if (a[i] == a[j] && a[j] == a[k] && a[k] == a[l] && a[l] == a[m] && a[m] == a[o]) {
                  ans++;
                }
              }
            }
          }
        }
      }
    }
    System.out.println(ans);
  }
