
```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int n_k = n / k;
        int n_mod_k = n % k;

        int mod_k(int x) {
            int res = n_k;
            if (x != 0 && x <= n_mod_k) {
                res += 1;
            } else if (x == 0 && n_mod_k == k) {
                res += 1;
            }
            return res;
        }

        int ans = 0;

        for (int i = 0; i < k; i++) {
            int a_mod = i;
            int b_mod = -i % k;
            int c_mod = -i % k;
            if ((b_mod + c_mod) % k == 0) {
                ans += mod_k(a_mod) * mod_k(b_mod) * mod_k(c_mod);
            }
        }

        System.out.println(ans);
    }
}
```

## 2. 
```
import sys
input = sys.stdin.readline

n = int(input())

a = [int(x) for x in input().split()]

ans = 0

for i in range(n):
    for j in range(i+1, n):
        for k in range(j+1, n):
            if a[i] + a[j] + a[k] == 0:
                ans += 1

print(ans)
```

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
                    if (a[i] + a[j] + a[k] == 0) {
                        ans += 1;
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

a = [int(x) for x in input().split()]

ans = 0

for i in range(n):
    for j in range(i+1, n):
        for k in range(j+1, n):
            for l in range(k+1, n):
                if a[i] + a[j] + a[k] + a[l] == 0:
                    ans += 1

print(ans)
```

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
                    for (int l = k + 1; l < n; l++) {
                        if (a[i] + a[j] + a[k] + a[l] == 0) {
                            ans += 1;
                        }
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

a = [int(x) for x in input().split()]

ans = 0

for i in range(n):
    for j in range(i+1, n):
        for k in range(j+1, n):
            for l in range(k+1, n):
                for m in range(l+1, n):
                    if a[i] + a[j] + a[k] + a[l] + a[m] == 0:
                        ans += 1

print(ans)
```

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
                    for (int l = k + 1; l < n; l++) {
                        for (int m = l + 1; m < n; m++) {
                            if (a[i] + a[j] + a[k] + a[l] + a[m] == 0) {
                                ans += 1;
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

## 5. 
```
import sys
input = sys.stdin.readline

n = int(input())

a = [int(x) for x in input().split()]

ans = 0

for i in range(n):
    for j in range(i+1, n):
        for k in range(j+1, n):
            for l in range(k+1, n):
                for m in range(l+1, n):
                    for o in range(m+1, n):
                        if a[i] + a[j] + a[k] + a[l] + a[m] + a[o] == 0:
                            ans += 1

print(ans)
```

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
                    for (int l = k + 1; l < n; l++) {
                        for (int m = l + 1; m < n; m++) {
                            for (int o = m + 1; o < n; o++) {
                                if (a[i] + a[j] + a[k] + a[l] + a[m] + a[o] == 0) {
                                    ans += 1;
                                }
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

## 6. 
```
import sys
input = sys.stdin.readline

n = int(input())

a = [int(x) for x in input().split()]

ans = 0

for i in range(n):
    for j
