
```java
import java.util.*;
import java.math.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        int n = 512;
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            BigInteger val = BigInteger.valueOf(7 + i).factorial().divide(BigInteger.valueOf(i).factorial()).divide(BigInteger.valueOf(7).factorial());
            a[i] = val.intValue();
        }
        int cnt = 600 * 7;
        String[] ans = new String[n];
        for (int i = 0; i < n; i++) {
            ans[i] = "FESTIVA";
        }
        for (int i = 0; i < n; i++) {
            ans[i] += "L".repeat(k / a[i]);
            k %= a[i];
        }
        for (int i = n - 1; i >= 0; i--) {
            System.out.print(ans[i]);
        }
    }
}
```

## 2. 
```
import sys
input = sys.stdin.readline

n = int(input())
a = list(map(int, input().split()))

ans = 0
for i in range(n):
    for j in range(i + 1, n):
        for k in range(j + 1, n):
            if a[i] == a[j] + a[k]:
                ans += 1
print(ans)
```

java code:
```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        int ans = 0;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                for (int k = j + 1; k < n; k++) {
                    if (a[i] == a[j] + a[k]) {
                        ans++;
                    }
                }
            }
        }
        System.out.println(ans);
    }
}
```

## 3. 
```
import sys
input = sys.stdin.readline

n = int(input())
a = list(map(int, input().split()))

ans = 0
for i in range(n):
    for j in range(i + 1, n):
        for k in range(j + 1, n):
            if a[i] == a[j] + a[k]:
                ans += 1
print(ans)
```

java code:
```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        int ans = 0;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                for (int k = j + 1; k < n; k++) {
                    if (a[i] == a[j] + a[k]) {
                        ans++;
                    }
                }
            }
        }
        System.out.println(ans);
    }
}
```

## 4. 
```
import sys
input = sys.stdin.readline

n = int(input())
a = list(map(int, input().split()))

ans = 0
for i in range(n):
    for j in range(i + 1, n):
        for k in range(j + 1, n):
            if a[i] == a[j] + a[k]:
                ans += 1
print(ans)
```

java code:
```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        int ans = 0;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                for (int k = j + 1; k < n; k++) {
                    if (a[i] == a[j] + a[k]) {
                        ans++;
                    }
                }
            }
        }
        System.out.println(ans);
    }
}
```

## 5. 
```
import sys
input = sys.stdin.readline

n = int(input())
a = list(map(int, input().split()))

ans = 0
for i in range(n):
    for j in range(i + 1, n):
        for k in range(j + 1, n):
            if a[i] == a[j] + a[k]:
                ans += 1
print(ans)
```

java code:
```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        int ans = 0;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                for (int k = j + 1; k < n; k++) {
                    if (a[i] == a[j] + a[k]) {
                        ans++;
                    }
                }
            }
        }
        System.out.println(ans);
    }
}
```

## 6. 
```
import sys
input = sys.stdin.readline

n = int(input())
a = list(map(int, input().split()))

ans = 0
for i in range(n):
    for j in range(i + 1, n):
        for k in range(j + 1, n):
            if a[i] == a[j] + a[k]:
                ans += 1
print(ans)
```

java code:
```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        int ans = 0;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                for (int k = j + 1; k < n; k++) {
                    if (a[i] == a[j] + a[k]) {
                        ans++;
                    }
                }
            }
        }
        System.out.println(ans);
    }
}
```

## 7. 
```
import sys
input = sys.stdin.readline

n = int(input())
a = list(map(int, input().split()))

ans = 0
for i in range(n):
    for j in range(i + 1, n):
        for k in range(j + 1, n):
            if a[i
