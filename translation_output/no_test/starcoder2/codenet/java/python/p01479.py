
```
import re

line = input().replace("egg", "e").replace("chicken", "c")
line = re.sub(r"ee", "e e", line)
line = re.sub(r"cc", "c c", line)
strs = line.split(" ")
max = 0
ans = ""
for i in range(len(strs)):
    if max < len(strs[i]):
        max = len(strs[i])
        ans = "egg" if strs[i][max - 1] == 'e' else "chicken"
print(ans)
```

## 01480

Translate the following java code to python and enclose your solution inside ```python```:
```
import java.util.Arrays;
import java.util.Scanner;

public class p01480 {
    static final int MAX = 1000000;

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();
        int a[] = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        Arrays.sort(a);
        int ans = 0;
        for (int i = 0; i < n; i++) {
            if (a[i] >= m) {
                ans = a[i];
                break;
            }
        }
        System.out.println(ans);
    }
}
```

python code:
```
n, m = map(int, input().split())
a = list(map(int, input().split()))
a.sort()
ans = 0
for i in range(n):
    if a[i] >= m:
        ans = a[i]
        break
print(ans)
```

## 01481

Translate the following java code to python and enclose your solution inside ```python```:
```
import java.util.Arrays;
import java.util.Scanner;

public class p01481 {
    static final int MAX = 1000000;

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();
        int a[] = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        Arrays.sort(a);
        int ans = 0;
        for (int i = 0; i < n; i++) {
            if (a[i] >= m) {
                ans = a[i];
                break;
            }
        }
        System.out.println(ans);
    }
}
```

python code:
```
n, m = map(int, input().split())
a = list(map(int, input().split()))
a.sort()
ans = 0
for i in range(n):
    if a[i] >= m:
        ans = a[i]
        break
print(ans)
```

## 01482

Translate the following java code to python and enclose your solution inside ```python```:
```
import java.util.Arrays;
import java.util.Scanner;

public class p01482 {
    static final int MAX = 1000000;

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();
        int a[] = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        Arrays.sort(a);
        int ans = 0;
        for (int i = 0; i < n; i++) {
            if (a[i] >= m) {
                ans = a[i];
                break;
            }
        }
        System.out.println(ans);
    }
}
```

python code:
```
n, m = map(int, input().split())
a = list(map(int, input().split()))
a.sort()
ans = 0
for i in range(n):
    if a[i] >= m:
        ans = a[i]
        break
print(ans)
```

## 01483

Translate the following java code to python and enclose your solution inside ```python```:
```
import java.util.Arrays;
import java.util.Scanner;

public class p01483 {
    static final int MAX = 1000000;

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();
        int a[] = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        Arrays.sort(a);
        int ans = 0;
        for (int i = 0; i < n; i++) {
            if (a[i] >= m) {
                ans = a[i];
                break;
            }
        }
        System.out.println(ans);
    }
}
```

python code:
```
n, m = map(int, input().split())
a = list(map(int, input().split()))
a.sort()
ans = 0
for i in range(n):
    if a[i] >= m:
        ans = a[i]
        break
print(ans)
```

## 01484

Translate the following java code to python and enclose your solution inside ```python```:
```
import java.util.Arrays;
import java.util.Scanner;

public class p01484 {
    static final int MAX = 1000000;

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();
        int a[] = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        Arrays.sort(a);
        int ans = 0;
        for (int i = 0; i < n; i++) {
            if (a[i] >= m) {
                ans = a[i];
                break;
            }
        }
        System.out.println(ans);
    }
}
```

python code:
```
n, m = map(int, input().split())
a = list(map(int, input().split()))
a.sort()
ans = 0
for i in range(n):
    if a[i] >= m:
        ans = a[i]
        break
print(ans)
```

## 01485

Translate the following java code to python and enclose your solution inside ```python```:
```
import java.util.Arrays;
import java.util.Scanner;

public class p01485 {
    static final int MAX = 1000000;

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();
        int a[] = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        Arrays.sort(a);
        int ans = 
