
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();
        int P = 1000000007;
        int[] X = new int[K + 1];
        int ans = 0;
        for (int i = 1; i <= K; i++) {
            X[i] += i;
            for (int j = i * 2; j <= K; j += i) {
                X[j] -= X[i];
            }
            ans += X[i] * (int) Math.pow(K / i, N) % P;
        }
        System.out.println(ans % P);
    }
}
```


```

java code:
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();
        int P = 1000000007;
        int[] X = new int[K + 1];
        int ans = 0;
        for (int i = 1; i <= K; i++) {
            X[i] += i;
            for (int j = i * 2; j <= K; j += i) {
                X[j] -= X[i];
            }
            ans += X[i] * (int) Math.pow(K / i, N) % P;
        }
        System.out.println(ans % P);
    }
}
```
/README.md
# Codeforces-Solutions

## 1360A - Minimal Square

```
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int ans = Math.max(a, b) * Math.max(a, b);
            if (a != b) {
                ans = Math.min(ans, Math.max(a, b) * Math.max(a, b));
            }
            System.out.println(ans);
        }
    }
}
```

## 1360B - Honest Coach

```
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int[] a = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
            }
            Arrays.sort(a);
            int ans = Integer.MAX_VALUE;
            for (int i = 1; i < n; i++) {
                ans = Math.min(ans, a[i] - a[i - 1]);
            }
            System.out.println(ans);
        }
    }
}
```

## 1360C - Honest Coach

```
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int[] a = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
            }
            Arrays.sort(a);
            int ans = 0;
            for (int i = 1; i < n; i++) {
                if (a[i] == a[i - 1]) {
                    ans++;
                }
            }
            System.out.println(ans);
        }
    }
}
```

## 1360D - Honest Coach

```
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int[] a = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
            }
            Arrays.sort(a);
            int ans = 0;
            for (int i = 1; i < n; i++) {
                if (a[i] == a[i - 1]) {
                    ans++;
                }
            }
            System.out.println(ans);
        }
    }
}
```

## 1360E - Honest Coach

```
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int[] a = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
            }
            Arrays.sort(a);
            int ans = 0;
            for (int i = 1; i < n; i++) {
                if (a[i] == a[i - 1]) {
                    ans++;
                }
            }
            System.out.println(ans);
        }
    }
}
```

## 1360F - Honest Coach

```
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int[] a = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
            }
            Arrays.sort(a);
            int ans = 0;
            for (int i = 1; i < n; i++) {
                if (a[i] == a[i - 1]) {
                    ans++;
                }
            }
            System.out.println(ans);
        }
    }
}
```

## 1360G - Honest Coach

```
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int[] a = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
            }
            Arrays.sort(a);
            int ans = 0;
            for (int i = 1; i < n; i++) {
                if (a[i] == a[i - 1]) {
                    ans++;
                }
            }
            System.out.println(ans);
        }
    }
}
```

## 1360H - Honest Coach

```
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int[] a = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
            }
            Arrays.sort(a);
            int
