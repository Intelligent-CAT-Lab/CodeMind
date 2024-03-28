
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int x = sc.nextInt();
        if (x == 1 || x == 2 * N - 1) {
            if (N != 1) {
                System.out.println("No");
                return;
            } else {
                System.out.println("Yes");
                System.out.println(1);
                return;
            }
        }
        boolean smaller = true;
        if (x > N) {
            smaller = false;
            x = 2 * N - x;
        }
        int[] ans = new int[2 * N - 1];
        for (int i = 0; i < 2 * N - 1; i++) {
            if (i < 2 * N - 1 - x) {
                ans[i] = 2 * N - 1 - i;
            } else {
                ans[i] = i - 2 * N + 1 + x;
            }
        }
        if (!smaller) {
            for (int i = 0; i < 2 * N - 1; i++) {
                ans[i] = 2 * N - ans[i];
            }
        }
        System.out.println("Yes");
        for (int i = 0; i < 2 * N - 1; i++) {
            System.out.println(ans[i]);
        }
    }
}
```

## 10. 1000000007

### 10.1. Problem

[1000000007](https://atcoder.jp/contests/abc173/tasks/abc173_e)

### 10.2. Solution

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();
        long[] A = new long[N];
        for (int i = 0; i < N; i++) {
            A[i] = sc.nextLong();
        }
        long ans = 1;
        int mod = 1000000007;
        int cnt = 0;
        for (int i = 0; i < N; i++) {
            if (A[i] < 0) {
                cnt++;
            }
        }
        if (cnt % 2 == 0) {
            for (int i = 0; i < K; i++) {
                ans = (ans * A[i]) % mod;
            }
        } else {
            if (cnt == N) {
                for (int i = 0; i < K; i++) {
                    ans = (ans * A[i]) % mod;
                }
            } else {
                long max = 0;
                long min = 0;
                for (int i = 0; i < N; i++) {
                    if (A[i] > max) {
                        max = A[i];
                    }
                    if (A[i] < min) {
                        min = A[i];
                    }
                }
                if (K % 2 == 0) {
                    for (int i = 0; i < K; i++) {
                        ans = (ans * A[i]) % mod;
                    }
                } else {
                    if (max < 0) {
                        for (int i = 0; i < K - 1; i++) {
                            ans = (ans * A[i]) % mod;
                        }
                        ans = (ans * min) % mod;
                    } else {
                        for (int i = 0; i < K - 1; i++) {
                            ans = (ans * A[i]) % mod;
                        }
                        ans = (ans * max) % mod;
                    }
                }
            }
        }
        System.out.println(ans);
    }
}
```

## 11. 1000000007

### 11.1. Problem

[1000000007](https://atcoder.jp/contests/abc173/tasks/abc173_f)

### 11.2. Solution

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] p = new int[N - 1];
        for (int i = 0; i < N - 1; i++) {
            p[i] = sc.nextInt();
        }
        int mod = 998244353;
        long ans = 0;
        for (int i = 0; i < N - 1; i++) {
            ans = (ans + (N - p[i]) * (p[i] - 1) / 2) % mod;
        }
        System.out.println(ans);
    }
}
```
  }
        }
        System.out.println(ans);
    }
}
```

## 10. 1000000007

### 10.1. Problem

[1000000007](https://atcoder.jp/contests/abc173/tasks/abc173_e)

### 10.2. Solution

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();
        long[] A = new long[N];
        for (int i = 0; i < N; i++) {
            A[i] = sc.nextLong();
        }
        long ans = 1;
        int mod = 1000000007;
        int cnt = 0;
        for (int i = 0; i < N; i++) {
            if (A[i] < 0) {
                cnt++;
            }
        }
        if (cnt % 2 == 0) {
            for (int i = 0; i < K; i++) {
                ans = (ans * A[i]) % mod;
            }
        } else {
            if (cnt == N) {
                for (int i = 0; i < K; i++) {
                    ans = (ans * A[i]) % mod;
                }
            } else {
                long max = 0;
                long min = 0;
                for (int i = 0; i < N; i++) {
                    if (A[i] > max) {
                        max = A[i];
                    }
                    if (A[i] < min) {
                        min = A[i];
                    }
                }
                if (K % 2 == 0) {
                    for (int i = 0; i < K; i++) {
                        ans = (ans * A[i]) % mod;
                    }
                } else {
                    if (max < 0) {
                        for (int i = 0; i < K - 1; i++) {
                            ans = (ans * A[i]) % mod;
                        }
                        ans = (ans * min) % mod;
                    } else {
                        for (int i = 0; i < K - 1; i++) {
                            ans = (ans * A[i]) % mod;
                        }
                        ans = (ans * max) % mod;
                    }
                }
            }
        }
        System.out.println(ans);
    }
}
```

## 11. 1000000007

### 11.1. Problem

[1000000007](https://atcoder.jp/contests/abc173/tasks/abc173_f)

### 
